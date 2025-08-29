package day11;
/*	
 *  작성일 : 2025-08-29
 *	작성자 : 최원효
 *	설명 : static 키워드로 정의된 변수 count를 정적변수라고 한다. 정적변수는 클래스 변수로서 해당 클래스로 직접 접근가능 하다.
 *		  인스턴스 초기화 블록 { }을 사용해서 정적 변수와 인스턴변수 초기화를 해보고 그 차이점에 대해서 알 수 있다
 */

class Product{
	static int count = 0; //정적변수, 명시적 코드로 0으로 초기화
	int serialNo;	//인스턴스 변수 -> 생성된 객체마다 따로 관리한다.(생성된 객체마다 주소값이 다르다. 그러므로 다른값을 가진다.)
					//명시적인 선언을 하지 않아도 기본값 0으로 초기화가 된다.
	{
		++count; //생산대수를 키운터(생성된 객체마다 값을 공유가능 하다 -> 누적 생산대수)
		serialNo = count; //생성된 객체마다 값이 다르다 이유는 객체 주소값이 달라서이다
	}
	static void Product() {
		count = 13;
	}
}
public class ConsTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p01 = new Product();
		System.out.println(p01.serialNo);
		Product p02 = new Product();
		System.out.println(p02.serialNo);
		Product p03 = new Product();
		System.out.println(p03.serialNo);
		p01.Product();
		System.out.println(Product.count);
	}

}
