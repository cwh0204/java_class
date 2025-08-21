package day07;
/*
 * 	작성일 : 2025-08-21
 *	작성자 : 최원효
 * 	설명 : 배열 총합과 평균을 구하는 예제 소스)
 */
public class ArrayEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  문제) 자바5 (jdk1.5)버전에서 추가된 향상된 확장 for 반복문을 사용해서 자바 점수 총합을 구하고 원소값도 출력해본다.
		 *  그리고 sum을 (double) 타입으로 캐스팅해서 평균도 구해보자
		 */
		
		int sum = 0;
		double avg = 0.0;
		int[] javascore = {100,88,100,100,90};
		for(int k : javascore) {
			sum += k;
			System.out.print(" " + k);
		}
		System.out.printf("\n 총합은 %d 평균은 %.2f 입니다",sum,(double)sum / javascore.length);
	}
}
