package day24;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 	객체 직렬화를 위해서 설계한 Customer.java를 활용해서 객체단위로 기록해 본다.
 */
public class IoEx10 {

	public static void main(String[] args) {
		Customer cus = new Customer(7,"홍길동",25,173.7);
		
		try {
			System.out.println(cus.toString());
			FileOutputStream fos = new FileOutputStream("./src/day24/output.txt"); //생성 인자값으로 주어진 파일경로의 파일에 바이트 단위로 기록하기 위한 fos객체생성
			
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(cus);
			
			oos.close();
			fos.close();
		}catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}
