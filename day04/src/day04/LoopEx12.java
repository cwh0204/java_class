package day04;
/*
 * 	작성일 : 2025-08-12
 *	작성자 : 최원효
 * 	설명 : for반복문에서 최대치, 증감식이 각 2개 나오고, 이중 for반복문 실습 예제소스)
 */
public class LoopEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1,j=5; i<=5; i++,j--) {
			System.out.printf("%d \t %d \n", i,j);
		}
		System.out.println("\n===============================\n");
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(" #");
			}
			System.out.println();
		}
	}

}
