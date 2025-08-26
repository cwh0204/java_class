package day10;
/*
 * 	작성일 : 2025-08-26
 *	작성자 : 최원효
 * 	설명 : 기본 자료형과 레퍼런스 참조형의 차이점 01)
 *        기본타입(기본자료형)으로 선언된 변수 값을 저장하고, 
 *        참조타입으로 선언된 변수에는 객체주소를 저장해서 주소값을 공유해서 값도 함께 공유 수정할 수 있다.
 */

class MyDate05{
	int year = 2024;
	int month = 10;
	int day = 31;
}
public class MethodEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 7;
		int y = x;
		
		MyDate05 d = new MyDate05();
		MyDate05 t = d; //t참조변수에 d객체주소를 대입. 결국 t와 d는 같은 객체주소를 가리킨다. 즉 같은 주소값을 공유한다.
		
		
		System.out.println("x="+x+", y" + y); //7,7
		System.out.println(d.year+" 년"+d.month+" 월"+d.day+"일");//2024년 10월 31일
		System.out.println(t.year+" 년"+t.month+" 월"+t.day+"일");//2024년 10월 31일
		
		y = 10;
		System.out.println("x="+x+" ,y"+y);
		t.year = 2025; t.month=8; t.day=26;
		System.out.printf("%d/%d/%d \n", t.year,t.month,t.day);
		System.out.println(d.year+"/"+d.month+"/"+d.day);
	}

}
