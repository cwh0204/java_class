package day09;
/*
 * 	작성일 : 2025-08-25
 *	작성자 : 최원효
 * 	설명 : Anima102 클래스를 설계할 때 클래스 소속 맴버 변수인 속성을 정의할 때 private로 정의하면 외부 클래스에서
 *  접근 못한다. 이런 경우에 어떻게 처리하는지에 대한 코드이다.
 */

class Animal03{
	String name;
	private int age; //age 맴버변수 즉 속성을 private으로 정의하면 Animal03 클래스 외부에서 접근 못한다.
	//자바 데이터 보완성이다. 이런경우 값을 저장할 때는 setter()메서드를 호출해서 사용하고, 값을 반환할때는 getter()메서드를 호출해서 사용한다.
	public void setAge(int new_age) {
		/*
		 * set+속성명(맴버변수명으로 가고 첫글자는 영문 대문자로 한다. -> 값 저장 메서드이다 통칭해서 setter()메서드라고 부른다.
		 */
		age = new_age;
	}
	
	public int getAge() {
		
		return age;
	}
}

public class ObjectEx03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal03 a;
		a = new Animal03();
		
		a.name = "홍길동";
		a.setAge(25);
		
		System.out.println("이름 : " + a.name +" 나이 :" + a.getAge());
	}
}
