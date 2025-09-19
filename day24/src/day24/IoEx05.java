package day24;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 	java.io 패키지의 FileInputStream 클래스 특징)
 * 	1. FileInputStream 생성자 인자값으로 주어진 File 객체나 주어진 파일경로의 파일로 부터 바이트 단위로 데이터를 읽어오기
 */

public class IoEx05 {
	public static void main(String[] args) {
		int data = 0;
		
		String path = "./src/day24/IoEx05.java";
		
		try {
			FileInputStream fis = new FileInputStream(path);
			
			while((data = fis.read()) != -1) {
				System.out.write((char)data);
			}
		}catch (IOException ie) {
			// TODO: handle exception
			ie.printStackTrace();
		}
	}
} 
