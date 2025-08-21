package day07;

import java.util.Arrays;

/*
 * 	작성일 : 2025-08-21
 *	작성자 : 최원효
 * 	설명 : 정수 숫자 난수를 배열주소 번호로 활용
 */
public class ArrayEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = { -4, -1, 3, 6, 11 };
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			int tmp = (int) (Math.random() * score.length); // 랜덤메서드는 0.0이상 1.0 미만 사이의 실수 난수 발생
			// score.length는 배열크기 5 반환, *5하면 0.0이상 5.0미만 사이의 실수 숫자 난수 (int)로 형변환 하면 0이상 5미만
			// 결국
			// 0부터 4사이의 임의의 정수숫자 난수 발생
			System.out.println("랜덤 "+tmp);
			System.out.println("0번 위치"+arr[0]);
			System.out.println("0번 위치"+Arrays.toString(arr));
			arr[i] = score[tmp];
		}

		// 내장 api로 배열원소값 출력

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		System.out.println("\n=================================\n");
		
		for(int b: arr) {
			System.out.print(" " + b);
		}
	}

}
