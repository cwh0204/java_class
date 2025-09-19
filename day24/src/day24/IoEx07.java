package day24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/*
 * 원본 이미지를 복사하는 예제)
 */

public class IoEx07 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("컬러 이미지까지 그대로 복사하는 예제)");
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("원본 이미지 파일명(./src/images/apple.png)");
		String inpuFileName = scan.nextLine();
		
		System.out.println("복사되어질 이미지 파일명(./src/images/apple_copy.png)>>");
		String outputFileName = scan.nextLine();
		
		try(InputStream inputStream = new FileInputStream(inpuFileName);
				OutputStream outputStream = new FileOutputStream(outputFileName);)
		{
			int data;
			while((data = inputStream.read()) != -1) {
				outputStream.write(data);
			}
		}
		
		System.out.println(inpuFileName+"을 (를)"+outputFileName+"으로 이미지를 복사했다.");
	}
}
