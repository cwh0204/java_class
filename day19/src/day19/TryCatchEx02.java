package day19;
/*
 * 	작성일 : 2025-09-12
 * 	작성자 : 최원효
 *   설명 : 하나의 try문에 여러 개의 catch 블록문이 오는 경우)
 *   	catch 블록문에는 예외 클래스의 자손(구체적인 예외)을 먼저 기술하고, 예외 클래스의 부모(상위 예외)를 나중에 기술해야 한다.
 *   	
 *   	그 이유는 자바 런타임이 예외 발생시 catch 블록문을 위에서부터 아래로 순차적으로 검사하면서, 가장 구체적이고 관련성 높은 예외 처리 블록을 먼저
 *   	실행 하기 때문이다.
 *
 */
public class TryCatchEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b01 = 0, b02 = 2, result=0;
		
		try {
			result = a/b02;
			System.out.println("[1] result = " + result);
			
			result = a/b01; //정수숫자를 0으로 나누어서 예외 발생
			System.out.println("[2] result" + result);//이 문장 수행 안하고 해당 예외 처리 catch 블록문으로 이동한다.
			
		}catch(ArithmeticException e) { //보다 구체적인 자손클래스를 먼저 기술
			System.out.println("예외 발생 : " + e);
		}catch(Exception e) { //예외 처리 부모클래스를 나중에 기술
			e.printStackTrace(); //예외 족적인 발자취를 남김
		}
	}
}
