package Study;
/*
 * 메서드 오버로딩 이란?
 * 1. 동일한 같은 클래스내에서 같은 이름의 메서드명을 중복해서 여러번 정의하는 것을 메서드 오버로딩이라고 한다.
 * 2. 오버로딩 된 메서드 구분 요건
 * 		가. 전달인자(매개변수) 개수를 다르게 한다.
 * 		나. 전달인자 타입을 다르게 한다.
 * 		다. 전달인자 순서를 다르게 한다.
 */

class Mt07{
	void pr(int a) {
		System.out.println(a);
	}
	void pr(int a, int b) {
		System.out.println(a +"\t"+b);
	}
	void pr02(int data) {
		System.out.println("data : "+data);
	}
	void pr02(double data) {
		System.out.println("data : "+data);
	}//전달인자 타입을 다르게 한 메서드 오버로딩
	
}
public class TypeStudy17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mt07 m07 = new Mt07();
		m07.pr(100);
		m07.pr(100,200);
		m07.pr02(100);
		m07.pr02(100.3);
	}

}
