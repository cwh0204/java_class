package 람다식;

public class UsingThisExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 	문제) UsingThis 외부클래스 객체명 usingThis 생성한 다음, 인스턴스 멤버내부클래스 객체명 inner를 생성해서 멤버내부클래스에 정의된
		 * 	method()를 호출하는 과정 자바코드를 해보자.
		 */
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		
		UsingThis.Inner inner01 = new UsingThis().new Inner();
		
		inner.method();
		inner01.method();
	}
}
