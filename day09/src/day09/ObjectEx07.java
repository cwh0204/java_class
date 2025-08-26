package day09;
/*
 * 	작성일 : 2025-08-26
 *	작성자 : 최원효
 * 	설명 : 객체 배열
 */

class Tv07{
	String color;
	boolean power;
	int channel;
	
	//3개의 Tv07클래스 메서드 정의
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
	void channelReset() {
		channel = 0;
	}
}

public class ObjectEx07 {
	public static void main(String[] args) {
		
		Tv07[] tvArr = new Tv07[3]; //배열 크기가 3인 객체열
		
		//Tv07 객체를 생성해서 tvArr 객체 배열의 각 요소에 저장
		
		for(int i=0; i<tvArr.length; i++) {
			tvArr[i] = new Tv07(); //tvArr 배열의 i번째 새 Tv07 객체를 생성해서 저장, 즉 tvArr[i]에 Tv07 객체의 참조 주소값을 저장
			tvArr[i].channel = i + 10;
			tvArr[i].channelDown();
			
			System.out.println(tvArr[i].channel);
		}
		
		//채널번호를 1증가하고 출력
		System.out.println("================================");
		
		
		for(int i = 0; i<tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.println(tvArr[i].channel);
			tvArr[i].channelReset();
		}
	}
	
	
	
}
