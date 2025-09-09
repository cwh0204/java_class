package day17;
/*
 * 작성일 : 2025-09-09
 * 작성자 : 최원효
 * 설명 : 자바 인터페이스.pdf 25쪽 2번 문제)
 * 추상클래스에 오는 추상 메서드는 {}가 없고, 실행문장이 없고 호출 불가능하다. 만약에 {}가 오고 실행문장이 있다면 추상메서드가 아닌 일반 메서드가 되어야 한다.
 */


abstract class Test01{
	abstract void methodA();//추상메서드
	
	abstract void methodB() { //추상 메서드 일 경우는 {}와 실행 문장이 없어야 하고, {}와 실행 문장이 있는 경우는 abstract 키워드가 빠져야한다
		System.out.println("methodB");
	}
}


public class InterTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
