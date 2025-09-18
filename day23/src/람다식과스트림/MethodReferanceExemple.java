package 람다식과스트림;

import java.util.function.IntBinaryOperator;

/*
 * 	IntBinaryOperator 함수형 인터페이스를 활용하여 람다식을 정적메서드 참조와 인스턴스 메서드 참조로 변환하는 실습 소스
 */

public class MethodReferanceExemple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 		java.util.function 패키지의 내장 함수형인터페이스 IntBinaryOperator 특징)
		 * 		1.이 함수형 인터페이스에 정의된 추상메서드 int applyAsInt(int left,int right)는 int 타입 2개 매개값을 가지고 연산한 다음
		 * 		동일한 타입 int로 연산 결과값을 반환한다.
		 */
		IntBinaryOperator operator;
		operator = (left,right) -> Calculator.staticMethod(left, right);
		System.out.println("덧셈 결과값 = " + operator.applyAsInt(10, 10));
		
		
		//위의 람다식을  정적메서드 참조로 변경
		operator = Calculator :: staticMethod;
		System.out.println("덧셈 결과값2 = "+ operator.applyAsInt(5, 5));
		
		//람다식 -> 인스턴스 메서드 참조로 변환
		Calculator obj = new Calculator();
		operator = (x,y) -> obj.instanceMethod(x, y);
		System.out.println("곱셈 결과값 = "+operator.applyAsInt(7, 7));
		
		operator = obj :: instanceMethod;
		System.out.println("곱셈 결과값 = "+operator.applyAsInt(7, 7));
	}
}
