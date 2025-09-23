package day24;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 * 	객체 직렬화를 위해서 설계한 Customer.java를 활용해서 객체단위로 읽어오기.
 */
public class IoEx11 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("./src/day24/output.txt");
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			Customer cus = (Customer)ois.readObject();
			System.out.println(cus);
			
		}catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		}catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}
