package day14;
/*	
 *  작성일 : 2025-09-04
 *	작성자 : 최원효
 *	설명 : instanceof 연산자는 레퍼런스 간의 형변환(업캐스팅/다운캐스팅)유무 판단 연산자이다.
 *	다운캐스팅을 할 때 캐스팅 연산 예외 오류가 나는 것을 방지하기 위해서는 if 조건문과 함께 instanceof 연산자를 함께 사용한다.
 */
class Car07 extends Object{
	
}
class FireEngine07 extends Car07{
	
}
public class RefoCast07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireEngine07 fe = new FireEngine07();
		
		if(fe instanceof Car07) {
			System.out.println("업캐스팅이 가능합니다.");
		}
		if(fe instanceof Object) {//fe가 자바 최상위 부모클래스 Object타입으로 업캐스팅이 가능한가? true(참)
			System.out.println("업캐스팅이 가능합니다");
		}
		
		Object obj = new FireEngine07();
		
		if(obj instanceof FireEngine07) {
			System.out.println("다운캐스팅이 가능합니다");
			FireEngine07 fe2 = (FireEngine07)obj;
		}else {
			System.out.println("다운캐스팅이 불가능합니다");
		}
	}
}

