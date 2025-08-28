package day11;
/*	
 *  작성일 : 2025-08-28
 *	작성자 : 최원효
 *	설명 : 생성자 또는 메서드 {} 블록 내에서 클래스 소속의 맴버변수 중 인스턴스 변수명과 생성자나 메서드 소속의 전달인자(매개변수)명이 같은 경우
 *		  인스턴스 변수명 앞에 this. 을 붙이면 구분이 안되어져서 값을 저장할 수 있다.
 */
class MyDate26{
	private int year;
	private int month;
	private int day;
	
	public MyDate26() {}
	
	public MyDate26(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void setYear(int year) {
		this.year=year;
	}
	public void pr() {
		System.out.println(year+"년 "+month+"월 "+day+"일");
	}
}

public class ConsEx08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate26 md = new MyDate26(2025,10,30);
		md.pr();
		md.setYear(2026);
		md.pr();
	}
}
