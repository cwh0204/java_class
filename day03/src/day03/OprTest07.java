package day03;

import java.util.Scanner;

/*
 * 	작성일 : 2025-08-08
 *	작성자 : 최원효
 * 	설명: if ~ else 조건문을 활용한 최대값/최소값을 구하는 자바 프로그램
 */
public class OprTest07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 숫자값 입력>>");
		int a = Integer.parseInt(scan.nextLine());
		
		System.out.print("두번째 정수 숫자값 입력>>");
		int b = Integer.parseInt(scan.nextLine());
		
		int max = 0;
		int min = 0;
		
		if(a>b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}
		System.out.printf("최대값 = %d \t", max);
		System.out.printf("최소값 = %d", min);
	}

}
