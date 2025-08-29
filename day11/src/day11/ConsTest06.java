package day11;
/*	
 *  작성일 : 2025-08-30
 *	작성자 : 최원효
 *	설명 : 인스턴스 변수와 정적 변수의 차이점에 대해서 알수 있는 소스)
 */
class St06{
	static int a = 10;
	int b = 20;
	/*
	 * 클래스 소속의 맴버 변수 종류)
	 * 1.인스턴스 변수
	 * 2.정적 변수
	 */
}
public class ConsTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		St06 s01 = new St06();
		St06 s02 = new St06();
		
		System.out.println("s01.a = "+s01.a+"\t s02.a = "+ s01.a);
		System.out.println("s01.a = "+s02.b+"\t s02.a = "+ s02.b);
		System.out.println();
		System.out.println();
		s01.a = 100;
		System.out.println("s01.a = "+s01.a);
		System.out.println("s01.a = "+s02.a);
		s01.b = 40;
		System.out.println("s01.b = "+s01.b);
		System.out.println("s01.b = "+s02.b);
	}

}
