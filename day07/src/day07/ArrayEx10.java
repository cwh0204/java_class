package day07;
/*
 * 	작성일 : 2025-08-21
 *	작성자 : 최원효
 * 	설명 : 배열 원소값을 서로 바꾸는 예제 )
 */
public class ArrayEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];
		
		for(int i=0; i<numArr.length;i++) {
			numArr[i]=i;
			System.out.print(" " + numArr[i]);
		}
		System.out.println("\n==============================\n");
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random()*10);
			System.out.print(" " + n);
			
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}//for
		
		System.out.println("\n==============================\n");
		
		//일반 for반복문으로 출력
		for(int i = 0; i<numArr.length; i++) {
			System.out.print(" " + numArr[i]);
		}
		
		System.out.println("\n==============================\n");
		
		for(int a : numArr) {
			System.out.print(" " + a);
		}
	}

}
