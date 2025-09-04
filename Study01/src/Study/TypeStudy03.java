package Study;
/*	
 *  작성일 : 2025-09-02
 *	작성자 : 최원효
 *	설명 : 자바언어에서 +연산기호의 특징)
 *		  숫자 + 숫자에서는 덧셈을 하는 덧셈 연산기호이다.
 *		  문자 + 숫자에서는 문자를 우선해서 숫자가 문자로 변경된다. 결국 문자+문자를 서로 연결하는 문자열 연결 연산기호가 된다.
 */
public class TypeStudy03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 100 + 100;
		System.out.println("100+100"+result);
		
		String re = 100 + "100"; // 100+"100" -> "100"+"100" 문자를 서로 연결해서 결국 문자열 100100이 된다.
		System.out.println(re);
		System.out.println("\n=======================================\n");
		
		/*
		 * 자바의 비교연산자 종류)
		 * 1.비교연산자 결과값은 boolean 타입인 true or false 이다.
		 * 2.비교/관계 연산자 종류)
		 * 	 >(~보다 크다), >= (~보다 크거나 같다), <(~보다 작다), <=(~보다 작거나 같다), ==(같다), !=(같지 않다)
		 */
		
		int a=100, b=50;
		
		boolean re01 =false;
		
		re01 = (a>b);
		
		System.out.println(a+" > "+ b +" : "+ re01);
		
		re01 = (a == b);
		
		System.out.println(a+" == "+ b +" : "+ re01);
		
		re01 = (a != b);
		
		System.out.println(a+" != "+ b +" : "+ re01);
		
		
	}

}
