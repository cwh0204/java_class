package day09;
/*
 * 	작성일 : 2025-08-25
 *	작성자 : 최원효
 * 	설명 : 클래스와 객체 관계인 객체지향 프로그래밍에 관한 소스(OOP: Object-Oriented Programming의 약자)
 */

class Tv{
	String coler;
	boolean power; //전원 상태
	int channel; //채널번호
	
	/*
	 *  클래스 소속 맴버변수인 속성 기본값)
	 *  맴버변수 만 선언하고 명시적인 코드로 초기화를 하지 않으면 속성(맴버변수)은 기본값으로 알아서 초기화가 된다. 이 초기값에 대해서 알아본다.
	 *  int 타입 속성은 0으로 초기화
	 *  boolean 타입 맴버 변수는 false 기본값으로 초기화
	 *  double 타입 속성은 0.0 기본값으로 초기화
	 *  String 참조타입 변수는 null기본값으로 초기화
	 */
	
	//3개 메서드 정의
	
	void power() {
		power = !power; //!false
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
	
	
}

public class ObjectEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv a = new Tv();
		a.power();
		System.out.println("tv상태 = "+a.power);
		a.channel = 10;
		a.channelUp();
		System.out.println("1 증가된 채널번호 " + a.channel);
		a.channelDown();
		a.channelDown();
		System.out.println("2 감소된 채널번호 " + a.channel);
	}
}
