package day11;
/*	
 *  작성일 : 2025-08-28
 *	작성자 : 최원효
 *	설명 : 기본 생성자 (디폴트 생성자) 특징)
 *		  1. 기본생성자는 전달인자가 없는 생성자를 말한다. 생성자가 오버로딩이 안된 경우에는 자바 컴파일러가 묵시적인 기본 생성자를 제공한다.
 *
 */

class MyDate24{
	private int year;
	private int month;
	private int day;
	
	public void pr() {
		System.out.println(year+"년 "+month+"월 "+day+"일");
	}
}
public class ClassEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate24 md = new MyDate24();
		md.pr();
	}

}
