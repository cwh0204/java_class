package day02;
/*
 * 	작성일 : 2025-08-07
 *	작성자 : 최원효
 * 	설명: char 단일문자는 십진수 정수로 저장된다. 이것을 활용한 예제 소스
 */
public class ConvertEx14 {

	public static void main(String[] args) {
		
		char a = 'a'; //'a'는 십진수 정수 97
		char d = 'd'; //'a'는 십진수 정수 100
		char zero = '0'; //'a'는 십진수 정수 48
		char two = '2'; //'2'는 십진수 정수 50
		char bigA = 'A';
		System.out.printf("'%c' - '%c' = %d \n",d ,a ,d-a);
		System.out.printf("'%c' - '%c' = %d \n",two ,zero, two-zero); //50-48=2
		System.out.printf("'%c' = %d \n", a, (int)a);
		System.out.printf("'%c' = %d %n", d, (int)d);
		System.out.printf("'%c' = %d %n", zero, (int)zero);
		System.out.printf("'%c' = %d \n", two, (int)two);
		System.out.printf("'%c' = %d \n", bigA, (int)bigA);
	}

}
