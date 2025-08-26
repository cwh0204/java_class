package day09;
/*
 * 	작성일 : 2025-08-26
 *	작성자 : 최원효
 * 	설명 : 자바에서 OOP인 객체 지향 프로그래밍을 사용하는 목적
 *        1.높은 재사용성
 *        2.중복코드 제거
 */

class Arr08{
	void printNumArr(int[] arr) {
		for(int n:arr) {
			System.out.print(" " + n);
		}
	}
}

public class ObjectEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];
		
		for(int i = 0; i<numArr.length; i++) {
			numArr[i] = i+1;
		}
		
		//일반 for 반복문으로 numArr 배열 원소값 출력
		
		for(int i=0; i<numArr.length; i++) {
			System.out.printf("numArr["+i+"] = %d \n", numArr[i]);
		}
		
		System.out.println("\n===================================\n");
		
		for(int n:numArr) {
			System.out.print(" " + n);
		}
		
		System.out.println("\n===================================\n");
		
		Arr08 a = new Arr08();
		a.printNumArr(numArr);
	}
}
