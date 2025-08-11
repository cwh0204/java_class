package day03;

import java.util.Scanner;

/*
 * 	작성일 : 2025-08-11
 *	작성자 : 최원효
 * 	설명: if ~ else 조건문 실습
 */
public class OprTest14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 문제) 스캐너를 활용해서 정수숫자를 입력받은 다음 if조건문을 사용하여 숫자 0을 입력했을 때는 "입력한 숫자는 0입니다."라고 출력되게
		 * 하고 , 0이 아닐때 "입력하신 숫자는 0이 아닙니다" 라고 출력되게 하는 자바 프로그램을 만들어본다.
		 */
		System.out.print("숫자를 입력해주세요>>");
		Scanner scan = new Scanner(System.in);
		int num1 = Integer.parseInt(scan.nextLine());
		if (num1 == 0) {
			System.out.println("입력하신 숫자는 0입니다");
		}else {
			System.out.println("입력하신 숫자는 0이 아닙니다");
		}
	}

}
