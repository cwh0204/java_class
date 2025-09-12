package day01;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//출력한 단수를 입력하세요. 7
		//7*1 = 7
		//7*2 = 14
		
		Scanner scan = new  Scanner(System.in);
		int dan = Integer.parseInt(scan.nextLine());
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d \n", dan, i , dan*i);
		}
	}
}
