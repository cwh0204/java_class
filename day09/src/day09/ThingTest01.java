package day09;
/*
 * 	작성일 : 2025-08-26
 *	작성자 : 최원효
 * 	설명 : 11장. 클래스와 객체.pdf No.13 1번문제) 다음예제에서 문제점을 발견하고 이를 수정해봅시다
 *
 */

class Thing10{
	private int x;
	
	public int getNum() {
		return  x;
	}
	public void setNum(int x) {
		this.x = x;
	}
}

public class ThingTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thing10 thing1 = new Thing10();
		
		thing1.setNum(10);
		System.out.println(thing1.getNum());
		
	}

}
