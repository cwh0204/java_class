package day10;
/*
 * 	작성일 : 2025-08-26
 *	작성자 : 최원효
 * 	설명 : 오버로딩 된 메서드 구분요건 기준은 전달인자(매개변수)이다. 메서드명 앞의 리턴타입을 다르게 한 메서드 오버로딩은 허용하지 않는다.
 */

class Mt03{
	void pr(int a) {
		System.out.println(a);
	}
	int pr(int a) { //메서드 명 앞의 리턴타입을 다르게 한 메서드 오버로딩은 안된다.
		return a;
	}
}

public class MethodEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
