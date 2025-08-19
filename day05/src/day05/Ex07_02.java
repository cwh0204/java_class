package day05;
/*
 * 	작성일 : 2025-08-19
 *	작성자 : 최원효
 * 	설명 : 07장.제어문의 다양한 활용.pdf No.8 2번문제)
	1부터 100사이의 합을 구하되 10 단위마다 한 번씩 출력
	하시오. (Ex07_02 .java -> for,if,%(나머지연산))
  */
public class Ex07_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		for(int i = 1; i<=100; i++) {
			sum+=i;
			if(i % 10 == 0) {
				System.out.println("1 ~ "+ i +" 까지의 합 -> " + sum);
			}
		}
	}

}
