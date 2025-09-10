package day18;

import java.util.HashSet;
import java.util.Set;

/*
 * 작성일 : 2025-09-10
 * 작성자 : 최원효
 * 설명 : java.util 패키지의 컬렉션 Set 인터페이스의 특징)
 * 		 1. 저장되는 순서를 보장하지 않는다.
 * 		 2. 중복 원소값을 허용하지 않는다.
 * 
 */
public class ListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add(100); //int -> Integer 타입으로 오토박싱 된 다음 최상위 부모 클래스 타입으로 업캐스팅 됨.
		set.add(10.3); //오토박싱과 업캐스팅
		set.add(100); //중복 원소값 허용 안함.
		set.add("홍길동");//String -> Object타입으로 업캐스팅
		set.add(true);
		
		System.out.println("컬렉션 크기인 원소 개수:"+set.size());
		System.out.println(set);
		
	}

}
