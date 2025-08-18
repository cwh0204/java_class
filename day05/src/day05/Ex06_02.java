package day05;

import java.util.Scanner;

/*
 * 	작성일 : 2025-08-18
 *	작성자 : 최원효
 * 	설명 : 06장.반복문.pdf No.19 2번문제)
 *  1부터 입력받은 숫자값까지 홀수를 출력하는 프로그램을 작성해 본다.(단 . 하나는 for 반복문에서 1씩 증가 하면서 if조건문과 %나머지 연산을 사용해야 하고,
 *  또 다른 하나 for 반복문은 2씩 증가하면 된다.)
  */
public class Ex06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자를입력해주세요>>");
		Scanner scan = new Scanner(System.in);
		int number = Integer.parseInt(scan.nextLine());
		System.out.println("");
		for(int i=1; i<=number; i++) {
			if(i % 2 == 1) {
				System.out.println("홀수는"+i+"입니다");
			}
		}
		System.out.println("");
		for(int i=1; i<=number; i+=2) {
			System.out.println("홀수는"+i+"입니다");
		}
	}

}
