package Study;
/*	
 *  작성일 : 2025-09-02
 *	작성자 : 최원효
 *	설명 : java의 산술연산자(수학) 연산자 종류)
 *		  +(덧셈),-(뺄셈),*(곱셈),/(나눗셈) -> 정수 숫자를 나눗셈 하면 몫만 구하고 실수 숫자를 나눗셈 하면 몫과 나머지를 함께 구한다.),
 *		  %(나머지)
 */
public class TypeStudy02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 6;
		int result = 0;
		
		result = a+b;
		System.out.println(a+" + "+b+" = "+ result);
		
		System.out.println(a+" - "+ b +" = "+ (a-b));
		
		result = a*b;
		System.out.println(a+" * "+b+" = "+ result);
		
		result = a/b;
		System.out.println(a+" / "+b+" = "+ result);
		
		double re = 12.0/4.0;
		
		System.out.println("12.0 / 4.0 = "+ re);
		
		result = a%b;
		System.out.println(a+" % "+b+" = "+ result);
	}

}
