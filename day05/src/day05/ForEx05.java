package day05;

import java.util.Scanner;

/*
 * 	작성일 : 2025-08-18
 *	작성자 : 최원효
 * 	설명 : Math.random() 내장 메서드 0.0 이상 1.0미만 실수 숫자 난수를 발생시킨다. 이를 활용하여 1부터 100사이의 임의의 정수 숫자 난수를 발생시키고
 *  사용자로 부터 1부터 100사이의 임의의 정수 숫자를 입력받아서 이를 맞추는 실습 소스 예제. do~while반복문을 사용한다.
  */
public class ForEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int answer = (int)(Math.random()*31)+1; //random()메서드는 0.0이상 1.0미만 사이의 실수 숫자 난수를 발생시킴 ->
		//	*100하면 0.0이상 100.0미만 사이의 실수 숫자 난수 발생 -> (int)로 형변환 하면 소수점 이하는 버리고 정수 숫자만 구함
		// 즉 0이상 100미만 사이의 정수 숫자 난수 발생 ->+1하면 1이상 101미만 사이의 정수 숫자 난수를 구함.결국 1부터 100사이의 임의의 정수 숫자 난수가 발생
		
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("1~100사이의 임의의 정수숫자 입력>>");
			number = Integer.parseInt(scan.nextLine());
			
			if(number>answer) {
				System.out.print("더 작은 숫자를 입력하세요!");
			}else if(number < answer) {
				System.out.print("더 큰 숫자를 입력하세요!");
			}
		}while(number != answer);
		
		System.out.println("정답숫자는 "+number+"입니다");
	}
}
