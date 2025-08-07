package day02;
/*
 * 	작성일 : 2025-08-07
 *	작성자 : 최원효
 * 	설명: 비트 단위 쉬프트(shift: 비트 왼쪽 / 오른쪽 이동) 연산자
 */
public class ConvertEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x = 15;
		
		System.out.println("15 << 2 = "+ (x << 2)); //60
		System.out.println("15 >> 2 = "+ (x >> 2));
	}

}
