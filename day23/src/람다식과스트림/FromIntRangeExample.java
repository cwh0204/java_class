package 람다식과스트림;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 숫자 범위로 부터 스트림을 얻어서 1부터 100까지 누적합을 구한다.
 */

public class FromIntRangeExample {
	static int sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 문제) IntStream 스트림 api를 활용해서 1부터 100까지의 자연수를 구한 다음 람다식으로 누적합을 구해서 출력하는 자바 코드를
		 * 만들어 본다.
		 */

//		IntStream a = IntStream.rangeClosed(1, 100);
//
//		sum = 0;
//
//		/*
//		 * 야간 복습 보강문제 01) 일반 for 반복문을 사용해서 1부터 10사이의 임의의 정수숫자 난수를 발생한 다음 이것을 numList
//		 * 컬렉션에 저장하고 출력하는 자바 코드를 만들어 본다.
//		 */
//
//		List<Integer> a1 = new ArrayList<>();
//		for (int i = 1; i <= 10; i++) {
//			a1.add((int)(Math.random() * 10) + 1);
//		}
//
//		System.out.println(a1);
////
////		List<Integer> a2 = IntStream.rangeClosed(1, 10).map(i -> (int) (Math.random() * 10) + 1).boxed().collect(Collectors.toList());
//
////		System.out.println(a2);
//		sum = 0;
//		for(int i : a1) {
//			sum+=i;
//		}
//		System.out.println(sum);
		
		
		List<Integer> a2 = new ArrayList<>();
		
		a2 = IntStream.rangeClosed(1, 10).map(i -> (int)(Math.random() * 10) + 1).boxed().collect(Collectors.toList());
		
		
		System.out.println(a2);
		
		a2 = a2.stream().sorted().distinct().collect(Collectors.toList());
		
		System.out.println(a2);
		
//		a1.stream().sorted().distinct().forEach(n -> a2.add(n));
//		
//		System.out.println(a2);
		
	}
}
