package day11;
/*	
 *  작성일 : 2025-08-28
 *	작성자 : 최원효
 *	설명 : 같은 클래스내에서 오버로딩 된 다른 생성자를 호출할 때는 this()를 사용한다.
 */

class MyDate27{
	private int year;
	private int month;
	private int day;
	
	public MyDate27() {
		this(2025,8,26); //같은 클래스내에서 전달인자 3개짜리 오버로딩 된 생성자 호출
	}

	public MyDate27(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void print() {
		System.out.println(year+"년 "+month+"월 "+day+"일");
	}
}
public class ConsEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate27 md27 = new MyDate27();
		md27.print();
	}
}
