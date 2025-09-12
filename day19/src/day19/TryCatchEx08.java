package day19;
/*
 * 	작성일 : 2025-09-12
 * 	작성자 : 최원효
 *   설명 : for 반복문 안에서 try-catch문 예외 처리
 */
public class TryCatchEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 100;
		int result = 0;
		
		for(int i=1; i<=10; i++) {
			try {
				result = number / (int)(Math.random() * 10); // random()정적 메서드는 0.0이상 1.0미만 사이의 실수숫자 난수가 발생
				// -> *10하면 0.0이상 10.0미만 사이 실수 숫자 난수 -> (int)로 캐스팅 하면 소수점 이하는 버리고 0이상 10미만 사이 정수숫자 난수
				// 즉 0부터 9사이의 정수숫자 난수가 발생
				
				System.out.println("result = "+result);//정수숫자를 나눗셈하면 몫만 구함.
			}catch(ArithmeticException ae) {
				System.out.println("0");//정수 숫자 난수가 0일때 예외 에러가 발생해서 출력된다.
			}
		}//for
	}
}
