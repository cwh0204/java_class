package day05;
/*
 * 	작성일 : 2025-08-18
 *	작성자 : 최원효
 * 	설명 : 06장.반복문.pdf No.21 4번문제)
 *  A부터 Z까지의 알파벳 출력하는 자바 프로그램을 작성해 본다(단, 하나는 for 반복문과 int타입을 사용해야 하고, 또 다른 하나는 for반복문과 char 타입을 사용해야 한다.
 *  자바에서 증감 연산자(++,--)는 자료손실이 없는 더 큰 타입으로 자동형 변환하는 자동 산술법이 적용 안 된다.
  */
public class Ex06_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 65; i<=90; i++) {
			System.out.print((char)i);
		}
		System.out.println("");
		for(char i = 'A'; i<='Z'; i++) {
			System.out.print(i);
		}
	}
}
