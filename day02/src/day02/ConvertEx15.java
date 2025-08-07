package day02;
/*
 * 	작성일 : 2025-08-07
 *	작성자 : 최원효
 * 	설명: 영문 소문자 'a'를 영문 대문자 'A'로 변화하는 자바 프로그램을 만들어 본다.힌트는 단일문자에 해당하는 십진수 정수값을 활용
 */
public class ConvertEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//첫번째 답안코드
		char a = 'a';
		System.out.printf("변화전: %c 변화후: %c\n",a, (int)(a-32));
		//두번째 답안코드
		char b = (char)(a - ('a'-'A')); //'a' - 'A' = 97-65 = 32 -> 97-32=65 -> (char)65 -> 'A'
		System.out.printf("'%c'에 해당하는 영문 대문자는 '%c'이다.\t",a, b);
	}

}
