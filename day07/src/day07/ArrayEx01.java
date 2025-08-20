package day07;
/*
 * 	작성일 : 2025-08-20
 *	작성자 : 최원효
 * 	설명 : 배열이란? 동일한 타입(자료형)의 하나 이상의 복수개의 원소값을 고정된 크기로 한꺼번에 저장하기 위해서 사용하는 자료형을 말한다.
 *  첫번째 배열 생성법)
 *  new 키워드를 사용한다.
 *  타입[] 배열명 = new 타입[배열크기];
 */
public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[5];
		score[0] = 100; //첫번째 배열원소값 저장, 배열 주소 인덱스 번호는 0부터 시작한다.
		score[1] = 90;
		score[2] = 88;
		score[3] = 100;
		score[4] = 99;
		
		System.out.printf("배열 원소 개수(배열크기) = %d \n", score.length);
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
	}

}
