package day16;
/*
 *  작성일 : 2025-09-09
 *  작성자 : 최원효
 *  설명 : 두 부모 인터페이스의 다폴트 메서드 이름이 동일한 경우 다중 상속한 자손 클래스에서 이 디폴트 메서드를 오버라이딩을 해야한다.
 */

interface InterA{
	default void display() {
		System.out.println("InterA 디폴트 메서드");
	}
	static void staticMethod() {
		System.out.println("InterA 정적메서드");//자바 8에서 인터페이스에 정적메서드가 올 수 있게 되었다.
	}
}

interface InterB{
	default void display() {
		System.out.println("InterB 디폴트 메서드");
	}
}

class ChildClass10 implements InterA,InterB{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("오버라이딩 한 디폴트 메서드");
	}

}

public class interEx10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass10 child10 = new ChildClass10();
		child10.display();

		InterA.staticMethod();
	}
}
