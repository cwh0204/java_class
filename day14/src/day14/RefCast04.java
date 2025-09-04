package day14;
/*	
 *  작성일 : 2025-09-04
 *	작성자 : 최원효
 *	설명 : 다운캐스팅은 자동형 변환이 안되기 때문에 명시적인 캐스팅 연산자를 사용해야 한다. 그렇지 않으면 컴파일 에러가 발생한다.
 */

class Mother04{
	void m04() {
		System.out.println("부모클래스 m04() 메서드");
	}
}

class Son04 extends Mother04{
	void s04() {
		System.out.println("자손 클래스 s04() 메서드");
	}
}
class Son05 extends Mother04{
	void s04() {
		System.out.println("자손 클래스 s04() 메서드");
	}
}
public class RefCast04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mother04 m04 = new Son04();
		Son04 s04 = (Son04)m04;
		
		s04.m04();
		s04.s04();
		System.out.println("\n ====================================== \n");
		
//		Mother04 m = new Son04(); //Son04 첫번째 자손을 업캐스팅
//		Mother04 s = new Son05(); 
//		Son05 s1 = (Son05)m; //Son05 두번째 자손이 사전에 업캐스팅을 하지 않았기 때문에 캐스팅 연산 예외 오류가 난다.
//		s1.m04();
		
		Object obj = new Mother04();
		Mother04 obj1 = (Mother04)obj;
		Son04 obj2 = (Son04)obj;
	}
}
