package day14;
/*	
 *  작성일 : 2025-09-04
 *	작성자 : 최원효
 *	설명 : 16장.상속 pdf No.28 5번문제)
 *	문제는 강의교안 참조하고 이 소스는 컴파일 에러가 발생한다. 에러가 나는 이유에 대해서 주석문 처리한다.
 */
class TestSuper {
	int i;
//	TestSuper(){
//		
//	} 			//	기본 생성자가 없기 때문에 에러가 난다
	TestSuper(int i) {
		this.i = i;
	} 
} 
class TestSub extends TestSuper{
	/*
	 * 에러가 나는 이유는 부모클래스 생성자가 오버로딩이 되었기 때문에 자바는 더 이상 부모의 기본생성자를 묵시적 제공을 하지 않는다. 그런데
	 * 자손에서 부모의 기본생성자를 호출할려다가 컴파일 에러가 나는 것이다
	 */
} 
public class Ex16_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestSub(); //여기서 기본생성자를 호출함
	}

}
