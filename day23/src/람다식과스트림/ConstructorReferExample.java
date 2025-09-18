package 람다식과스트림;

import java.util.function.BiFunction;
import java.util.function.Function;

/*
 * 	생성자 참조를 위한 소스
 */

public class ConstructorReferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 	Function 내장 함수형 인터페이스 특징)
		 * 	1. 인자값도 있고, 리턴값도 있다. 인자값을 리턴값으로 타입변환을 해준다.
		 */
		
		Function<Integer,Member2> fun01 = Member2 :: new;
		Member2 member01 = fun01.apply(7);
		
		
		BiFunction<String, String, Member2> fun02 = Member2 :: new;
		Member2 member02 = fun02.apply("10", "10");
		
		Member2 member03 = new Member2("10","10");
	}

}
