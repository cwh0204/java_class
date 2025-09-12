package day01;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//첫수를 입력하시오 3
		//둘째수를 입력하시오 5
		//3과 5의 합은 8입니다
		Scanner scan = new Scanner(System.in);
		
		int first = Integer.parseInt( scan.nextLine());
		int next = Integer.parseInt(scan.nextLine());
		
		System.out.printf("%d 와 %d 의 합은 %d입니다",first,next,first+next);
	}

}
