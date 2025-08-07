package day02;

import java.util.Scanner;

/*
 * 	작성일 : 2025-08-07
 *	작성자 : 최원효
 * 	설명: 삼항 조건연산자 정의:
 *  조건식 ? 조건식이 참이면 실행 : 조건식이 거짓이면 실행;
 *  스캐너로 부터 첫번째 정수, 두번째 정수값을 각각 입력받아서 정수 숫자로 변경한 다음 삼한 조건 연산자로 두 수중 더 큰수를 구하는 실습 예제
 */
public class ConvertEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ctrl + shift + 영문자o 단축키로 외부 패키지인 java.util 패키지의 api를 임포트 즉 읽어들인다.
		 * jdk 1.5에서 추가된 Scanner 내장 api클래스는 텍스트 콘솔모드로 부터 입력받은 값을 읽어들일 때 사용한다.
		 * System.in은 키보드 입력장치와 연결된다.
		 * new키워드로 새로운 객체명 scan생성
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 숫자 입력>>");
		String num01 = scan.nextLine();
		int number01 = Integer.parseInt(num01);
		
		System.out.print("두번째 정수 숫자 입력>>");
		int number02 = Integer.parseInt(scan.nextLine());
		
		int max = (number01 > number02) ? number01 : number02;
		System.out.println(number01+"과 "+number02+"중 더 큰수는?"+max);
	}

}
