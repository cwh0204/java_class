package day10;
/*
 * 	작성일 : 2025-08-26
 *	작성자 : 최원효
 * 	설명 : 레퍼런스(참조) 타입 변수가 같은 객체주소를 공유해도 new 키워드로 새로운 객체를 생성하면 새로운 주소값이 할당된다.
 *        그러므로 주소값이 달라서 값도 공유 못한다.
 */

class MyDate07{
	int year = 2024;
	int month = 12;
	int day = 15;
}

public class MethodEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate07 d = new MyDate07();//객체 생성
		MyDate07 t = d; //t 참조변수에 d객체주소를 대입,결국 t와 d가 같은 객체주소를 가리킨다.
		
		
		System.out.printf("%d년 %d월 %d일 \n", d.year, d.month, d.day);
		System.out.println(t.year+"년 "+t.month+"월 "+t.day+"일");
		
		t = new MyDate07();//새로운 객체 t를 다시 생성하면 다른 객체주소값을 가진다.
		t.year = 2025;
		t.month = 8;
		t.day = 27;
		
		System.out.printf("%d년 %d월 %d일 \n", d.year,d.month,d.day);
		System.out.printf("%d년 %d월 %d일 \n", t.year, t.month, t.day);
	}

}
