package 람다식과스트림;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 *	컬렉션에 저장된 복수개의 원소값을 jdk 1.2버전에서 추가된 Iterator 인터페이스를 사용해서 다음 원소값을 쉽게 읽어오는 기존방법과 자바 8버전에서
 *	추가된 스트림과 람다식을 사용해서 보다 더 간결하게 컬렉션 원소값을 읽어오는 비교 예제 
 */
public class IteratorAsStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("홍길동","이순신","강감찬");
		
		/*
		 * Iterator를 사용해서 컬렉션의 다음 원소값을 읽어옴 -> 컬렉션에 저장하는 용도로 사용하는 컬렉션 자료구조는 아니다.
		 * 한 번 사용하면 다시 사용 못한다. 다시 사용하려면 재 생성해야 한다.
		 */
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		System.out.println("\n ======================== \n");
		
		Stream<String> stream =list.stream();
		stream.forEach(name -> System.out.println(name));
	}
}
