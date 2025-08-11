package day04;

import java.util.Scanner;

/*
* 	작성일 : 2025-08-11
*	작성자 : 최원효
* 	설명: if else if 다중 조건문을 활용한 봄,여름,가을,겨울 구하기
*/
public class SwitchEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("1월부터 12월 사이 월만 입력>>");
		int month = Integer.parseInt(scan.nextLine());
		if (!(month >= 1 && month <= 12)) {
			System.out.println("1월 부터 12월 사이 월만 입력!");
		} else {
			/*
			 * 문제) if else if 다중조건문과 논리합 ||, ==같다 연산만 활용하여 입력하신 월로 봄,여름,가을,겨울을 구하는 자바 프로그램을
			 * 만들어본다
			 */
			if (month == 6 || month == 7 || month == 8) {
				System.out.println("입력하신 " + month + "월은 여름 입니다.");
			} else if (month == 9 || month == 10 || month == 11) {
				System.out.println("입력하신 " + month + "월은 가을 입니다.");
			} else if (month == 12 || month == 1 || month == 2) {
				System.out.println("입력하신 " + month + "월은 겨울 입니다.");
			} else{
				System.out.println("입력하신 " + month + "월은 봄 입니다.");
			}
		} // if else
	}

}
