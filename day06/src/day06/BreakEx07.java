package day06;

import java.util.Scanner;

/*
 * 	작성일 : 2025-08-20
 *	작성자 : 최원효
 * 	설명 : while 무한루프문을 사용한 점심 메뉴 선택 예제
 */
public class BreakEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("1- 치킨");
			System.out.println("2- 순대국밥");
			System.out.println("3- 짜장밥");
			System.out.print("원하는 야식메뉴(1-3)을 선택하세요. (종료:0)>>>");
			
			menu = Integer.parseInt(scan.nextLine());
			
			if(menu == 0) {
				System.out.println("점심 메뉴 선택프로그램을 종료합니다");
				break;
			}else if(!(menu >= 1 && menu <= 3)) {
				System.out.println("점심 메뉴번호를 잘못 선택했습니다!(종료:0)>>>");
				continue;
			}
			System.out.println("선택한 메뉴 번호는" + menu + "번입니다.");
		}
	}

}
