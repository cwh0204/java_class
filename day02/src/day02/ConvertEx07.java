package day02;

import java.util.Scanner;

/*
 * 	작성일 : 2025-08-07
 *	작성자 : 최원효
 * 	설명: 문제)
 * 	스캐너를 활용해서 다음과 같은 "seoul"이라는 문자열을 입력받아서 맨 앞 첫 단일 문자를 구한다음 삼항 조건 연산자를
 * 	활용해서 구한 첫 단일문자가 영문 대문자인지 소문자인지 판별하는 자바 프로그램 코드를 작성해 보자.
 */

public class ConvertEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("도시 이름 입력: ");
		String city = scan.nextLine();
		String firstChar = city.substring(0, 1);
//		char firstChar1 = city.charAt(0);
		
	    String resultAnswer = (firstChar == "S") ? "대문자입니다" : "소문자입니다";
	    
//	    String resultAnswer1 = (firstChar1 >= 'A' && firstChar1 <= 'Z') ? "영문 대문자. " : "영문 소문자. ";
	    
	    System.out.println(resultAnswer);
	}

}