package day09;

import java.util.Scanner;

/*
 * 	작성일 : 2025-08-25
 *	작성자 : 최원효
 * 	설명 : 10장.메서드.pdf No.10 1번 2번 문제)
 */
public class ObjectEc01 {
	
//	스캐너로 부터 자기 자신 성,이름을 입력받아서 매개변수 인자값으로 전달해서 출력하는 다음과 같은 정적 메서드를 정의해본다	
	
	static void name_print(String farst_name) {
		
		System.out.printf("이름은 %s 입니다",farst_name);
	}
	
	static void gu(int gogoDan) {
		
		int gogoDans = 0;
		if(gogoDan >= 2 && gogoDan <=9) {
			System.out.printf("\n \t %d 단 출력 \n",gogoDan);
			for(int i = 1; i<= 9; i++) {
				gogoDans = gogoDan * i;
				System.out.printf("\n %d * %d = %d",gogoDan,i,gogoDans);
			}
		}else {
			System.out.printf("\n2~9의 정수가 아닙니다");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 >>>>>>>>>>>>> ");
		
		name_print(scan.nextLine());
		
		System.out.print("\n===============================\n");
		
		
		/*
		 * 2번문제) 스캐너로 부터 입력받은 정수 숫자를 정적 메서드 인자값으로 전달해서 해당 숫자 구구단을
		 * 구하는 다음과 같은 메서드를 별도로 만들어 보자
		 */
		
		System.out.print("\n구구단을 시작한 숫자를 적어주세요 >>>>>>>>>>>>>>>>>>");
		
		gu(Integer.parseInt(scan.nextLine()));
		
	}

}
