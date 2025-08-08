package day03;

import java.util.Scanner;

/*
 * 	작성일 : 2025-08-08
 *	작성자 : 최원효
 * 	설명: 04장.연산자.pdf NO.22 1번문제)
 *  짝수인지 홀수인지 판단하는 자바 프로그램을 삼항 조건연산자를 이용하여 작성해 본다.
 */
public class Ex04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.print("값을 입력해주세요>>");
		System.out.println((a.nextInt() % 2 == 0) ? ("짝수") : ("홀수"));
//		(a.nextInt() % 2 == 0) ? ("짝수") : ("홀수")
//		(a.nextInt() % 2 == 1) ? ("홀수") : ("짝수")
		
	}
}
