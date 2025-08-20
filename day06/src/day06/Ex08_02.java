package day06;

import java.util.Random;

/*
 * 	작성일 : 2025-08-20
 *	작성자 : 최원효
 * 	설명 : 08장.제어문을 보조하는 보조제어문 .pdf No.13 2번문제)
 *  1부터 50까지의 자연수 중에서 4의 배수만 뺀 누적값을 구하는 자바 코드  
 */
public class Ex08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int num = 0;
		while(i<50) {
			i++;
			if(i % 4 == 0) {
				continue;
			}
			num += i;
		}
//		System.out.println(num);
		
		/*
		 * 문제) for무한루프문과 java.util패키지의 random 유틸리티 클래스 하위의 nextInt(6) 내장메서드를 활용해서 임의의 주사위수를 구하는
		 * 자바 프로그램을 만들어 보고, 임의의 주사위 수가 4일때 for 무한루프문을 종료시켜 본다. 임의의 주사위 정수는 난수가 된다.
		 */
		Random random = new Random();
		int num1;
		for(;;) {
			num1 = random.nextInt(6)+1;
			System.out.println("주사위값은"+num1+"입니다");
			if(num1 == 4) {
				System.out.println("정답");
				break;
			}
		}
	}
}
