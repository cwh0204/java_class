package day18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 작성일 : 2025-09-10
 * 작성자 : 최원효
 * 설명 : java.util 패키지의 Iterator 인터페이스 특징)
 * 		 1. 자바 2(jdk 1.2)에서 추가됨.
 * 		 2. 컬렉션에 저장된 복수개의 데이터를 읽어오는 용도로 사용된다. 저장되는 용도로 사용하는 컬렉션 자료구조는 아니다.
 * 		 3. 한번 읽어 온 자료는 다시 읽어 오지 못한다. 다시 읽어오기 위해서는 재 생성해야 한다.
 * 		 4. 단 방향으로만 데이터를 읽어온다.
 * 		 5. 주로 자바 2에서 추가된 컬렉션과 잘 맞는다.
 */

public class ListEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		
		list.add("홍길동");
		list.add(1000);
		list.add(true);
		list.add("홍길동");
		list.add("서울시");
		
		Iterator elements = list.iterator();
		while(elements.hasNext()) {
			System.out.println(elements.next());
		}
	}
}
