package day16;
/*
 * 작성일 : 2025-09-08
 * 작성자 : 최원효
 * 설명 : 인터페이스에서 인터페이스 간 상속은 extends 예약어를 사용한다. 그리고 인터페이스 간 상속도 다중 상속이 가능하다.
 */
interface IHello05{
	void hello(String name); //public abstract이 생략된 추상메서드
}
interface GoodBye05{
	public abstract void bye(String name);
}
interface ITotal extends IHello05, GoodBye05{

	void greeting(String name);
	
}
class SubClass05 implements ITotal{

	@Override
	public void hello(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " 안녕");
	}

	@Override
	public void bye(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " 잘가");
	}

	@Override
	public void greeting(String name) {
		// TODO Auto-generated method stub
		System.out.println(name + " 반가워요");
	}
	
}
public class interEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITotal sub05 = new SubClass05();
		sub05.bye("홍길동");
		sub05.hello("홍길동");
		sub05.greeting("홍길동");
	}

}
