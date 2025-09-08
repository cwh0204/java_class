package day16;
/*
 * 작성일 : 2025-09-08
 * 작성자 : 최원효
 * 설명 : 인터페이스 특징)
 * 	1. 인터페이스는 interface 예약어로 정의하고 implements 키워드로 자손 클래스에서 구현 상속받는다.
 * 	2. 자손클래스에서 하나 이상 부모 인터페이스로 부터 다중 상속을 받을 수 있다.
 *  3. 인터페이스에 오는 추상메서드는 public abstract 키워드로 정의한다. 물론 이 예약어는 생략 가능하다.
 *  4. 부모 안터페이스를 구현 상속받은 자손클래스에서 부모의 모든 추상메서드를 반드시 오버라이딩을 해야하는 강제성이 부여된다. 그래야만 자손클래스
 *  객체 생성이 가능하다.
 */
interface IHello01{//최초 작성한 인터페이스 부모는 존재하지 않는다. -> 명시적으로 어떤 부모 인터페이스도 상속하지 않았기 때문에 -> 부모 인터페이스는 없다.
	public abstract void sayHello(String name); //public abstract은 생략가능함. 추상메서드 정의. 추상메서드는 {}가 없고 실행 문장이 없고 호출이 불가능
}
class Hello01 implements IHello01{
	
	@Override
	public void sayHello(String name) {
		System.out.println(name+"안녕!");
	}
}
public class interEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IHello01 ih;
		ih = new Hello01();
		ih.sayHello("홍길동");
	}

}
