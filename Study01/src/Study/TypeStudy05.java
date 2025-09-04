package Study;

import java.util.Scanner;

/*	
 *  작성일 : 2025-09-02
 *	작성자 : 최원효
 *	설명 : 자바의 삼항 조건 연산자 형식)
 *	조건식 ? 참이면 실행 : 거짓이면 실행;
 */
public class TypeStudy05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 숫자 나이만 입력>>");
		int age = Integer.parseInt(scan.nextLine());
		
		String result = null;
		result = (age >= 20 && age <= 29)?"20 대이다." : "20대가 아니다";
		
		System.out.printf("입력하신 나이 %d살은 %s \n", age,result);//%s는 문자열 출력형태 지시자이다
	}
}
