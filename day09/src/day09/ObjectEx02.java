package day09;
/*
 * 	작성일 : 2025-08-25
 *	작성자 : 최원효
 * 	설명 : 클래스와 객체 지향에 관한 소스 => 객체 지향 프로그래밍 (OOP)
 */

class Animal102{
	String name;
	int age; //클래스 소속의 속성 2개인 name,age 정의 이 속성을 클래스 소속 맴버변수라고 한다. 맴버변수 중 객체 생성해서
	//접근하는 인스턴스 변수
}

class Thing{
	int x;
}

class Things{
	int x;
	class Thing01{
		int y;
		class Thing02{
			int z;
		}
	}
}


public class ObjectEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal102 a = new Animal102();
		a.name = "원숭이";
		a.age = 12;
		System.out.printf("이름은 %s 나이는 %d \n",a.name,a.age);
		
		/*
		 * 11장. 클래스와 객체.pdf No.10의 1번 문제)
		 * b 객체를 하나 더 생성하여 b로 접근하도록 하고 이름은 펭귄, 나이는 12를 저장한 후 출력하는 자바 코드를 만들어 보자.
		 */
		Animal102 b = new Animal102();
		b.name = "팽귄";
		b.age = 12;
		System.out.printf("이름은 %s 나이는 %d\n",b.name,b.age);
		
		/*
		 * 11장. 클래스와 객체 pdf No.10의 2번 문제
		 * 하나의 속성 int형 변수 x를 갖는 Thing 클라스 설계한 후 객체 thing를 생성한후 속성x에 값 10을 지정한후 속성 x의 값을 출력
		 */
		
		Thing c = new Thing();
		c.x = 10;
		
		Thing d = new Thing();
		d.x = 15;
		
		System.out.println("x의 값은 " + c.x +" 입니다");
		System.out.println(d.x + c.x);
		
		Things e = new Things();
		Things.Thing01 thing01 = e.new Thing01();
		thing01.y = 13;
		
		System.out.println("y의 값은 " + thing01.y +" 입니다");
	}

}
