package day10;
/*
 * 	작성일 : 2025-08-27
 *	작성자 : 최원효
 * 	설명 : 기본 타입 매개변수는 값만 전달된다. 객체주소를 공유하지 않아서 값도 공유 못한다.
 */
class Data12{
	int x;
}

public class MathodEx12 {
	
	static void change(int a) {
		a = 1000;
		System.out.println("change( ) a = " + a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data12 d = new Data12();
		d.x = 100;
		
		System.out.println("main( ) x = " + d.x);
		
		change(d.x);
	
		System.out.println("change() 메서드 호출 후 main() x ="+d.x); //100
	}

}
