package day18;

import java.util.ArrayList;
import java.util.ListIterator;

/*
 * 작성일 : 2025-09-10
 * 작성자 : 최원효
 * 설명 : java.util 패키지의 Iterator 인터페이스를 구현 상속 가능한 ListIterrator 인터페이스 특징)
 * 		 1. 자바 2 버전에서 추가됨
 * 		 2. iterator를 상속받아서 기능을 추가한 것으로 컬렉션 저장된 복수개의 원소값을 읽어올 때 양방향 이동이 모두 가능하다.
 * 			다만 List컬렉션 인터페이스 를 구현 상속한 자손 컬렉션 클래스인 ArrayList, LinkedList 등 에서만 사용가능하다.
 */
public class ListEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		int a = (int)list.get(1);
		
		ListIterator it = list.listIterator();
		
		while(it.hasNext()) {
			System.out.print(" "+it.next());
		}
		System.out.println("\n==================================\n");
		
		while(it.hasPrevious()) {
			System.out.print(" "+it.previous());
		}
	}
}
