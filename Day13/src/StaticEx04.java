/*	
 *  작성일 : 2025-09-01
 *	작성자 : 최원효
 *	설명 : class 자손클래스 extends 부모클래스 {
 *	}
 */

class Parent04{// extends Object 이 생략됨. 자바 클래스는 명시적인 상속을 받지 않으면 묵시적으로 extends object가 추가되어서 자바 최상위
	// 부모 클래스 Object으로 상속받게 된다.
	public void ParentPrn(){
		System.out.println("부모클래스 Parent04 클래스의 메서드 parentPrn()");
	}
}

class Child04 extends Parent04{
	public void childPrn() {
		System.out.println("자손클래스의 메서드 childPrn");
	}
}

public class StaticEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child04 child = new Child04();
		child.ParentPrn();
		child.childPrn();
		Parent04 p = new Parent04();
		p.ParentPrn();
	}
}
