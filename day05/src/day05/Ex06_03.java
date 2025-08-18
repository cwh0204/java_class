package day05;
/*
 * 	작성일 : 2025-08-18
 *	작성자 : 최원효
 * 	설명 : 06장.반복문.pdf No.20 3번문제)
 *  10부터 1사이의 짝수를 10,8,6,4,2로 출력하는 자바 프로그램을 만들어본다.(단, 2출력하고 ,가 출력 안되게 해야한다.)
 *  while반복문 사용
  */
public class Ex06_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		while(i>=4) {
			System.out.print(i+",");
			i-=2;
		}
		System.out.print(i);
	}

}
