package day24;

import java.io.File;

/*
 * java.io 패키지의 File클래스 하위의 내장메서드 활용)
 */

public class IoEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "./src/day24";
		File dirPath = new File(path);
		String[] fileNames = dirPath.list();
		
		//향상된 확장 for 반복문 사용
		for(String fileName : fileNames) {
			File f = new File(path+"/"+fileName);
			System.out.println("\n=======================\n");
			System.out.println("파일이름 : "+f.getName());
			System.out.println("경로 : "+ f.getPath());
			System.out.println("절대경로 : "+f.getAbsolutePath());
			System.out.println("디렉토리 여부 : "+ f.isDirectory());
			System.out.println("파일 여부 : "+ f.isFile());
			System.out.println("\n=======================\n");
		}
	}
}
