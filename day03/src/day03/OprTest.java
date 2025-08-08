package day03;
/*
 * 	작성일 : 2025-08-08
 *	작성자 : 최원효
 * 	설명: 자바의 char타입 문자형을 활용한 비교연산자 예제
 */
public class OprTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("'0' == \t %b \n", '0' == 0); //%b는 boolean 타입인 true or false 출력혈태 지시자이다.
		//\t는 탭키만큼 수평으로 띄운다. \n은 줄바꿈 해준다 '0'단일문자형은 십진수 정수 48이다. 결국 48 == 0 -> false
		
		System.out.printf("'A' == 65 \t %b \n", 'A' == 65);//'A'는 십진수 정수 65이다 결국 65 == 65 --> true
		
		System.out.printf("'A' > 'B' \t %b \n", 'A' > 'B'); //'B'는 십진수 정수 66이다. 결국 65 > 66 -> false
		
		System.out.printf("'A' + 1 != 'B' \t %b \n", 'A'+1 !='B'); // 65+1 != 66 -> false
	}

}
