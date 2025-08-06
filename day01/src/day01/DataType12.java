package day01;

/*
 * 	작성일 : 2025-08-06
 *	작성자 : 최원효
 * 	설명: double 타입 실수 숫자값을 캐스팅 연산자인 (int)로 형변환하면 소수점이하는 반올림을 하지않고 버린다
 */

public class DataType12 {

	public static void main(String[] args) {
		
		double score = 89.9;
		int result_score = (int)score;//89.9점
		
		System.out.printf("실제 취득한 점수 = %.1f %n", score);
		System.out.println("공무원 합격점수(90점 이상이면 합격, 90점 미만이면 불합격)"+ result_score);
	}

}
