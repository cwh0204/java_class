package day14;
/*	
 *  작성일 : 2025-09-02
 *	작성자 : 최원효
 *	설명 : 16장.상속 pdf No.20 1번문제)
 */

class Parent{
	private int a;
			int b;
	protected int c;
	public int d;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}

class Child extends Parent{
	
	public Child(int a, int b, int c, int d) {
		this.setA(a); //[1] 정답 부모 Parent02에서 private으로 정의된 맴버변수 a는 같은 패키지의 자손클래스에서 못가져온다.
		this.b = b; //[2]
		this.c = c; //[3]
		this.d = d; //[4]
	}
	
	void func() {
		System.out.print(getA()); //[5]
		System.out.print(b); //[6]
		System.out.print(c); //[7]
		System.out.println(d); //[8]
	}
}

public class Ex16_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child one=new Child(1, 2, 3, 4);
		one.func();
		System.out.print(one.getA()); //[9]
		System.out.print(one.b); //[10]
		System.out.print(one.c); //[11]
		System.out.println(one.d); //[12] 
	}
}
