package day02;
/*
 * 	작성일 : 2025-08-06
 *	작성자 : 최원효
 * 	설명: 자바언어에서 + 연산 기호 특징)
 *  1. 숫자 + 숫자에서는 덧셈을 한다.
 *  2. 숫자 + 문자에서는 문자를 우선해서 숫자가 문자로 변경된다. 그래서 문자 + 문자가 되어서 서로 연결한다.
 *  즉 문자열 연결 연산기호로 사용된다.
 */
public class ConvertEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 100;
		int c = a+b;
		System.out.printf("%d + %d = %d \n", a, b, c);
		
		String result = a+"10"; // 숫자 + 문자에서 문자를 우선해서 숫자로 문자로 치환된다. 결국 문자 + 문자가 되어서 연결한다.
		System.out.printf("result = %s \n", result);
		//%s는 문자열 출력형태 지시자
		
	}

}
