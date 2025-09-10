package day18;

import java.util.Enumeration;
import java.util.Vector;

/*
 * 작성일 : 2025-09-10
 * 작성자 : 최원효
 * 설명 : java.util 패키지의 컬렉션 클래스 Stack의 특징)
 * 
 */
public class ListEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vec = new Vector();
		
		for(int i=1; i<=7; i++) {
			vec.add(i*10);
		}
		
		Enumeration enu2 = vec.elements();
		while(enu2.hasMoreElements()) {
			System.out.println(enu2.nextElement());
		}
	}
}
