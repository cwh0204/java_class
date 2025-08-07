package day02;

/*
 * 	작성일 : 2025-08-07
 *	작성자 : 최원효
 * 	설명: 자바의 증가/감소 연산자 종류
 * 	++i(선행 증가 -> 먼저 1증가), i++(후행 증가 -> 나중에 1 증가)
 *  --i(선행 감소 -> 먼저 1감소), i--(후행 감소 -> 나중에 1 감소)
 *  
 *  참고로 i++은 복합대입연산자인 i+=1과 같은 기능을 가진다. 마찬가지로 i--은 i-=1과 기능이 같다.
 *  
 */

public class ConvertEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=10;
		++a; //선행 1증가
		System.out.printf("a = %d \n", a); //11
		
		a--;
		System.out.printf("a = %d \n", a); //10
		
		System.out.printf("%d \n",b++); //먼저 변수값 10을 출력하고 나중에 1증가 //10
		
		System.out.printf("%d \n",b); //11
		
		int result = ++b; //먼저 1증가한 12를 좌측변수에 대입 저장
		System.out.println("result = " + result);
	}

}
