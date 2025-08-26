package day10;
/*
 * 	작성일 : 2025-08-26
 *	작성자 : 최원효
 * 	설명 : 자바의 OOP에서 메서드 오버로딩 이란?
 * 		  동일한 같은 클래스 내에서 같은 이름의 메서드를 여러 번 중복해서 정의하는 것을 말한다.
 * 
 *  오버로딩 된 메서드 구분 요건)
 *  1.전달인자(매개변수) 타입(자료형)을 다르게 한다.
 *  2.전달인자 개수를 다르게 한다.
 *
 */

class Mt01{
	int abs(int data) {
		
		if(data < 0) {
			data = -data;
		}
		
		return data;
	}
	
	double abs(double data) {
		
		if(data < 0) {
			data = -data;
		}
		return data;
	}
	
	void pr(int a) {
		System.out.println(a);
	}
	
	void pr(int a, int b) {
		System.out.println(a+"\t"+b);
	}
}

public class MethodEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mt01 m01 = new Mt01();
		
		int result = m01.abs(100);
		System.out.println("-100의 절대값 : "+result);
		System.out.println("-100.3의 절대값 : "+m01.abs(-100.3));
		
		m01.pr(10);
		m01.pr(10, 20);
	}

}
