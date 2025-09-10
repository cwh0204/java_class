package day17;
/*
 * 작성일 : 2025-09-10
 * 작성자 : 최원효
 * 설명 : 1. 문자열을 다루는 String 내장 api클래스는 자기 자신 내용을 수정할 수 없다.
 * 		 2. StringBuffer 내장 api는 자기 자신값을 수정할 수 있다.
 */
public class InterTest08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cityName = "seoul";
		System.out.println("도시이름 영문 대문자로 변경: "+cityName.toUpperCase());
		//
		System.out.println("cityNmae : " + cityName);//cityName 문자열 변수값을 영문 대문자로 변경안되고 seoul로 출력
		System.out.println("\'seoul\' 문자열 길이 : " + cityName.length());
		System.out.println("\'seoul\' 세번째 단일문자 : " + (cityName.charAt(2)));
		System.out.println("\'seoul\' 에서 e가 몇번째 위치되어 있는가? " + (cityName.indexOf('e')+1));
		
		System.out.println("\n=====================================\n");
		
		StringBuffer str01 = new StringBuffer();
		str01.append("java");
		str01.append(" Programming");
		System.out.println(str01);
		
		String sub_result = str01.substring(0,4);
		System.out.println(sub_result);
		
		str01.replace(0, 4, "jsp");
		System.out.println(str01);
	}
}
