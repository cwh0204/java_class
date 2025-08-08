package day03;
/*
 * 	작성일 : 2025-08-08
 *	작성자 : 최원효
 * 	설명: ! 논리 부정 연산자
 */
public class OprTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		
		System.out.printf("flag = %b \n", flag);
		System.out.printf("!flag = %b \n", !flag); //!true -> false
		System.out.printf("!!flag = %b \n", !!flag); // !!true -> false -> true
	
	}
}
