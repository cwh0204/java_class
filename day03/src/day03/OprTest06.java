package day03;

import java.util.Scanner;

/*
 * 	작성일 : 2025-08-08
 *	작성자 : 최원효
 * 	설명: if(조건식){
 * 	조건식이 참이면 실행;
 * }else{
 * 	조건식이 거짓이면 실행;
 * }
 */
public class OprTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("양의 정수숫자만 입력>>");
		String inputA = scan.nextLine();
		int inputNumber = Integer.parseInt(inputA);
		
		if(inputNumber > 0) {
			if(inputNumber %2 == 1) {
				System.out.println(inputNumber+"는(은) 홀수이다");
			}else {
				System.out.println(inputNumber+"는(은) 짝수이다");
			}
		}
		else {
			System.out.printf("%s \n", "양의 정수 숫자만 입력하세요!");
		}
	}
}
