package day15;
/*	
 *  작성일 : 2025-09-05
 *	작성자 : 최원효
 *	설명 : 1. 추상 클래스는 abstract class 키워드로 정의한다.
 *		  2. 추상 클래스는 new 키워드로 객체 생성을 할 수 없다.
 *
 */
abstract class Abs01{
	int a;
	int b;
	//abstract class 키워드로 추상 클래스 정의
	void num1() {
		
	}
}
public class AbsEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abs01 abs = new Abs();
		//new 키워드로 추상클래스는 객체 생성을 못한다.
	}

}
