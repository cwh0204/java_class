package day06;
/*
 * 	작성일 : 2025-08-20
 *	작성자 : 최원효
 * 	설명 : 08장.제어문을 보조하는 보조제어문 .pdf No.13 1번문제)  
 *  1부터 100사이의 자연수 중에서 제일 큰 7의 배수를 구하는 프로그램을 작성하시오
 *  단, 100부터 1까지 1씩 감소하면서 반복하지 말고 1부터 100까지 1씩 증가하면서 반복해서 구한다.
 */
public class Ex08_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int num1 = 0;
		int i = 0;
		for(int j = 1; j <= 100; j++) {
			if(j % 7 == 0) {
				num = j;
			}
		}
		for(;;) {
			i++;
			if(i % 7 == 0) {
				num1 = i;
			}
			if(i >= 100) {
				break;
			}
		}
		System.out.println(num);
		System.out.println(num1);
		
		
		
		/*
		 * 2번문제)100부터 1까지 1씩 감소하면서 for 반복문 등을 활용해서 6의 배수중 최대값을 구하는 자바 프로그램 코드를 만들어본다.
		 */
		int num2 = 0;
		for(int k = 100; k >= 1; k--) {
			if(k % 6 == 0) {
				num2 = k;
				break;
			}
		}
		System.out.println(num2);
	}
}
