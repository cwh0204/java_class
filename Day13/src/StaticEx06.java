/*	
 *  작성일 : 2025-09-01
 *	작성자 : 최원효
 *	설명 : 메서드 오버라이딩 과 오버로딩의 차이점)
 *		  1. 메서드 오버로딩 : 오버로딩은 상속과 관련이 없다. 동일한 같은 클래스 내에서 같은 이름의 메서드명을 중복해서 여러번 정의하는 것을 말한다.
 *		  2. 메서드 오버라이딩)
 *			가. 오버라이딩의 전제조건은 상속 관계를 만들어야 적용된다. 상속관계에서 부모의 메서드 명, 메서드 리턴타입, 매개변수 타입 개수 모두 동일한
 *			원형을 자손에서 상속받은 상태에서 자손에 맞게 {}내의 본분 실행문장을 변경 수정하는 것을 말한다.
 *
 *		  생성자는 상속되지 않는다. 그러므로 생성자 오버로딩 문법은 존재하지만 오버라이딩 문법은 존재하지 않는다..
 *		  3. 자손에서 부모의 메서드를 호출할 때는 super.메서드(); 으로 호출한다.
 */

class Parent06{
	void p06() {
		System.out.println("부모클래스 메서드 p06()");
	}
}

class Child06 extends Parent06{

	@Override
	void p06() {
		// TODO Auto-generated method stub
		super.p06();
	}
	
}
public class StaticEx06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Child06 ch06 = new Child06();
		ch06.p06();
	}

}
