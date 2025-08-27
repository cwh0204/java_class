package day10;
/* 	
 *  작성일 : 2025-08-27
 *	작성자 : 최원효
 */
class Data13{
	int x;
}

public class MethodEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data13 d = new Data13();
		
		d.x = 10;
		
		System.out.println("main() d.x = " + d.x);
		
		change(d);
		
		System.out.println("change()매서드 호출 후 main()"+d.x);
	}
	static void change(Data13 d2) {
		d2.x = 1000;
		System.out.printf("d2.x = %d", d2.x);
	}

}
