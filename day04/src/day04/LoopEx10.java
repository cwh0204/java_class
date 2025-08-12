package day04;
/*
 * 	작성일 : 2025-08-12
 *	작성자 : 최원효
 * 	설명: while 반복문 형식)
 * 			while(조건식){
 * 		 조건식이 참일동안만 반복실행;
 * 	 	 증감식;
 * 		}
 */
public class LoopEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=5;i>=1; i-=1) {
			System.out.print(" "+i);
		}
		System.out.println("\n ============== \n");
		
		i = 10;
		while(i>=0) {
			System.out.print(" "+i);
			i-=2;
		}
		System.out.println("\n ============== \n");
		
		int total = 0;
		i =1;
		while(i<10) {
			total += i;
			i=i+2;
		}
		System.out.printf("홀수들의 누적합 = %d \n", total);
	}

}
