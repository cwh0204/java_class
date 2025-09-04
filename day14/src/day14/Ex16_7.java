package day14;
/*	
 *  작성일 : 2025-09-04
 *	작성자 : 최원효
 *	설명 : 16장.상속 pdf No.29 6번문제)
 *	문제와 자바소스는 강의교안을 참조하고 이 소스의 실행 결과를 주석문 처리한다.
 */

class Base {
	Base() { //super();이 생략됨 -> 최상위 부모클래스 Object의 기본 생성자를 호출하면서 생성자 호출은 끝이난다.
		System.out.print("Base");
	}
}

class Alpha extends Base {

}

public class Ex16_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Alpha();// Base
		new Base();// Base
	}
}
