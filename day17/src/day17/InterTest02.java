package day17;
/*
 * 작성일 : 2025-09-09
 * 작성자 : 최원효
 * 설명 : 자바 5버전에서 추가된 오토박싱과 오토언박싱)
 * 		 1.오토박싱 : 기본 타입을 참조 레퍼클래스형으로 자동형 변환을 하는 것을 말한다.
 * 		 2.오토언박싱 : 레퍼 클래스 타입을 기본타입으로 형변환 하는 것을 말한다.
 */
public class InterTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n01 = 10;
		int n02;
		
		Integer num01;
		Integer num02 = new Integer(20);
		
		num01 = n01;//오토박싱
		System.out.println("오토박싱 된 값= "+num01);
		
		n02 = num02;//오토언박싱
		
		System.out.println("오토언박싱 된 값= "+n02);
	}
}
