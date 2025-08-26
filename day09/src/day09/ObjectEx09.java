package day09;
/*
 * 	작성일 : 2025-08-26
 *	작성자 : 최원효
 * 	설명 : 자바OOP에서 클래스 소속의 사용자 정의 메서드)
 * 		  1. return 키워드로 값을 반환하는 메서드
 * 		  2. 메서드명 앞에 리턴타입을 void 형으로 해서 값을 반환하지 않고 구구단을 출력하는 메서드
 *
 */

class obj09{
	
	int add(int num1, int num2) {
		return num1+num2;
	}
	
	void printGuguDan() {
		int k = 2;
		while(k<=9) {
			System.out.print(k+"단\t");
			k++;
		}
		System.out.println("\n ================================ \n");
		
		for(int j = 1; j<=9; j++) {
			for(int i=2; i<=9; i++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
}

public class ObjectEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		obj09 obj = new obj09();
		System.out.println("10+10 = "+obj.add(10, 10));
		obj.printGuguDan();
	}

}
