package net.daum.controller;

import java.util.List;
import java.util.Scanner;

import net.daum.dto.DeptDTO;
import net.daum.service.OracleMyBatisService;

/*  서비스 흐름은 컨트롤러 ↔ 서비스 ↔ DAO ↔ MyBatis 매퍼태그 해당 아이디를 호출해서 쿼리문 수행
 *  실제 코드 작업은 서비스 흐름의 반대로 하는 것이 좋다.
 *  
 *  패키지 정리)
 *   net.daum.controller -> 자바 애플리케이션 프로그램 개발에서 최초 시작지점인 main() 정적메서드가 포함된 클래스가 있는 곳
 *   net.daum.service -> 컨트롤러와 DAO사이 중간 매개체 역할을 하는 *Service 클래스가 들어가는 곳
 *   net.daum.dao ->  DAO (Data Access Object) 실제로 데이터베이스(DB)에 접근하여 CRUD(Create(데이터 저장) -> insert 쿼리문 ,
 *    Read(데이터 조회) -> select 쿼리문 , Update, Delete) 작업을 수행하는 곳 
 *   net.daum.mappers.mybatis -> sql문을 담고 있는 mybatis 매퍼태그 파일인 Mapper.xml 파일이 위치한 곳, 트랜잭션 설정과 커넥션 풀 
 *   그리고 데이터베이스 연결 정보와 SQL문을 담고 있는 MyBatis 매퍼태그 파일 경로가 설정된  Configuration.xml 파일이 들어간 경로
 *   net.daum.dto -> 람복 라이브러리를 사용한 데이터 저장빈 클래스가 들어간 곳
 *   net.daum.config -> Configuration.xml 파일을 읽어와 mybatis 쿼리문 실행 객체 SqlSession을 반환하는 정적메서드인 getSqlSession()
 *   가 있는 MyBatisSessionFactory 클래스 파일이 있는 곳
 */
public class OracleMyBatisMain {
	private Scanner scan = new Scanner(System.in);
	OracleMyBatisService service = new OracleMyBatisService();
	
	//메서드 정의 -> 부서목록을 가져오는 메서드
	public void list() {
		System.out.println();
		System.out.println("[부서 목록]");
		System.out.println("========================================");
		System.out.printf("%-6s%-12s%-16s\n","부서번호","부서명","부서지역");
		/*
		 * %-6s에서 %s는 문자열 출력 형태지시자이다. -는 왼쪽정렬, 6은 최소 출력 너비 6칸, 결국 %-6s 는 문자열을 왼쪽정렬하고
		 * 전체 너비를 6칸으로 맞추라는 의미이다. 빈칸이 남으면 오른쪽에 공백이 들어간다.
		 */
		System.out.println("----------------------------------");
		List<DeptDTO> dlist = this.service.selectAll();
		
		if(dlist != null && dlist.size() > 0) {
			//1부터 한다.
			//향상된 확장 for반복문
			for(DeptDTO d: dlist) {
				System.out.printf("%-6s%-12s%-16s\n",d.getDeptno(),d.getDname(),d.getLoc());
			}
		}else {
			System.out.println("부서 목록이 없습니다!");
		}
		
		mainMenu(); //메인 메뉴 메서드 호출
	}
	
	public void mainMenu() {
		for(;;) {
			System.out.println();//개행 -> 줄바꿈
			System.out.println("-----------------------------");
			System.out.println("메인 메뉴 : 1.Create | 2.Read | 3.Clear | 4.Exit");
			System.out.println("메뉴 선택:");
			String menuNo = scan.nextLine();
			
			//switch~case 다중선택문으로 분기
			switch(menuNo) {
			case "1" : create(); break; //부서정보 추가
			case "2" : read(); break;
			case "3" : clear(); break;
			case "4" : exit(); break;
			}
		}
	}

	private void read() {
		// TODO Auto-generated method stub
		
		DeptDTO dept = new DeptDTO();
		DeptDTO redept = new DeptDTO();
		System.out.println("부서번호를 입력해주세요");
		dept.setDeptno(Integer.parseInt(scan.nextLine()));
		redept = service.selectDept(dept);
		if(redept.getDname() != null) {
			System.out.println(redept.getDeptno()+redept.getDname()+redept.getLoc());
			System.out.print("1번 삭제: 2번 수정");
			String a = scan.nextLine();
			System.out.println(a);
			if(a.equals("1")) {
				service.delDept(redept);
			}else {
				System.out.print("부서명을 입력하세요");
				redept.setDname(scan.nextLine());
				System.out.println("위치를 입력하세요");
				redept.setLoc(scan.nextLine());
				service.upDept(redept);
			}
		}
	}
	
	public void create() {
		// TODO Auto-generated method stub
		DeptDTO dept = new DeptDTO();
		DeptDTO redept = new DeptDTO();
		System.out.print("번호 입력");
		dept.setDeptno(Integer.parseInt(scan.nextLine()));
		redept = service.selectDept(dept);
		if(redept != null) {
			System.out.println("이미 존재하는 회원번호입니다!");
		}else {
			System.out.print("이름 입력");
			dept.setDname(scan.nextLine());
			System.out.print("위치 입력");
			dept.setLoc(scan.nextLine());
			service.insertDept(dept);
		}
	}
	
	
	private void clear() {
		// TODO Auto-generated method stub
		System.out.println("[부서전체 삭제]");
		System.out.println("========================");
		System.out.println("보조 메뉴: 1.OK || 2. Cancel");
		System.out.println("메뉴 선택>>");
		String menuNo = scan.nextLine();
		List<DeptDTO> dlist = this.service.selectAll();
		if(menuNo.equals("1")) {
			if(dlist != null && dlist.size() > 0) {
				for(DeptDTO d: dlist) {
					service.delDept(d);
				}
			}else {
				System.out.println("부서 목록이 없습니다!");
			}
		}else {
			list();
		}
	}
	
	//프로그램 종료
	public void exit() {
		System.out.println("*** 부서 프로그램 종료 ***");
		System.exit(0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleMyBatisMain oracleMyBatis = new OracleMyBatisMain();
		oracleMyBatis.list();
	}
}
