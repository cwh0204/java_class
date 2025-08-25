package 자바평가문제;

import java.util.Scanner;

/*
 * 	작성일 : 2025-08-25
 *	작성자 : 최원효
 * 	설명 : 자바 평가문제 1) 이중 for 반복문을 사용하여 다음과 같은 출력 결과물이 나오는 코드를 작성해 본다.
 *  출력예) # # #
 *  	  # # #
 *        # # #
 */
public class javaExam01 {
	
	
	static void asb(int a) {
		for(int i = 1; i<= a; i++) {
			for(int j = 1; j<=a; j++) {
				System.out.print("# ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//답안코드 작성
		Scanner scan = new Scanner(System.in);
		System.out.print("입력할 줄을 적어주세요 >>>>>>>>>>>>");
		asb(Integer.parseInt(scan.nextLine()));
	}

}
