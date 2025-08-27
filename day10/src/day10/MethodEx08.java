package day10;
/*
 * 	작성일 : 2025-08-27
 *	작성자 : 최원효
 * 	설명 : 매개변수 타입이 기본타입이면 값이 전달된다. 이것을 값에 의한 전달방식이라고 한다. 그러므로 객체주소는 공유하지 않는다. 그래서 메서드 호출후 변경된 값을
 * 		  공유 못한다.
 */

class Vm08{
	int y;
	
	void changeNumber(int y) {
		y = 100;
	}
}

public class MethodEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vm08 vm = new Vm08();
		
		int x = 70;
		
		System.out.println("changeNumber() 메서드 호출전 = " + x); //70
		
		vm.changeNumber(x);
		
		System.out.println("changeNumber() 메서드 호출전 = " + x);
		
	}

}
