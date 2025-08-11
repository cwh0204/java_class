package day03;

import java.util.Scanner;

public class OprTest09 {
	/*
	 * 	작성일 : 2025-08-11
	 *	작성자 : 최원효
	 * 	설명: if else if 다중 조건문으로 학점 구하기 실습
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("0~100 사이 정수숫자 점수만 입력>>");
		int score = Integer.parseInt(scan.nextLine());
		char grade = ' '; //학점
		
		if(!(0 <= score && score <= 100)) {
			System.out.print("0~100 사이 정수숫자 점수만 입력하세요!");
		}else {
			if(score >= 90 && score <= 89) {
				grade = 'A';
			}else if(score >= 70 && score <= 79) {
				grade = 'B';
			}else if(score >= 60 && score <= 69) {
				grade = 'C';
			}else if(score >= 50 && score <= 59) {
				grade = 'D';
			}else {
				grade = 'F';
			}
			 
			System.out.printf("당신이 입력하신 %d점은(는) %c학점입니다.\n",score,grade);
		}
		
	}

}
