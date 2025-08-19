package day06;
/*
 * 	작성일 : 2025-08-19
 *	작성자 : 최원효
 * 	설명 : 문제)for 반복문과 continue,if조건문을 활용해서 1부터 10 까지 자연수 중에서 4의 배수만 빼고 누적합을 구하는 자바 프로그램을 만들어본다.
 */
public class BreakEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int total = 0;
		
		for(int i = 1; i<=10; i++) {
			
			total += i;
			if(i % 4 == 0) {
				System.out.println("합이 제외된 4의 배수"+i);
				continue;
			}
			sum += i;
		}
		System.out.printf("데이터 검증 %d \n",total-sum);
		System.out.println("총합 "+total);
		System.out.println("4의배수 제외된 합 "+sum);
	}

}
