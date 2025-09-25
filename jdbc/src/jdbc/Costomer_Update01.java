package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/*	PreparedStatement JDBC 쿼리문 수행하는 api를 사용해서 고객 정보를 저장되게 하는 코드를 작성한다. 

	insert,update,delete SQL문일때는 executeUpdate()메서드로 해당 쿼리문을 수행하고 반환값은 해당 쿼리문 수행후 성공한 레코드 
	행의 개수가 반환

	1. Class.forName(driver) -> JDBC드라이버 로드
	2. Connection con = DriverManager.getConnection(url, user, password); -> db접속주소,사용자,비번으로 DB연결 Connection 생성
	3. PreparedStatement pt=con.prepareStatement(sql); -> 쿼리문을 미리 컴파일해서 수행할 pt생성(보안이 좋고 실행속도가 빠르다. 실무에서
	 대부분 이 방법을 사용한다.)
	4. pt.set컬럼타입(1,저장될 값); 으로 해당 update 테이블명 set 컬럼명 = 변경할 레코드값, 컬럼명(필드명)=변경할 레코드값 ... 
	   where 조건절; values(?,...); SQL문에서 저장될 임의의 ?값
	   순번에서 첫번째 물음표에 해당 컬럼타입으로 저장할 값을 저장한다.
	5. 쿼리문 ?순번대로 모든 값을 저장한 다음 int re=pt.executeUpdate(); 매서드로 해당 저장 쿼리문을 수행한다. 
	저장 쿼리문 수행후 성공한 레코드 행의 개수 주로 정수값 1을 반환
	
*/

/*
 * 스캐너를 사용해서 고객번호를 입력받아 오라클 customer 테이블로 부터 검색한 다음 해당 고객번호가 있다면 수정할 고객번호, 고객 폰번호, 고객 이메일을
 * 입력받아서 고객 변호를 기준으로 수정되게 하고 없다면 유효성 검증(Valibate) 경고 메시지를 띄우는 고객정보수정 소스)
 * 
 */
public class Costomer_Update01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      String driver = "oracle.jdbc.OracleDriver";
	      String url = "jdbc:oracle:thin:@localhost:1521:xe";
	      String user = "week";
	      String password = "week";
	      
	      Connection con = null;
	      PreparedStatement pt = null;
	      ResultSet rs = null;
	      String sql = null;
	      
	      
	      try {
	    	  Class.forName(driver);
	    	  con = DriverManager.getConnection(url, user, password);
	    	  
	    	  Scanner scan = new Scanner(System.in);
	    	  System.out.println(">>> 고객 정보 수정 <<<");
	    	  System.out.print("기준이 되는 고객번호 입력>>");
	    	  
	    	  int cus_no = Integer.parseInt(scan.nextLine());
	    	  sql = "select cus_no from customer where cus_no=?";//고객번호를 기준으로 오라클DB로 부터 고객번호를 검색
	    	  pt = con.prepareStatement(sql);
	    	  pt.setInt(1, cus_no);
	    	  rs = pt.executeQuery();
	    	  
	    	  if(rs.next()) {
	    		  System.out.print("수정할 고객이름 입력>>");
	    		  String cus_name = scan.nextLine();
	    		  System.out.print("수정할 고객 폰번호 입력>>");
	    		  String cus_phone = scan.nextLine();
	    		  System.out.print("수정할 고객 이메일번호 입력>>");
	    		  String cus_email = scan.nextLine();
	    		  
	    		  sql = "update customer set cus_name = ?,cus_phone = ?,cus_email = ? where cus_no=?";
	    		  
	    		  pt = con.prepareStatement(sql);
	    		  pt.setString(1, cus_name);
	    		  pt.setString(2, cus_phone);
	    		  pt.setString(3, cus_email);
	    		  pt.setInt(4, cus_no);
	    		  
	    		  int re = pt.executeUpdate();
	    		  
	    		  if(re == 1) {
	    			  System.out.println("고객정보 수정에 성공했습니다");
	    		  }
	    		  
	    	  }else {
	    		  System.out.println("검색된 고객번호가 없습니다. 올바른 고객번호를 입력하세요!");
	    	  }
	      }catch(Exception e) {
	    	  e.printStackTrace();
	      }finally {
	    	  try {
	    		  if(rs != null);
	    		  if(pt != null);
	    		  if(con != null);
	    		  
	    	  }catch (Exception e) {
	    		  e.printStackTrace();
			}
	      }
	}
}
