package day18;

import java.util.Enumeration;
import java.util.Hashtable;

/*
 * 	작성일 : 2025-09-11
 * 	작성자 : 최원효
 *   설명 : java.util 패키지의 Map 컬렉션 인터페이스를 구현 상속한 자손 Hashtable 컬렉션 클래스 특징)
 *   	   1. 키,값 쌍으로 저장되는 컬렉션 사전적인 자료구조
 *   	   2. 키를 통해서 값을 검색하기 때문에 검색 속도가 빠르다.
 *   	   3. 저장되는 순서를 보장하지 않는다.
 *   	   4. Hashtable 컬렉션 클래스는 자바 1(jdk1.0) 초기 버전에서 추가됨.
 */
public class ListEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String, String> ht = new Hashtable<String,String>(); //키,값 쌍으로 문자열만 저장가능한 컬렉션 제네릭 타입
		
		// <String>을 지정
		
		ht.put("apple", "사과");
		ht.put("orange", "오랜지");
		ht.put("grape", "포도");
		
		String value = ht.get("apple");
		if(value != null) {
			System.out.println("apple : "+value);
		}
		System.out.println("\n ==================================== \n");
		
		Enumeration<String> enum2 = ht.keys(); //keys() 메서드는 모든 키에 대한 Enumeration 반환
		while(enum2.hasMoreElements()) {//읽을 수 있는 요소가 있다면 참
			String k = enum2.nextElement();//다음 키를 가져옴.
			String v = ht.get(k);//키에 대한 값을 구함.
			System.out.println(k+" : "+v);
		}//while
		
		System.out.println(ht);
	}
}
