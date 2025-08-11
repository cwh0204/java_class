package day03;

import java.util.Scanner;

/*
 * 	작성일 : 2025-08-11
 *	작성자 : 최원효
 * 	설명: switch ~ case 문을 사용한 학점 구하기
 */
public class OprTest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("0부터 100사이 자바 점수 입력>>");
		String jumsu = scan.nextLine();
		int score = Integer.parseInt(jumsu);
		
		if(score >= 0 && score <= 100) {
			System.out.print("입력하신 점수 "+ score + "는(은) ");
			
			score = score / 10; //10으로 나눈 몫만 구함(자바언어세서는 정수 숫자를 나눗셈하면 몫만 구한다.
			
			switch(score) {
			case 10:
			case 9: System.out.println("A학점 입니다"); break;
			case 8: System.out.println("B학점 입니다"); break;
			case 7: System.out.println("C학점 입니다"); break;
			case 6: System.out.println("D학점 입니다"); break;
			default : System.out.println("F학점 입니다");
			}
		}else {
			System.out.println("0부터 100사이 점수만 입력하세요!");
		}
	}

}
