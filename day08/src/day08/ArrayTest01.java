package day08;
/*
 * 	작성일 : 2025-08-22
 *	작성자 : 최원효
 * 	설명 : String 문자열  내장 api 클래스 하위의 메서드를 활용하는 예제)
 */
public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "java";
		str = str + 8;
		
		System.out.printf("%s  \n", str);
		
		String str01 = "ABCDE";
		char ch = str01.charAt(3);
		System.out.println("구해진 단일문자 : \'" + ch + "\'");
		
		String str02 = "012345";
		String result = str02.substring(1,4);
		
		System.out.println("result="+result);
		
		String src = "ABCDE";
		System.out.println("src 문자열 길이 : "+src.length());
		
		for(int i=0; i<src.length(); i++) {
			char ch02 = src.charAt(i);
			System.out.println("src.charAt("+i+") : " + ch02);
		}
		
		char[] chArr = src.toCharArray();
		System.out.println(chArr);
	}

}
