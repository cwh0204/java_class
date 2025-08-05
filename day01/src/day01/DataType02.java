package day01;
/**
	작성일: 2025-08-04
	작성자: 최원효
	설명: 자바의 변수 선언법
	
	자료형(타입) 변수명; (세미콜론)은 한 문장 끝을 의미한다.
	변수명을 선언하고 최초값을 저장하는 것을 변수 초기화라고 한다.
	
*/
public class DataType02 {

	public static void main(String[] args) {
		
		int age; //4바이트 int타입 변수 age변수 선언
		age = 25; //=은 오른쪽 정수숫자값 25를 좌측변수 age에 대입하라는 대입연산자이다.
		System.out.println("나이:"+age);//+는 문자열 연결 연산기호
		age = 27; //age변수명에는 단 하나의 값만 저장할 수 있다. 마지막에 저장된 값만 남는다.
		System.out.println("변경된 나이:"+age);
	}

}
