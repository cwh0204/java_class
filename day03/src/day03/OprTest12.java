package day03;
/*
 * 	작성일 : 2025-08-11
 *	작성자 : 최원효
 * 	설명: switch ~ case 다중 선택문 실습
 * 
 */
import java.util.Scanner;
public class OprTest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("영문 나라 이름 입력(korea)>>");
		char first_naraName = scan.nextLine().charAt(0); // 메서드 한줄로 엮어서 연이어서 코드라인을 줄여서 사용 -> 메서드 체이닝 방법
		//문자열로 입력받은 영문 나라이름에서 맨 앞 첫글자 단일문자를 구함
		
		switch(first_naraName) {
		case 'k' :
		case 'K' : System.out.println("대한민국"); break;
		case 'a' :
		case 'A' : System.out.println("미국"); break;
		case 'c' :
		case 'C' :System.out.println("캐나다"); break;
		default: System.out.println("해당하는 나라이름이 없다."); break;
		}
	}

}
