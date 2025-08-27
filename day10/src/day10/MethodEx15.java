package day10;
/*	
 *  작성일 : 2025-08-27
 *	작성자 : 최원효
 *	설명 : 참조타입 배열 매개변수
 */

class PrintArrRt{
	
	public int sumArr(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			
			sum += i;
		}
		return sum;
	}
}

public class MethodEx15 {
	
	static void printArr(int[] arr){
			System.out.print("[");
			for(int i : arr) {
				System.out.print(i+",");
			}
			System.out.print("]\n");
			System.out.print("===============\n");
	}
	
	public int sumArr(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,1,0,5,4};
		
		MethodEx15 mt15 = new MethodEx15();
		
		int total = mt15.sumArr(arr);
		
		PrintArrRt mt16 = new PrintArrRt();
		
		int total1 = mt16.sumArr(arr);
		
		printArr(arr);
		
		System.out.println(total);
		System.out.print(total1);
		/*
		 * 문제01) 자바 5에서 추가된 향상된 확장 for 반복문을 사용해서 다음과 같이 배열원소값이 출력되게 static void printArr([int[] arr){
		 * 
		 * } 정적 메서드를 작성한다.
		 * 
		 * 출력예) [3,2,1,5,4]
		 */
		
		/*
		 * 문제02) 일반 for 반복문을 사용해서 배열원소 총합을 구해서 반환한 다음 출력하는 코드를 완성해본다.
		 * 		  재귀 호출의 개념
		 */
	}
}
