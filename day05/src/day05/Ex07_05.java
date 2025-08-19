package day05;
/*
 * 	작성일 : 2025-08-19
 *	작성자 : 최원효
 * 	설명 : 07장.제어문의 다양한 활용.pdf No.10 5번문제)
 *  스타(*)로 역삼각형을 출력하는 프로그램을 작성하시오.
	(Ex07_05.java-> 이중 for)
  */
public class Ex07_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
