package day19;

import java.util.Scanner;

/*
 * 	작성일 : 2025-09-12
 * 	작성자 : 최원효
 *   설명 : try ~ catch 문으로 예외 처리)
 *   		try{ //정상구문이 실행되다가 예외가 발생하면 아래 문장을 수행하지 않고 예외 처림 해당 catch 블록문으로 이동해서 예외를 처리한다.
 *   		...		
 *   		}catch(예외 치러클래스 매개변수){
 *   		 예외처리;
 *   		}
 */

//자바는 정수숫자를 0으로 나누면 예외가 발생한다.
public class TryCatchEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b01 = 0, b02 =2 , c =10;
		
		try {
			c = a / b02;
			System.out.println(c);
			
			c = a / b01;
			System.out.println(c);
			
			c = a / b02;
			System.out.println(c);
			
		}catch(Exception e){//Exception은 예외처리 부모클래스
			System.out.println("예외발생 : " + e);//java.lang.ArithmeticException / by zero 예외 에러가 정수 숫자를 0으로나누었을 때 발생하는 예외 에러이다.
		}
		System.out.println("try 구문 수행후 c = " + c);
	}

}
