package 자바평가문제;

import java.util.Scanner;

/*
 * 	작성일 : 2025-08-25
 *	작성자 : 최원효
 * 	설명 : 자바 평가문제 2) for 반복문을 이용해서 1부터 10까지의 자연수 중에서 4의 배수를 뺀 총합을 구하는 코드를 작성해 본다.
 *
 */
public class javaExam02 {
	
	static void sum(int num) {
		int sum = 0;
		for(int i = 1; i<=num; i++) {
			if(!(i % 4 == 0)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("4를뺀 자연수의 합을 구할 범위를 적어주세요>>>>>>");
		sum(Integer.parseInt(scan.nextLine()));
	}

}
