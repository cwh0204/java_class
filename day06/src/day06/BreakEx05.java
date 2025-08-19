package day06;
/*
 * 	작성일 : 2025-08-19
 *	작성자 : 최원효
 * 	설명 : while 무한루프문을 사용해서 누적합이 100을 초과할 때 무한루프문을 종료시키고 반복문 제어변수 값과 누적합을 출력시킨다.
 */
public class BreakEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int sum=0;
		
		while(true) {
			if(sum > 100) {
				break;
			}
			i++;
			sum+=i;
		}
		
		System.out.printf("i=%d \n", i);
		System.out.printf("sum=%d \n", sum);
	}
}
