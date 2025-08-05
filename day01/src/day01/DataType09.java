package day01;
/*
 * 	작성일 : 2025-08-05
 *	작성자 : 최원효
 * 	설명: printf()메서드와 함께 사용하는 다양한 출력형태 지시자 종류)
 * 	%b(true or false 인 boolean타입), %d(십진수 정수), %o(8진수 정수 출력형태), %x or %x(16진수 정수 출력형태),
 * 	%f(10진수 실수), %e %E(지수형태), %c(단일문자), %s(문자열)
 */

public class DataType09 {

	public static void main(String[] args) {
		char c = 'A'; //'A'는 십진수정수 65
		System.out.printf("c=%c,%d \n", c, (int)c);
		
		int octNum = 010; //정수 숫자값 10앞에 접두어 0이 붙은 정수상수
		System.out.printf("octNum = %o, %d\n", octNum, octNum); //10,8
		
		int hexNum = 0x10; //접두어 0x가 붙으면 16진수 정수상수
		System.out.printf("hexNum = %X, %d\n", hexNum, hexNum);
		
		int binNum = 0b10; //접두어 0b가 붙으면 2진수 정수(자바 7버전에서 추가됨)
		System.out.printf("binNum = %s, %d\n", Integer.toBinaryString(binNum), binNum); //"10", 2
		/*
		 * 자바에서 이진수 정수 출력형태 지시자는 없다. 그래서 내장 api 클래스인 Inreger하위의 정적메서드 toBinaryString(int i);
		 * 정적메서드를 활용해서 주어진 정수 인자값을 이진 문자열로 변경해준다.
		 */
		int finger = 10;
		
		System.out.printf("finger = [%5d] %n", finger); //%5d는 총 5자리가 십진수 정수 출력 형태이고 오른쪽 기본 정렬을 한다. 나머지 반자리는
		//공백으로 채운다.
		System.out.printf("finger = [%-5d] %n", finger); //%-5d는 총 5자리 십진수 정수출력형태이고 왼쪽 기본정렬을 한다. 나머지 반자리는
		//공백으로 채운다.
		System.out.printf("finger = [%05d] %n", finger); //%5는 총 5자리 십진수 정수출력형태이고 오른쪽 기본정렬을 한다 나머지 반자리는
		//0으로 채운다.
		
		String result1 = String.format("%-5s", String.valueOf(finger)).replace(' ', '0');
		System.out.println("[" +result1+ "]");
		
	}
}
