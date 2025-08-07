package day02;
/*
 * 	작성일 : 2025-08-07
 *	작성자 : 최원효
 * 	설명: 자바의 산술 수학연산자
 */
public class ConvertEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d \n", a,b,a+b);
		
		int result = a*b;
		System.out.println(a+" * "+ b + " = " + result);
		
		result = a/b;
		System.out.printf("%d / %d = %d \n", a,b,result);
		
		result = a%b; //%는 나머지 연산
		
		System.out.printf("%d\n",result);
		
		/*
		 * 문제 int 타입 b변수값을 double 타입으로 형변환해서 나눗셈 한 결과값을 소수점 이하 6자리까지 구하는 자바코드를 해보자.
		 * printf(메서드를 활용한다)
		 */
		
		System.out.printf("%.6f \n", a / (double)b);
	}

}
