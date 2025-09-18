package sol;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 첫수를 입력하시오 1
		// 둘때수를 입력하시오 5
		// 배수를 입력하시오 2

		// 1과 5사이의 2의 배수의 합은 6입니다.
		Scanner scann = new Scanner(System.in);
		System.out.print("첫수를 입력하시오");
		int a = Integer.parseInt(scann.nextLine());
		System.out.print("둘째수를 입력하시오");
		int b = Integer.parseInt(scann.nextLine());
		System.out.print("배수를 입력하시오");
		int c = Integer.parseInt(scann.nextLine());
		int sum = 0;
		for(int i = a; i<= b; i++) {
			
			if(i % c ==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
