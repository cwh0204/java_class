package 제3장문제풀이;
/*
 * 	작성일 : 2025-08-06
 *	작성자 : 최원효
 * 	설명: 03장 자료형 pdf No.33 3번 문제
 * 	
 */
public class DataEx03 {

	public static void main(String[] args) {
		byte var1=127;
		short var2=128;
		int var3=128;
		long var4=128L;
		var4 = var1; //1바이트 크기가 8바이트 long타입으로 임시적인 자동형 변환
		System.out.println("var1 = "+var1+ "  var2 = " + var2);
		var1 = (byte)var3; //4바이트가 1바이트로 명시적인 형변환(byte), 저장되는 값이 byte형 최대값 범위를 벗어나서 최소값이 저장
		System.out.println("var1 = "+var1+ "  var3 = " + var3);
		float var5= (float)123456.789123;
		double var6=123456.789123;
		var5 =(float)var6;
		System.out.println("var5 = " + var5+ "  var6 = " + var6);
		var6 = var5;
		System.out.println("var5 = " +var5+ "  var6 = " + var6);
		
		//5번 문제풀이
//		boolean false; //false는 키워드로 변수명으로 사용못함
//		int default; //default도 키워드이다 변수명으로 사용불가
		String _object;
//		double a-class; // 변수명에 -를 포함할 수 없다.
		
		
	}

}
