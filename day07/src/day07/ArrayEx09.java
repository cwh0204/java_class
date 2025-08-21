package day07;
/*
 * 	작성일 : 2025-08-21
 *	작성자 : 최원효
 * 	설명 : 배열 원소 최대값과 최소값 구하기
 */
public class ArrayEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {100,90,80,99,98};
		
		int max = score[0];
		int min = score[0];
		
		/*
		 * 문제) 배열의 최대값, 최소값을 구하는 나머지 자바코드를 완성한다 
		 */
		
		for(int i : score) {
			if(max <= i) {
				max = i;
			}
			if(min >= i) {
				min = i;
			}
		}
		System.out.printf("최대값은 %d 최소값은 %d", max, min);
	}
}
