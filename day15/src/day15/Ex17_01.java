package day15;

/*	
 *  작성일 : 2025-09-05
 *	작성자 : 최원효
 *	설명 : 17장.레퍼런스 형 변환.pdf 의 No.19 2번문제)
 *  	  소스는 강의 교안을 참조하고 명시적인 다운캐스팅을 할 때 if조건문과 instanceof 연산자를 추가 코드해서 true인 경우만 안전하게 다운캐스팅을 하게
 *  	  변경해 보자.
 *  SubClass에 리턴타입이 없는 pr(){}메서드를 정의하고 다운캐스팅한 foo로 업캐스팅 이후 오버라이딩 한 메서드를 호출해서 맴버변수값 i를 출력되게 변경해보자
 */
class SubClass {
	int i = 3;
	
	void pr() {
		System.out.println("i = " + i);
	}
}

public class Ex17_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new SubClass();
		if(obj instanceof SubClass) { //사전에 업캐스팅을 해뒀기때문에 가능함
			SubClass foo = (SubClass)obj;
			foo.pr();
		}
	}

}
