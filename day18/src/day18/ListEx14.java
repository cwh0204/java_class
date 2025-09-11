package day18;

import java.util.ArrayList;

/*
 * 	작성일 : 2025-09-11
 * 	작성자 : 최원효
 *   설명 : 제네릭 타입간의 레퍼런스 형변환은 제네릭 와일드 카드 문법을 사용하면 제한적으로 허용된다.
 */
public class ListEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cityList = new ArrayList<>();
		
		cityList.add("soule");
		cityList.add("busan");
		cityList.add("daejeon");
		
		ArrayList<? extends Object> objlist;
		/*
		 * <? extends Object> 제네릭 타입간의 형변환 와일드 카드 문법 특징)
		 * Object을 상속한 자손은 제네릭 타입간의 형변환을 제한적으로 허용한다.(상한 제한 와일드 카드)
		 * 
		 */
		objlist = cityList;
		
		for(Object obj:objlist) {
			System.out.println(obj);
		}
	}
}
