package day10;
/*
 * 	작성일 : 2025-08-26
 *	작성자 : 최원효
 * 	설명 : 전달인자(매개변수) 순서를 다르게 한 메서드 오버로딩 예)
 */

class Mt02{
	//첫번째 메서드 -> int,int,String
	
	public void print(int a,int b,String c) {
		System.out.println(a+"\t"+b+"\t"+c);
	}
	
	public void print(String c, int a, int b) {
		System.out.println(c+"\t"+a+"\t"+b);
	}
}
public class MethodEx02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mt02 m02 = new Mt02();
		m02.print(10, 20, "java");
		m02.print("java", 10, 20);
	}
}
