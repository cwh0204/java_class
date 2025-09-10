package day18;

import java.util.ArrayList;
import java.util.List;

/*
 * 작성일 : 2025-09-10
 * 작성자 : 최원효
 * 설명 : java.util 패키지의 List 컬렉션 인터페이스를 구현 상속한 ArrayList 컬렉션 클래스 특징(제일 중요함)
 * 		 1. 저장되는 순서를 보장한다.
 * 		 2. 중복 원소값을 허용한다.
 * 		 3. 자바 2(jdk 1.2) 버전에서 추가됨.
 */

interface a{
	
	void all(List a);
}

class b implements a{

	@Override
	public void all(List a) {
		// TODO Auto-generated method stub
		
		List<List> alls = new ArrayList();
		alls.add(a);
		System.out.println(alls);
	}
}

public class ListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new ArrayList();
		List<List> all = new ArrayList();
		a b = new b();
		
		list.add("seoul");
		list.add("seoul");
		list.add(7);
		list.add(10.7);
		list.add(true);
		list.add(7);
		
		all.add(list);

		System.out.printf("list 컬렉션 크기(원소개수)=%d \n", list.size());
		System.out.println(list);
		
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(all);
		
		b.all(list);
		
	}
}
