package day05;
/*
 * 	작성일 : 2025-08-18
 *	작성자 : 최원효
 * 	설명 : 이중 for 반복문을 사용한 구구단
 */
public class ForEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i = 1; i<=9; i++) {
			System.out.println(">>>>>>>>>>>>"+i+"단<<<<<<<<<<<");
			for(j = 1; j<= 9; j++) {
				System.out.printf("%d x %d = %d \n", i,j,i*j);
			}
			System.out.println("==============================\n");
		}
		
		int k = 2;
		while(k <= 9) {
			System.out.println(k+"단\t");
			k++;
			
		}
		System.out.println("===============================\n");
		
		/*
		 * 문제) 이중 for반복문을 사용해서 다음과 같이 구구단이 출력되게 만들어본다.
		 * 2*1=2 3*1=3 ....중략....9*1=9
		 */
		int a,b;
		for(a = 1; a <= 9; a++) {
			for(b= 2; b <= 9; b++) {
				System.out.printf("%d x %d = %d \t", b,a,b*a);
			}
			System.out.println("");
		}
	}

}
