package day01;
/*
 * 	작성일 : 2025-08-05
 *	작성자 : 최원효
 * 	설명: 자바의 실수 숫자 자료형(타입) 종류: 
 * 	float -> 크기는 4바이트 이고, 저장되는 정밀도는 7자리이다. 값뒤에 접미사 f or F가 붙는다. 접미사는 생략 불가
 * 	double -> 크기는 8바이트 이고, 저장되는 정밀도는 15자리이다. 값뒤에 접미사 d or D가 붙는다. 자바의 기본 실수 숫자 타입에 해당된다. 그러므로
 * 	접미사는 생략가능하다.
 */

public class DataType04 {

	public static void main(String[] args) {
		
		float a = 10.3f;
		float b = 100.3f;
		double c = 50.3d;
		double d = 100.3D;
		double e = 10.3;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		System.out.println("e = "+e);
	}

}
