package day09;
/*
 * 	작성일 : 2025-08-25
 *	작성자 : 최원효
 * 	설명 : new 키워드로 새롭게 생성된 객체는 서로 다른 객체주소를 가진다.
 * 
 */

class Tv05{
	int channelNumber;
}
public class ObjectEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		Tv05 a = new Tv05();
		Tv05 b = new Tv05();
		
		
		System.out.println("tv01 채널번호 : " + a.channelNumber+"\ntv02 채널번호 : " + b.channelNumber);
		
		a.channelNumber = 10;
		b.channelNumber = 15;
		
		System.out.println("tv01 채널번호 : " + a.channelNumber+" \ntv02 채널번호 : " + b.channelNumber);
	}

}
