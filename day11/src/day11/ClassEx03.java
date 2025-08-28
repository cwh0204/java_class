package day11;
/*	
 *  작성일 : 2025-08-28
 *	작성자 : 최원효
 *	설명 : 1.생성자 이름은 클래스 이름과 같게 정의한다. new 클래스명(); 에 의해서 생성자를 호출한다.
 *		  2.생성자의 주된 기능은 클래스 소속의 멤버변수 중 객체 생성해서 접근하는 인스턴스 변수 초기화 기능이다.
 *		  3.생성자 명 앞에 리턴타입을 기술하지 않는다.
 */

class MyDate23{
	private int year;
	private int month;
	private int day;
	
	public MyDate23() {
		year = 2025;
		month = 8;
		day = 28;
	}
	
	public void print() {
		System.out.println(year+"년 " + month+ "월 "+day+"일 ");
	}
}
public class ClassEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate23 my = new MyDate23();

		my.print();
	}
}
