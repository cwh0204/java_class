package day03;
/*
 * 	작성일 : 2025-08-08
 *	작성자 : 최원효
 * 	설명: 삼항 조건연산자에 관한 소스 예제
 */
public class OprTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		int absX,absY,absZ;
		char signX,signY,signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = ( x >= 0) ? x : -x; //10
		absY = ( y >= 0) ? y : -y; //5가 대입저장 됨.
		absZ = ( z >= 0) ? z : -z;
		
		signX = (x > 0) ? '+' : ((x == 0) ? ' ' : '-'); //+
		signY = (y > 0) ? '+' : ((y == 0) ? ' ' : '-'); //-
		signZ = (z > 0) ? '+' : ((z == 0) ? ' ' : '-'); //''
		
		System.out.printf("x = %c%d \n", signX, absX); //+10
		System.out.printf("y = %c%d \n", signY, absY); //-5
		System.out.printf("z = %c%d \n", signZ, absZ); 
	}
}
