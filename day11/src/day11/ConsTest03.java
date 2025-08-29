package day11;

import java.util.Random;

/*	
 *  작성일 : 2025-08-29
 *	작성자 : 최원효
 *	설명 : 클래스 초기화 블록, 인스턴스 초기화 블록
 */
public class ConsTest03 {
	static int[] arr = new int[10];
	
	static {
		Random a = new Random();
		/*
		 * 문제) 1부터 10까지 정수 난수로 일반 for 반복문을 사용해서 정적배열 arr 배열원소값을 초기화 해보자
		 */
		for(int i = 0; i < arr.length; i++) {
			arr[i] = a.nextInt(9)+1;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 문제 02) jdk1.5 버전에서 추가된 향상된 확장 for문을 사용해서 arr 정적 배열원소값을 출력해 보자.
		 */
		for(int i : arr) {
			System.out.print(i);
		}
		
	}

}
