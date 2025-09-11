package day18;

import java.util.ArrayList;
import java.util.List;

/*
 * 	작성일 : 2025-09-11
 * 	작성자 : 최원효
 *   설명  : 컬렉션에 제네릭을 지정함으로서 불필요한 업캐스팅과 다운캐스팅을 하지 않아도 된다.
 */
public class ListEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nameList = new ArrayList<String>();
		//<String> 문자열 타입만 저장 가능한 컬렉션 제네릭 지정, 업캐스팅 하면서 컬렉션 제네릭 객체 nameList생성
		
		nameList.add("hong gil dong");
		nameList.add("lee sun shin");
		// nameList.add(100); //문자열만 저장 가능하다.
		nameList.add("park chan ho");
		
		String result = "";
		for(int i=0; i<nameList.size(); i++) {
			result = nameList.get(i);
			System.out.println(result.toUpperCase());
		}
		System.out.println("\n===============================\n");
		
		//자바 5버전에서 추가된 향상된 확장 for반복문을 사용해서 컬랙션 또는 배열에 저장된 복수개의 원소값을 읽어오는 용도로 활용
		for(String name : nameList) {
			System.out.println(name.toUpperCase());
		}
	}
}
