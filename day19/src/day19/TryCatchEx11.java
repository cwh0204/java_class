package day19;
/*
 * 	작성일 : 2025-09-12
 * 	작성자 : 최원효
 * 	예외가 발생했을 때 try~catch블록문 실행순서 : 1 2 4 5
 */
public class TryCatchEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		
		try {
			System.out.println(2);
			System.out.println(100/0);
			System.out.println(3);
		}catch(Exception e) {
			System.out.println(4);
		}
		System.out.println(5);
		
	}

}
