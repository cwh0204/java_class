package day08;
/*
 * 	작성일 : 2025-08-22
 *	작성자 : 최원효
 * 	설명 : return 값;
 * 		  원래 메서드를 호출한 곳으로 return 키워드에 의해서 값을 반환한다.
 */ 
public class ArrayTest07 {

	static int getTotal(int a) {
		int sum = 0;
		
		for(int i = 1; i<a; i++) {
			sum += i;
		}
		return sum;
	}
	
	static int getTotal1(int b) {
		int sum1 = 0;
		int i = 1;
		while(1 < b) {
			sum1+=i;
			i++;
		}
		return sum1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumColl = getTotal(8);
		int sum1Coll = getTotal(8);
		System.out.println(sumColl);
		System.out.println(sum1Coll);
	}

}
