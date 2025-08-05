package day01;
/*
 * 	작성일 : 2025-08-05
 *	작성자 : 최원효
 * 	설명: 변수 선언과 변수값 바꾸기
 */
public class DataType07 {

	public static void main(String[] args) {
		int year = 2025;
		int age = 20;
		
		System.out.printf("년도 = %d %n", year); //%d는 십진수 정수숫자 출력형태, %n은 줄바꿈
		System.out.printf("나이:%d \n", age);
		
		year = year + age; // 숫자 + 숫자에서 +는 덧셈연산기호
		System.out.printf("증가된 년도 : %d", year);
		
		System.out.printf("\n ==========================> \n");
		
		//변수값 변경 예제
		int a = 100;
		int b = 200;
		int temp = 0;
		
		System.out.printf("a = "+a+",b = "+b+ "\t");
		
		temp = a;
		a = b; //a 변수값 100이 200으로 변경
		b = temp; //b 변수값 200이 100으로 변경
		
		System.out.printf("변경된 a = %d, 변경된 b = %d \n", a, b);
	}
}
