package day10;
/* 	
 *  작성일 : 2025-08-27
 *	작성자 : 최원효
 *  설명 : 매개변수가 int[] arr이면 이것은 배열이라서 참조타입에 해당된다. 주소값을 공유해서 배열원소값도 공유할 수 있다.
 */

public class MethodEx14 {
	
	static void change(int[] arr) {
		arr[0] = 1000; // 첫번째 배열원소값을 1000으로 저장
		System.out.println("change() 메서드의 arr[0] = "+ arr[0]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {10};
		
		System.out.println("main()메서드의 x[0] = " + x[0]);
		
		change(x);
		
		System.out.println("change() 메서드 호출후 x[0] = "+x[0]);
	}

}
