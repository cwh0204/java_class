package day02;
/*
 * 	작성일 : 2025-08-07
 *	작성자 : 최원효
 * 	설명: 비트 연산자
 */
public class ConvertEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 20;
		int c;
		
		c = a & b;
		System.out.println(a+" & "+b+" = " + c);
		
		c = a | b;
		System.out.println(a+" | "+b+" = " + c);
		
		c = a ^ b;
		System.out.println(a+" ^ "+b+" = " + c);
		
		c = ~a; // 비트 전환, 1이면 0 반대로 0이면 1
		System.out.println("~a : " + c);
		
	}

}
