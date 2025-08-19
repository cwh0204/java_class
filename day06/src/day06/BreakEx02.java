package day06;
/*
 * 	작성일 : 2025-08-19
 *	작성자 : 최원효
 * 	설명 : 자바의 이중 for반복문에서 맨 안쪽 반복문안에서 break문을 사용하면 가장 근접한 안쪽 반복문만 중단하고 바깥 반복문은 중단 못한다.
 *  이런 경우 바깥 반복문까지 모두 중단하고 싶을 때는 맨 바깥 반복문위에 임의의 레이블명을 지정하면 된다.
  */
public class BreakEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,i;//반복문 제어변수
		
		//이중 반복문에서 맨 안쪽 반복문만 중단
		for(a=1; a<10; a++) {
			for(i=1; i<=10; i++) {
				if(i % 3 == 0) {
					break;
				}
				System.out.print(" i->" + i);
			}
			System.out.println("\n a->" + a);
		}
		
		System.out.println("===========================");
		
		exit_for://임의의 레이블명 지정
			for(a=1; a<9; a++) {
				for(int b=1; b<=9; b++) {
					for(int c=1; c<=9; c++) {
						if(c % 3 ==0) {
							break exit_for; //이중 for 반복문 중단
						}
						System.out.print(" c->"+c);
					}
					System.out.print(" b->"+b);
				}
				System.out.println("\n a->"+a);
			}
	}
}
