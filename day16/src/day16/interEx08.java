package day16;
/*
 * 작성일 : 2025-09-09
 * 작성자 : 최원효
 * 설명 : 클래스 대 클래스 간 직접연결보다는 중간에 인터페이스를 끼워 넣어서 간접 연결하는 방식
 * 		 -> 스프링 부트 자바 웹프로젝트에서 권장하는 방식
 */

interface I08{
	void play();
	//public abstract 생략가능함
}

//첫번째 자손클래스 정의
class B08 implements I08{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play in B08 class");
	}
}//B08 class

//두번째 자손클래스 정의

class C08 implements I08{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play in C08 class");
	}
}

class A08{
	void autoPlay(I08 i) {//매개변수(전달인자) 타입이 부모 인터페이스 타입으로 선언됨 -> 업캐스팅+상속(매개변수 다형성 적용: 모든 자손타입을 받을 수 있다)
		i.play(); //업캐스팅 이후 오버라이딩 한 메서드 호출 =>i 가 실제 가리키는 객체타입에 의해서 호출되는 메서드 결정
	}
}

public class interEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A08 a08 = new A08();
		a08.autoPlay(new B08());
		a08.autoPlay(new C08());
	}
}
