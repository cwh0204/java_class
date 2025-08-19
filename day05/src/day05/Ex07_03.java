package day05;
/*
 * 	작성일 : 2025-08-19
 *	작성자 : 최원효
 * 	설명 : 07장.제어문의 다양한 활용.pdf No.9 3번문제)
 *  1부터 100사이의 짝수를 출력하되 한 줄에 10 개씩 출력
	하시오. (Ex07_03.java->for,if,%)
	하나는 2씩 증가되는 for 반복문 또다른 하나는 if조건문 %나머지 연산 == 같다 비교연산을 활용한 1개씩 증가하는 for 반복문을 각각 사용
  */
public class Ex07_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 2; i <= 100; i+=2) {
			System.out.printf("%4d",i);
			if(i % 20 == 0) {
				System.out.println("");
			}
		}
		System.out.println("");
		System.out.println("");
		for(int i = 1; i<=100; i++) {
			if(i % 2 == 0) {
				System.out.printf("%4d",i);
				if(i % 20 == 0) {
					System.out.println("");
				}
			}
		}
	}

}
