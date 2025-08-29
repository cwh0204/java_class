package day11;
/*	
 *  작성일 : 2025-08-29
 *	작성자 : 최원효
 *	설명 : 13장 생성자.pdf No.19 1번 문제)
 *	Animal 클래스에 생성자를 추가하시오. (생성자 오버로딩)
 *	
 */

class Animal{
	String name;
	int age;
	/*
	 * 생성자가 오버로딩이 되면 매개변수가 없는 기본 생성자는 더이상 제공되지 않는다.
	 */
	public void show() {
		System.out.println(name + "는" + age + "살입니다");
	}
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
}
public class Ex13_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal("원숭이",26);
		a1.show();
	}
}
