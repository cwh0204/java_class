package day14;
/*
 * 레퍼런스 간의 형변환 중 업캐스팅 특징)
 * 1. 업캐스팅을 할려면 사전에 상속 관계를 만들어야 한다
 * 2. 업캐스팅이란 자손타입이 부모타입으로 올라가는 현상을 말한다 암묵적인 자동형 변환을 해준다.
 */
class Mother01{//extends Object이 생략됨
	public void m01() {
		System.out.println("부모클래스 m01() 메서드");
	}
}

class Child01 extends Mother01{
	public void ch01() {
		System.out.println("자손 클래스 ch01() 메서드");
	}
}
public class RefCast01 {

	public static void main(String[] args) {
		
		Mother01 m01; //부모클래스 타입 참조변수 선언 -> 객체주소가 저장 안된 참조변수 m01
		m01=new Child01(); //업캐스팅
		m01.m01();
		System.out.println("\n ======================================= \n");
		
		Mother01 m02 = new Child01(); //업캐스팅
		m02.m01();
	}

}
