package day03;

import java.util.Scanner;

/*
 * 	작성일 : 2025-08-08
 *	작성자 : 최원효
 * 	설명: if else if 다중 조건문(선택문) 형식:
 * 		if(조건식 1){
 * 			조건식 1이 참일 때 실행;
 * 		}else if(조건식 2){
 * 			조건식 2가 참일 때 실행;
 * 		}else{
 * 			조건식 1,2 모두 거짓일때 실행;
 * 		}
 */
public class OprTest08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 숫자값 입력>>");
		int a = Integer.parseInt(scan.nextLine());
		
		if(a > 0) {
			System.out.print(a+"는(은) 양수이다.");
		}else if(a < 0) {
			System.out.print(a+"는(은) 음수이다.");
		}else {
			System.out.print(a+"는(은) 0 이다.");
		}//if else if
	}

}
