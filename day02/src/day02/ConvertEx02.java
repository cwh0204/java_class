package day02;
/*
 * 	작성일 : 2025-08-06
 *	작성자 : 최원효
 * 	설명: 자바의 산술(수학) 연산자 종류
 *  +(덧셈), -(뺄셈), *(곱셈), /(나눗셈: 주의할 것은 정수 숫자를 나눗셈 하면 몫만 구하고, 실수 숫자를 나눗셈하면 몫과 나머지를 함께 구한다
 *  %(나머지)
 */
public class ConvertEx02 {

	public static void main(String[] args) {
		
		int a=10, b=4, result=0; // 3개의 int타입 변수를 함꺼번에 선언과 초기화
		
		result = a+b;
		System.out.printf("%d + %d = %d \n", a, b, result);
		System.out.println(a+" - "+b+" = "+ (a-b));
		
		result = a*b;
		System.out.println(a+" * "+b+" = "+ result);
		
		result = a/b;
		System.out.println(a+" / "+b+" = "+ result);
		
		result = a%b;
		System.out.println(a+" % "+b+" = "+ result);
		
		double c = (double)a / b;//자동산술법에 의해서 double/double이 된다. 결국 실수 숫자를 나눗셈 하면 몫과 나머지를 같이 구해서
		//2.5가 된다
		System.out.println("10.0 / 4.0 = "+c);
	}

}
