package day05;
/*
 * 	작성일 : 2025-08-18
 *	작성자 : 최원효
 * 	설명 : 이중 for 반복문 실습
  */
public class ForEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a; //바깥 for 반복문 제어변수
		int i; //안쪽 for 반복문 제어변수
		
		System.out.println("시침 ------------> 분침");
		System.out.println("a(바깥쪽 제어변수) -> i(안쪽 제어변수)");
		
		for(a=1; a<=5; a++) {
			for(i=1; i<=5; i++) {
				System.out.println(a+"-------------------->" + i);
				
			}//inner for(안쪽 for)
			System.out.println("\n===================>\n");
		}
	}
}
