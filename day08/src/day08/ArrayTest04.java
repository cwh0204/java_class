package day08;

import java.util.Scanner;

/*
 * 	작성일 : 2025-08-22
 *	작성자 : 최원효
 * 	설명 : 2차원 배열을 사용한 영문자에 대한 한글 답안을 찾는 소스 예)
 */
public class ArrayTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] words = {
				{"java","자바"},
				{"int","정수"},
				{"for","반복문"}
		};
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i<words.length; i++) {
			System.out.printf("Q. %d번 문제. %s의 뜻은? \n", i+1, words[i][0]);
			
			String answer = scan.nextLine();
			
			if(answer.equals(words[i][1])) {
				
				System.out.println("정답입니다 \n\n");
			
			}else {
				System.out.printf("틀렸습니다. 정답은 %s 입니다. \n\n", words[i][1]);
			}
		}
		
	}

}
