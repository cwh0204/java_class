package day24;

import java.io.File;

/*
 *	java.io 패키지의 File 클래스 api 특징)
 *	1. File클래스를 활용하면 일반 게시판에 파일 첨부 기능이 있는 자료실을 만들 수 있다. 여기서는 이 클래스 하위의 내장 메서드 중 list()에 대해서
 *	알아 본다. 이 메서드 기능은 해당 경로에 있는 파일 목록을 문자열 배열로 반환한다. 
 */
public class IoEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dirFile = new File("./src/day24");//이클립스 계열의 STS개발툴에서는 ./는 현재경로를 의미하는 상대경로인데 인식하는 현재경로는
		//프로젝트 경로인 day24이다.
		String[] fileList = dirFile.list();
		
		for(int i=0; i<fileList.length; i++) {
			System.out.println(fileList[i]);
		}
		System.out.println("\n==============================\n");
		//확장된 for문 
		
		for(String i : fileList) {
			System.out.println(i);
		}
		
		System.out.println("\n==============================\n");
		
		
	}

}
