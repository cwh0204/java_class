package day24;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class IoEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileNmae;
		String buf;
		
		Reader myIn = new InputStreamReader(System.in);//업캐스팅
		
		/*
		 * 	1. System.in은 키보드 입력장치와 연결
		 *  2. InputStreamReader는 읽어들인 바이트 문자로 변환
		 *  3. Reader는 문자 입력스트림의 최상위 추상클래스
		 */
		
		BufferedReader keyBr = new BufferedReader(myIn);
		//BufferedReader는 읽어들인 문자를 버퍼링 한 다음 효율적으로 읽어들임
		
		try {
			System.out.print("파일명 입력(./src/day24/IoEx09.java)>>");
			fileNmae = keyBr.readLine();
			
			FileReader fr = new FileReader(fileNmae);
			
			BufferedReader fileBr = new BufferedReader(fr);
			
			while((buf = fileBr.readLine()) != null) {
				System.out.println(buf);
			}
			fileBr.close();
		}catch(IOException ie)
		{
			ie.printStackTrace();
		}finally {
			try {
				if(keyBr != null) keyBr.close();
				if(myIn != null) myIn.close();
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
