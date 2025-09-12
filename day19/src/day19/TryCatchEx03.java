package day19;
/*
 * 	작성일 : 2025-09-12
 * 	작성자 : 최원효
 *   설명 : try~catch 문에서 예외가 발생하든 발생하지 않든 무조건 마지막에 수행해야 하는 문장을 넣을 때는 finally{} 블록문에 기술한다.
 *
 */
public class TryCatchEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b01 = 0, b02 = 2, result=0;
		
//		try {
//			result = a/b02;
//			System.out.println("[1] result = "+result);
//			
//			result = a/b01;
//			System.out.println("[1] result = "+result);
//			
//			result = a/b02;
//			System.out.println("[1] result = "+result);
//			
//		}
//		catch(ArithmeticException ae){
//			ae.printStackTrace();//예외 족적을 남김
//		}catch(Exception e) {
//			System.out.println("예외처리 : "+e);
//		}finally {
//			System.out.println("예외와 상관없이 무조건 마지막에 실행");
//		}
		result = a/b02;
		System.out.println("[1] result = "+result);
		
		result = a/b01;
		System.out.println("[1] result = "+result);
		
		result = a/b02;
		System.out.println("[1] result = "+result);
		
		System.out.println("예외후에 발생하는 출력문");
	}

}
