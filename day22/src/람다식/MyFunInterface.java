package 람다식;

/*
 * @FunctionalInterface 어노테이션 특징)
 * 	1. 이 어노테이션은 자바8버전에서 추가되었고 람다식을 위한 인터페이스이다. 추상메서드가 딱 하나만 올 수 있다.
 * 	2. 이 어노테이션아 추가된 인터페이스를 함수형 인터페이스라고 한다. 함수형 인터페이스는 람다식 작성을 위한 인터페이스이다.
 * 	3. 이 어노테이션이 없더라도 인터페이스에 추상메서드가 딱 하나만 온다면 람다식을 위한 인터페이스로 활용가능하다.
 */

@FunctionalInterface
public interface MyFunInterface {
	
	void method(); //public abstract 키워드가 생략된 추상메서드. 추상메서드는 {]가 없고 실행문장이 없고 호출이 불가능하다.

}
