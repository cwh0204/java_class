package day18;
/*
 * 	작성일 : 2025-09-11
 * 	작성자 : 최원효
 *   설명 : 제네릭 클래스 설계
 */

class GenericClass<T>{ //<T> 정해지지 않은 가상의 제네릭 T타입
	private T member;
	
	public void setMember(T member) {
		this.member = member;
	}

	public T getMember() {
		return member;
	}
}
public class ListEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericClass<Double> gc01 = new GenericClass<>();
		GenericClass<String> gc02 = new GenericClass<>();
		GenericClass<Integer> gc03 = new GenericClass<>();
		
		gc01.setMember(10.7);
		gc02.setMember("sadasdasd");
		gc03.setMember(121212);
		
		System.out.println("반환되는 실수 숫자값 = "+gc01.getMember());
		System.out.println("반환되는 실수 숫자값 = "+gc02.getMember());
		System.out.println("반환되는 실수 숫자값 = "+gc03.getMember());
		
	}
}
