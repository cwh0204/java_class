package day15;
/*	
 *  작성일 : 2025-09-08
 *	작성자 : 최원효
 *	설명 : 18장.추상 클래스와 final.pdf No.21 2번문제)
 *		메서드를 final로 선언하면 더 이상 자손에서 오버라이딩을 허용하지 않는다.
 *
 */

class A{
	public final int method01() {
		return 0;
	}
}

class B extends A{
	@Override
	public int method01() {
		return 100;
	}
}
public class Ex18_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		System.out.println(a.method01());//업캐스팅 이후 오버라이딩 한 메서드 호출
	}
}
