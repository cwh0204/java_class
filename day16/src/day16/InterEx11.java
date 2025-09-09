package day16;
/*
 *  작성일 : 2025-09-09
 *  작성자 : 최원효
 *  설명 : 두 부모 인터페이스의 다폴트 메서드와 부모 클래스의 일반 메서드가 동일한 경우 부모 인터페이스의 디폴트 메서드는 무시되고 부모 클래스의 일반 메서드가
 *  상속된다.
 */
class ParentClass{
	public void display() {
		System.out.println("부모클래스 일반 메서드");
	}
}
interface ParentInter11{
	default void display() {
		System.out.println("부모 인터페이스의 디폴트 메서드");
	}
}
class ChildClass11 extends ParentClass implements ParentInter11{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
	}
}
public class InterEx11 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass11 ch01 = new ChildClass11();
		ch01.display();
	}
}
