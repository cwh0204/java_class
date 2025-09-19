package day24;

import java.io.InputStream;
import java.io.OutputStream;

/*
 *  java.io 입출력 패키지의 API인 InputStream,OutputStream을 활용해서 입력문자가 영문단일 소문자 'x'이거나 대문자 'X'이면
 *  while 반복문을 중단한다 
 */
public class IoEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int data = 0;
		InputStream in = System.in;
		OutputStream out = System.out;
		
		System.out.print("문자 입력>>");
		
		try {
			while((data = in.read()) != -1) {
				if(data == 'x' || data == 'X') {
					break;
				}
				out.write((char)data);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
