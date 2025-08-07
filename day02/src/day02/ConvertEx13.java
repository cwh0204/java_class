package day02;
/*
 * 	작성일 : 2025-08-07
 *	작성자 : 최원효
 * 	설명: 명시적인 형변환(캐스팅) 연산자를 사용한 예
 */
public class ConvertEx13 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a+b); //자동산술법에 의해서 byte+byte -> int+int=int가 된다. 덧셈 결과값은 4바이트 int이다 이것을 1바이트 크기인
		//byte형 변수 c에 저장할려고 하니 캐스팅 연산자인 (byte)를 사용해서 명시적인 형변환을 해야 한다.
		System.out.printf("%d + %d = %d \n",a,b,c);
		
		int d = a+b;
		System.out.println(a+" + "+b+" = "+d);
		
		a=10;
		b=30;
		c=(byte)(a*b);//곱셈 결과값이 byte형 범위를 벗어나서 자료 손실이 발생한다.
		System.out.printf("%d * %d = %d \n",a,b,c);
		
		d = a * b;
		System.out.println(a+ " * "+ b + " = " + d);
	}

}
