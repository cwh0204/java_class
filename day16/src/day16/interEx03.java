package day16;
/*
 * 작성일 : 2025-09-08
 * 작성자 : 최원효
 * 설명 : 인터페이스는 다중 상속을 지원한다
 */

interface IHello03{
	void sayHello(String name);
}
interface IGoodBye03{
	void sayGoodBye(String name);
}

class subClass03 implements IHello03,IGoodBye03{

	@Override
	public void sayGoodBye(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+"잘가~!!");
	}

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+"안녕~!!");
	}
	
}

public class interEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subClass03 sb03 = new subClass03();
		sb03.sayGoodBye("홍길동");
		sb03.sayHello("홍길동");
	}

}
