package day01;
/*
 * 	작성일 : 2025-08-05
 *	작성자 : 최원효
 * 	설명: 데이터 형 변환 
 * 	자바 기본타입에서 크기 범위가 큰 타입에서 작은 타입으로 형 변환을 할 때는 반드시 명시적인 캐스팅(형변환) 연산자를 사용해야 한다.
 *	반대로 크기 범위가 작은 타입에서 큰 타입으로 형변환은 자료 손실 위험이 없기 때문에 컴파일러에 의해서 자동형 변환을 해준다.
 */ 
public class DataType03 {

	public static void main(String[] args) {
		byte a = 1;
		short b = 128;
		int c = 32768;
		
		b = a; // 2바이트 크기로 변경. 내부적인 안시적 자동형 변환(자료 손실이 없기 때문에)을 해준다.
		System.out.println(b);
		
		b = (short)c;//4바이트 크기가 2바이트 크기로 축소되기 때문에 자료 손실 위험이 발생한다. 이런 경우는 자동형 변환을 해주지 않는다.
		//(short) 캐스팅 형변환 연산자를 사용해서 명시적인 형 변환을 해야한다. 하지만 저장되는 값이 short의 최대값 범위를 벗어나서 최소값이
		//출력된다. (비유적으로 tv채널번호에서 최대 범위를 벗어나면 최소 채널번호가 되는것을 생각하면 보다 더 쉽게 이해가 된다.
		
		System.out.println(b);
		
		System.out.println((double)c);
		System.out.println((String.valueOf(a)));
		
	}
}
