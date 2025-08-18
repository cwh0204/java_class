package day05;

import java.util.Scanner;

/*
 * 	작성일 : 2025-08-18
 *	작성자 : 최원효
 * 	설명 : 06장.반복문.pdf No.18 1번문제)
 * 	문자와 숫자를 입력받아 문자를 입력받은 숫자만큼 반복 출력하는 자바 프로그램 코드를 만들어보자.
  */
public class Ex06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자를입력해주세요>>");
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		System.out.print("문자를입력해주세요>>");
		String inputStr = scan.nextLine();
		System.out.println("");
		for(int i=1; i<=number; i++) {
			System.out.println(inputStr+"  반복횟수"+i);
		}
	}

}
