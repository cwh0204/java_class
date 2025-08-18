package day05;

/*
 * 	작성일 : 2025-08-18
 *	작성자 : 최원효
 * 	설명 : while조건식을 true로 설정하면 영원히 반복하는 무한루프 반복문이 된다.스캐너로 정수 숫자를 입력받아서 누적합을 구하고
 *  0을 입력한 경우 조건식을 거짓으로 해서 무한루프문을 종료시킨다.
 */

import java.util.Scanner;

public class ForEx04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int sum = 0; //누적합
		boolean flag = true; //while 조건식에서 설정할 boolean 타입 변수
		
		System.out.println("누적합을 구할 숫자를 입력하세요! 반복문을 끝내려면 0을 입력");
		
		while(flag) {
			System.out.print(">>");
			
			Scanner scan = new Scanner(System.in);
			String inputNumber = scan.nextLine();
			number = Integer.parseInt(inputNumber);
			
			if(number !=0) {
				sum += number; //누적합을 구함 sum = sum + number;와 같은 기능을 한다.
			}else {
				flag = false;
			}
		}// while
		System.out.println("누적합 = " + sum);
	}

}
