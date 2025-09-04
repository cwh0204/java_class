package day14;
/*	
 *  작성일 : 2025-09-04
 *	작성자 : 최원효
 *	설명 : 16장.상속 pdf No.32 9번문제)
 */
class A2 {
	protected String a = "4";
	
	@Override
	public String toString() {
		return "4";
	}
}

class B2 extends A2 {
	
	public String SumString() {
		return super.a + "3";
	}
	
	@Override
	public String toString() {
		return super.a + "3";
	}
	
}

public class Ex16_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 b2 = new B2();
		System.out.println(b2.SumString()); 
	}
}
