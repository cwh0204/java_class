package day05;
/*
 * 	작성일 : 2025-08-19
 *	작성자 : 최원효
 * 	설명 : 07장.제어문의 다양한 활용.pdf No.9 4번문제)
 *  각 단이 아래로 출력되지 않고 오른쪽으로 출력되도록
	구구단 프로그램을 작성하시오.(Ex07_04.java->이중 for
	문)
  */
public class Ex07_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=9; i++) {
			for(int j = 2; j<=9; j++) {
				System.out.printf("%2d *%2d = %d \t", j,i,j*i);
			}
			System.out.println("");
		}
	}
}
