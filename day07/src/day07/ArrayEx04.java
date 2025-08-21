package day07;
/*
 * 	작성일 : 2025-08-21
 *	작성자 : 최원효
 * 	설명 : 3행*2열의 2차원배열 score를 생성하고 총 6개의 배열원소값으로 초기화 한 다음 이중 for 반복문으로 일괄적으로 읽어오는 예제 소스.
 */
public class ArrayEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = new int[3][2];
		score[0][0] = 95; score[0][1] = 90;
		score[1][0] = 97; score[1][1] = 99;
		score[2][0] = 100; score[2][1] = 98;
		
		for(int i = 0; i < score.length; i++) {
			for(int j=0; j < score[i].length; j++) {
				System.out.print(" " + score[i][j]);
			}
			System.out.println();
		}
	}	

}
