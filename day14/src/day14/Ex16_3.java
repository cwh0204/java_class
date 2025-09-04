package day14;
/*	
 *  작성일 : 2025-09-03
 *	작성자 : 최원효
 *	설명 : 16장.상속 pdf No.21 2번 문제)
 *		  상속구조에서 생성자 호출 순서를 알아보기 위한 문제이다.
 */
class Father03{
	protected int a,b,c;
	
	public Father03() {
		System.out.println("Father03 부모클래스 디폴트 기본생성자 호출");
	}
	public Father03(int a,int b,int c) {
		System.out.println("Farther 클래스의 전달인자가 3개짜리 생성자 호출");
		this.a=a;
		this.b=b;
		this.c=c;
	}
}

class Son03 extends Father03{
	protected int d;
	
	public Son03() {
		System.out.println("Child 클래스의 디폴트 생성자 호출");
	}
	
	public Son03(int a, int b, int c){
		super(a, b, c);
		this.d = d;
		System.out.println("Child 클래스의 전달인자 3개짜리 생성자 호출");
	}
}
public class Ex16_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son03 f03 = new Son03();
		Son03 f04 = new Son03(1,2,3);
		System.out.println();
		
	}

}
