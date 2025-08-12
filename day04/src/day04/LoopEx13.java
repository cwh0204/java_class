package day04;

import java.util.Scanner;

/*
 * 	작성일 : 2025-08-12
 *	작성자 : 최원효
 * 	설명 : 스캐너와 이중 for반복문 실습)
 */
public class LoopEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("#을 출력할 라인 줄수를 입력>>");
		int lineNumber = Integer.parseInt(scan.nextLine());
		
		/* 문제) 이중 for반복문을 활용하여 #을 다음과 같게 출력되게 만든다
		 * 
		 */
		for(int i = 0; i<=lineNumber-1; i++) {
			for(int j = 0; j<=i; j++ ) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
