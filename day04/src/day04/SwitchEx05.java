package day04;

import java.util.Scanner;

/*
* 	작성일 : 2025-08-12
*	작성자 : 최원효
* 	설명: 중첩 Switch case 문 사용 예)
*/
public class SwitchEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("주민번호 입력(981025-2812345)>>");
		String juminNumber = scan.nextLine(); //주민번호를 문자열로 입력받는다
		char juNo = juminNumber.charAt(7); //charAt(7) 내장 메서드는 첫 문자를 0부터 시작해서 주민번호 뒷자리 첫번째 단일문자를 구함 즉 8번
		//째 단일문자를 구함
		
		switch(juNo) {
		case '1' : case '3' :
			switch(juNo){
				case '1' : System.out.println("당신은 2000년 이전에 태어난 남자입니다."); break;
				case '3' : System.out.println("당신은 2000년 이후에 태어난 남자입니다."); break;
			}
			break;
		
		case '2': case '4':
			switch(juNo) {
			case '2' : System.out.println("당신은 2000년 이전에 태어난 여자입니다"); break;
			case '4' : System.out.println("당신은 2000년 이후에 태어난 여자입니다"); break;
			}
			break;
		default: System.out.println("유효하지 않은 주민번호 입니다.");
		}
		
		System.out.println("\n===========================================================\n");
		
		/*
		 * 문제) 위의 switch ~ case 다중조건문을 중첩 if else if 다중 선택문으로 변경해보자.
		 */
		
		if(juNo == '1' || juNo =='3') {
			if(juNo =='1') {
				System.out.println("당신은 2000년 이전에 태어난 남자입니다.");
			}else {
				System.out.println("당신은 2000년 이후에 태어난 남자입니다.");
			}
		}else if(juNo == '2' || juNo =='4') {
			if(juNo =='2') {
				System.out.println("당신은 2000년 이전에 태어난 여자입니다.");
			}else {
				System.out.println("당신은 2000년 이후에 태어난 여자입니다.");
			}
		}else {
			System.out.println("유효하지 않은 주민번호 입니다.");
		}
		
	}

}
