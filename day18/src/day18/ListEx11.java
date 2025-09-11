package day18;

import java.util.HashMap;
import java.util.Map;

/*
 * 	작성일 : 2025-09-11
 * 	작성자 : 최원효
 *   설명 : java.util 패키지의 컬렉션 Map인터페이스를 구현 상속한 컬렉션 클래스 HashMap 특징)
 *   		1. Map과 HashMap은 자바 1.2(2)버전에서 추가됨.
 *   		2. 키,값 쌍으로 저장되는 영어 사전적인 컬렉션 자료구조이다. 저장되는 순서를 보장하지 않는다
 *   		3. 키를 통해서 값을 검색하기 때문에 검색 속도가 빠르다.
 */
public class ListEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> m = new HashMap<>(); // * 앞 부분 제네릭 타임만 봐도 뒷부분 제네릭 타입이 무엇인지 추론이 가능해서 자바 7버전부터는
		// 뒷 부분 제네릭 타입은 다음과 같이 생략됨. -> <>
		
		String[] sample = {"to","be","or","not","to","be","is","a","p"};
		
		//문자열 키에 포함된 단어 빈도수 계산
		for(String k : sample) {
			Integer freq = m.get(k);//키에대한 값을 구함
			System.out.println(freq);
			m.put(k, (freq == null) ? 1: freq+1);
		}
		
		System.out.println(m.size()+"개 단어가 있습니다.");
		System.out.println(m.containsKey("to"));
		System.out.println(m);
	}
}
