package day14;
/*	
 *  작성일 : 2025-09-04
 *	작성자 : 최원효
 *	설명 : 16장.상속 pdf No.29 6번문제)
 *	문제와 자바소스는 강의교안을 참조하고 이 소스의 실행 결과를 주석문 처리한다.
 */

class A {
	public A() {
		System.out.println("hello from a");
	}
}

class B extends A {
	public B() {
		super();
		System.out.println("hello from b");
		// super(); 으로 부모 생성자를 호출할때는 반드시 첫줄에 와야함
	}
}

public class Ex16_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
	}

}
