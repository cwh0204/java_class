package day11;
/*	
 *  작성일 : 2025-08-27
 *	작성자 : 최원효
 *	설명 : 전달인자(매개변수) 개수가 다른 메서드가 오버로딩 된 경우 기본타입 매개변수와 참조타입 배열 매개변수와의 차이점)
 */
class CalssEx01{
	
}
public class ClassEx01 {

	public static void main(String[] args) {
		ClassEx01 cx01 = new ClassEx01();
		
		int re = cx01.add(3,5);
		System.out.println("3 + 5 = " + re);
		
		int[] arr = {0,4,2,3,8};
		cx01.add(3, 5, arr);
	}
	
	int add(int a, int b) {
		return a+b;
	}
	void add(int a, int b, int[] c) {
		int d = 0;
		for(int i : c) {
			d += i;
		}
		System.out.println(a+b+d);
	}
}
