package day16;
/*
 * 작성일 : 2025-09-08
 * 작성자 : 최원효
 * 설명 : 인터페이스는 다중 상속을 지원한다
 * 
 * class 자손클래스 extends 부모클래스 implements 부모인터페이스{
 * 
 * }
 * 부모 클래스와 인터페이스를 자손에서 동시에 상속받는 예)
 */
interface IHello04{
	void hello(String name);//public abstract가 생략된 추상메서드
}

abstract class GoodBye04{
	public abstract void bye(String name);
}

class SubClass04 extends GoodBye04 implements IHello04{

	@Override
	public void hello(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+" 헬로");
	}

	@Override
	public void bye(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+" 바이");
	} //extends 부모클래스 implements 부모인터페이스
	
}

public class interEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass04 gb01 = new SubClass04();
		gb01.bye("홍길동");
		gb01.hello("홍길동");
	}

}
