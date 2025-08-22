package day08;
/*
 * 	작성일 : 2025-08-22
 *	작성자 : 최원효
 * 	설명 : 가변 배열(래그드 배열, 래기드 배열) 이란?
 *  2차원 이상의 다차원 배열을 생성할 때 행의 길이 고정시키고 각 행의 열의 길이는 지정하지 않고 나중에 각각 각행의 열의 길이를 가변적으로 설정해서
 *  배열의 생성함으로써 고정된 행태 배열이 아닌 각 행의 길이가 유동적인 배열을 말한다.
 *  
 *  가변 배열 생성 형식)
 *  int [][] score = new int[5][]; // 행의 길이는 5로 고정 시키고, 각 행의 열의 길이는 지정하지 않고 나중에 가변적으로 설정한다.
 */
public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_ROWS = 5; //final로 선언된 변수는 상수 즉 수정할수 없다 상수는 관례적으로 영문대문자로 설정하고
		//반드시 최소값을 저장하는 초기화 과정을 해야한다.
		
		int[][] regged = new int[MAX_ROWS+1][];//행의 길이를 6으로 고정시키고 각 행의 열의 길이는 지정하지 않은 가변 배열 ragged 생성
		
		for(int r = 0; r<=MAX_ROWS; r++) {
			regged[r] = new int[r+1]; //각 행의 열이 길이(크기)를 구함(첫번째 행의 길이는 1, 6번째 행의 길이는 6)
		}
		
		//일반 이중 for반복문으로 가변배열 원소값 초기화
		
		for(int r = 0; r<regged.length; r++) {
			for(int c=0; c<regged[r].length;c++) {
				regged[r][c]=c;
			}
		}
		
		//이중 for 반복문으로 가변 배열원소갑 출력
		for(int r=0; r<regged.length; r++) {
			for(int c=0; c<regged[r].length; c++) {
				System.out.print(" "+regged[r][c]);
			}
			System.out.println();
		}//outer for
	}

}
