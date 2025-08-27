package day11;
/*	
 *  작성일 : 2025-08-27
 *	작성자 : 최원효
 *	설명 : 12장.메서드 살피기.pdf No.19의 1번문제)
 *		  p() 메서드를 오버로딩하여 두 int 타입 매개변수에 대해서 두 double 매개변수에 대해서 각각 최대값을 구하는 메서드를
 *		  작성해본다.
 */
public class Ex12_01 {
	
	double p(double a, double b) {
		double c = 0;
		
		if(a >= b) {
			c = a;
		}else {
			c = b;
		}
		return c;
	}
	
	int p(int a, int b) {
		int c = 0;
		
		if(a >= b) {
			c = a;
		}else {
			c = b;
		}
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex12_01 max = new Ex12_01();
		
		System.out.println(max.p(1, 2));
		System.out.println(max.p(12.3, 11.3));
	}

}
