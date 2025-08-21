package day07;
/*
 * 	작성일 : 2025-08-21
 *	작성자 : 최원효
 * 	설명 : 1차원 배열원소값 중에서 최대값을 구해 본다.
 */
public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double data[] = {10,5,20,5,100,0,95,0,80,0};
		double max = data[0];
		
		for(int i = 0; i < data.length; i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}
		System.out.printf("최대값은 얼마인가? %f",max);
		/*
		 *  %f는 10진수 실수숫자 출력형태 지시자이다. 기본적으로 소수점 이하 6자리 까지만 표현하고, 7자리에서 반올림 한다.
		 */
		
		
	}

}
