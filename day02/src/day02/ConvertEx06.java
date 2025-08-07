package day02;

import java.util.Scanner;

/*
 * 	작성일 : 2025-08-07
 *	작성자 : 최원효
 * 	설명: 자바의 논리연산자 종류)
 *  1. 논리연산자 결과값은 boolean 타입인 true or false이다.
 *  	가.&&(논리곱) : 입력값 모두 true이면 결과값도 true이다. 나머지는 모두 false이다.
 *  	나.||(논리함) : 2개의 조건중 하나라도 참이면 결과값도 참(true)이다.
 *  	다.! (논리부정) : 입력값이 true이면 결과값은 false이고 반대로 입력값이 false이면 결과값은 true이다.  
 */
public class ConvertEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = false;
		result = (true && true);
		System.out.printf("%b && %b : %b\n", true , true, result);
		
		result = (false || false);
		System.out.printf("%b || %b : %b\n", false , false , result);
		
		result = !false;
		System.out.printf("!false = %b\n", result);
		
		Scanner scan = new Scanner(System.in);
		String resultAnswer = "";
		
		System.out.print("나이입력 >>");
		int age = Integer.parseInt(scan.nextLine());
		
		resultAnswer = (age >= 20 && age <= 29) ? "20대이다" : "20대가 아니다";
		System.out.println(age + "세는?" + resultAnswer);
	}

}
