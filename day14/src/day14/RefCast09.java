package day14;
/*	
 *  작성일 : 2025-09-05
 *	작성자 : 최원효
 *	설명 : 부모와 자손에서 동일한 맴버변수명이 정의된 경우와 자손에서 메서드가 오버라이딩이 된 경우 각각 호출되는 변수와 매서드에 관한 실습이다.
 *		  또한 동일한 맴버변수명이 부모와 자손에서 각각 정의된 경우 부모로 부터 상속받은 동일 멤버변수명에 접근할 때는 super.변수명으로 하고 자손에서 정의 된
 *			동일 맴버변수명에 접근할때는 this.변수명 또는 this.은 생략하고 변수명으로 접근 한다.
 */
class Mother09{
	int a = 100;
	
	void m() {
		System.out.println("부모에서 정의한 메서드 m()");
	}
}

class Child09 extends Mother09{
	int a = 200;

	@Override
	void m() {
		// TODO Auto-generated method stub
		System.out.println("a = "+a);
		System.out.println("thos.a = "+this.a); //200
		System.out.println("super.a = "+super.a); //100
	}
	
}
public class RefCast09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mother09 c = new Child09();
		System.out.println(c.a);
		c.m();
	}
}
