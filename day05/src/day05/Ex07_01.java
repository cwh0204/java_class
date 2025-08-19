package day05;
/*
 * 	작성일 : 2025-08-19
 *	작성자 : 최원효
 * 	설명 : 07장.제어문의 다양한 활용.pdf No.8 1번문제)
 *  22부터 76까지의 짝수의 개수와 그 합을 구하는 프로그
	램을 작성하시오.
	단 2씩 증가된 for반복문과 1씩 증가된 for 반복문을 각각 사용한다. 특히 1씩 증가된 반복문 안에서는 if문과 나머지 연산
	%,== 같다 비교연산자등을 사용한다.
  */
public class Ex07_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int count = 0;
		for(int i = 22; i<=76; i++) {
			if(i % 2 == 0) {
				total += i;
				count++;
			}
		}
		System.out.println("짝수의 개수 -> "+count+"   짝수의 합 -> "+total);
		
		total = 0;
		count = 0;
		for(int i = 22; i<=76; i+=2) {
			total += i;
			count++;
		}
		System.out.println("짝수의 개수 -> "+count+"   짝수의 합 -> "+total);
	}

}
