package day19;
/*
 * 	작성일 : 2025-09-12
 * 	작성자 : 최원효
 *   설명 : 배열주소 인덱스 번호 범위를 벗어나면 ArrayIndexOutOfBoundsException 예외 오류를 발생시킨다.
 */
public class TryCatchEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] java_score = {100,99,100}; //마지막 배열주소 인덱스 번호는 2이다.
		
		try {
			System.out.println("Test - 1");
			java_score[7] = 100; //배열주소 범위를 벗어나서 예외를 발생함
			System.out.println("Test - 2");//이 문장 수행 안하고 해당 catch블록문으로 이동해서 예외 처리를 한다.
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
