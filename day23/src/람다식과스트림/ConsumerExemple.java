package 람다식과스트림;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

/*
 * 	java.util.function	패키지의 Consumer	계열의 내장 함수형 인터페이스 특징)
 * 	1. 매개값(인자값)은 있고, 리턴값은 없다.(void)
 * 	2.
 * 
 */

public class ConsumerExemple {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer = t -> System.out.println(t+"21");
		consumer.accept("Java ");
		
		BiConsumer<String,String> biConsumer = (t,u) -> System.out.println(t+" "+u);
		biConsumer.accept("java","javaScript");
		
		DoubleConsumer doubleConsumer = value -> System.out.println("java" + value);
		doubleConsumer.accept(21.0);
		
		ObjIntConsumer<String> objIntConsumer = (t,value) -> System.out.println(t+value);
		objIntConsumer.accept("java", 21);
	}
}
