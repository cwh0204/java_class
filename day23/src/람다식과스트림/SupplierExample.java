package 람다식과스트림;

import java.util.function.IntSupplier;

/*
 * java.util.function 패키지의 Supplier 계열의 내장 함수형인터페이스 특징)
 * 	1. 매개값(인자값)은 없고, 리턴(반환)값은 있다.
 */
public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        IntSupplier intSupplier = () -> {
            /*
             * Math.random() 정적메서드를 사용해서 1부터 6사이의 임의의 정수수자 난수를 발생해 그 값을 리턴하여 임의의 주사위 눈의 수를 구하는 자바 프로그램 코드를 만들어본다
             */
            int diceRoll = (int) (Math.random() * 6 )+1;
            return diceRoll;
        };
        
        
        System.out.println("주사위의 값은 "+intSupplier.getAsInt());
		
	}
}

