package day15;
/*	
 *  작성일 : 2025-09-05
 *	작성자 : 최원효
 *	설명 : 부모 추상클래스를 상속받은 자손 클래스에서 부모의 추상메서드를 오버라이딩을 하지 않으면 자손도 추상클래스 이어야 한다. 언젠가는 자손에서 부모의 모든 추상메서드를
 *		  오버라이딩 해야 자손 클래스로 객체 생성이 가능하다.
 */

abstract class Abs05{
	abstract void m01();
	
	void m02() {
		System.out.println("일반 메서드 m02()");
	}
}

abstract class Abs06 extends Abs05{
	void m03() {
		System.out.println("일반 메서드 m03()");
	}
}

class SubClass04 extends Abs06{

	@Override
	void m01() {
		// TODO Auto-generated method stub
		System.out.println("부모의 추상메서드가 일반 메서드로 오버라이딩이 됨");
	}
	
}

public class AbsEx04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass04 sub = new SubClass04();
		sub.m01(); //자손에서 오버라이딩 한 메서드 호출
		sub.m02(); //상속받아서 호출
		sub.m03(); //상속받아서 호출
	}
}

