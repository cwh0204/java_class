package day18;

import java.util.ArrayList;
import java.util.List;

/*
 * 	작성일 : 2025-09-11
 * 	작성자 : 최원효
 *   설명  : 컬렉션에서 제네릭이 나온 배경에 대해서 살펴 볼수 있는 예제)
 *   	1. <제네릭타입>은 래퍼런스 참조 타입만 가능하고 기본 타입으로는 지정할 수 없다. <제네릭타입>은 자바 5버전에서 추가되었다.
 *   	2. 제네릭(지네릭스) 타입을 지정하면 지정한 자료형으로만 저장 가능하다.
 *   	3. 제네릭 타입을 지정하지 않으면 불필요한 레퍼런스간의 업캐스팅과 명시적인 캐스팅 형변환 연산자를 사용한 명시적인 다운캐스팅을 래야 하는 불편함이 있다.
 *      4. 그만큼 프로그램 실행 속도는 떨어지고 코드는 복잡해 져서 가독성이 떨어진다. 그리고 데이터 안정성도 떨어진다.
 */
public class ListEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cityList = new ArrayList<String>();
		
		cityList.add("seoul"); //object 타입으로 업캐스팅 하면서 저장
		cityList.add("busan");
		cityList.add("baejeon");
		
		String temp = null;
		
		for(int i=0; i<cityList.size(); i++) {
			if(cityList.get(i) instanceof String) {
				temp = (String)cityList.get(i); //명시적인 다운캐스팅, get(i) 메서드로 해당 주소 인덱스 번호에 해당하는 원소값을 Object 타입으로 가져옴.
				
			}
			System.out.print(" 도시이름을영문대문자로: " + temp.toUpperCase() + "\t");
		}
	}

}
