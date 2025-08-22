package day08;
/*
 * 	작성일 : 2025-08-22
 *	작성자 : 최원효
 * 	설명 : 절대값을 반환할 때 사용하는 키워드: return
 * 		  리턴타입이 없는 void형(반환값이 없다)
 * 
 */ 
public class ArrayTest08 {
	
	static int abs(int data) {
		if(data < 0) {
			data = -data;
		}
		return data;
	}
	
	static void abs2(int data) {
		if(!(data < 0)) {
			System.out.println("음의 정수 숫자만 입력하세요 !");
		}else {
			if(data < 0) {
				data = -data;
			}
			
			System.out.println("절대값 = " + data);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int resultData = abs(-100);
		abs2(-100);
		System.out.println("-100의 절대값 = " + resultData);
	}

}
