package day04;

/*
 * 	작성일 : 2025-08-12
 *	작성자 : 최원효
 * 	설명: for 반복문을 활용한 7단 구하기와 1부터 100까지의 누적합 구하기
 */
public class LoopEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; // 반복문 제어변수
		int guguDan = 7;

		System.out.println("<<==================" + guguDan + "단 =============>");

		for (i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d \n", guguDan, i, guguDan * i);
		}

		System.out.println("<<===============================>");

		int sum = 0;// 누적합을 저장할 변수
		// 1부터 100까지의 자연수 정수 누적합

		for (i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 100까지의 누적합 = " + sum);
	}
}
