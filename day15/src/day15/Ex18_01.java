package day15;
/*	
 *  작성일 : 2025-09-08
 *	작성자 : 최원효
 *	설명 : 18장.추상 클래스와 final.pdf No.19 1번문제
 *		  부모 추상클래스의 추상메서드는 상속받은 자손클래스에서 모두 오버라이딩을 해야 한다라는 강제성이 부여된다
 *
 */

abstract class Abs1 {
	int a = 10;
	String str = "Test";

	public abstract int getA();

	public String getStr() {
		return str;
	}
}

abstract class Abs2 extends Abs1 {
	int b = 100;
	
	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		return super.getStr();
	}

	public abstract int getB();
}

class AbsMain extends Abs2{

	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return super.getA();
	}

	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		return super.getStr();
	}

	@Override
	public int getB() {
		// TODO Auto-generated method stub
		return b;
	}
	
}

public class Ex18_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsMain am = new AbsMain();
		System.out.println(am.getA());
		System.out.println(am.getB());
	}

}
