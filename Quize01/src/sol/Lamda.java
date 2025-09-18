package sol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		numberSumImpl a = new numberSumImpl();
//		a.aavg();
//		a.asum();
//		a.asums();
		
		String[] strArray = {"홍길동","이순신","강감찬"};
		
		Stream<String> str = Arrays.stream(strArray);
		str.forEach(name -> System.out.println(name));
		
		int[] intArray = {100,101,102};
		IntStream inta = Arrays.stream(intArray);
		inta.forEach(num -> System.out.println(num));
		
		List<Object> asd = new ArrayList<>();
		asd.add("1");
		asd.add("2");
		asd.add("3");
		
		Stream<Object> a = asd.stream();
		
		a.forEach(System.out::println);
	}

}
