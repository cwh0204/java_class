package day04;
/*
* 	작성일 : 2025-08-12
*	작성자 : 최원효
* 	설명: 명확한 반복횟수가 정해진 경우 사용하는 for반복문 형식)
* 	for(초기치; 조건식; 증감식){
* 		조건이 참일동안 반복;
* 	}
*/
public class LoopEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<=5; i++) {
			System.out.println(i+" 번 java");
		}
		System.out.println("\n==========================\n");
		
		for(int j = 5; j>=1; j--) {
			System.out.print("\t"+j);
		}
		System.out.println("\n==========================\n");
		
		for(int k = 2; k<=10; k+=2) {
			System.out.print(k+" ");
		}
		System.out.println("\n==========================\n");
		
		for(int l = 1; l< 10; l=l+2) {
			System.out.print(l+" ");
		}
	}

}
