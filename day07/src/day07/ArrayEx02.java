package day07;
/*
 * 	작성일 : 2025-08-20
 *	작성자 : 최원효
 * 	설명 : 배열원소값을 직접 초기화 즉 저장하면서 배열 생성 -> 배열원소값의 총합과 평균을 구한다.
 *  
 */
public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] score = {100,90,100,100,100};
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0; i<score.length; i++) {
			sum+= score[i];
		}
		
		avg = (double)sum / score.length;
		System.out.printf("총점 = %d \n", sum);
		System.out.printf("평균 = %.1f", avg);
	}

}
