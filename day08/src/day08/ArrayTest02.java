package day08;
/*
 * 	작성일 : 2025-08-22
 *	작성자 : 최원효
 * 	설명 : 2차원 배열 score 배열 원소값을 초기화 한 다음 이를 일반 이중 for 반복문을 사용해서 출력함.
 *  그리고 자바 5에서 추가된 향상된 확잘 for반복문을 사용해서 2차원배열 원소값을 1차원 배열로 변환
 */
public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40}
				}; 
		// 4행 * 3열의 총 12개의 배열원소값을 저장해서 초기화 한 2차원 배열 score 생성
		int sum = 0;
		
		for(int i = 0; i<score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d] : %d \n", i,j,score[i][j]);
			}
		}
		
		System.out.println("\n =============================== \n");
		
		for(int[] arr : score) {
			for(int k : arr) {
				sum += k;
			}
		}
		System.out.printf("score 배열원소 누적합 = %d  \n", sum);
	}

}
