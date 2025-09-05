package day15;
/*	
 *  작성일 : 2025-09-05
 *	작성자 : 최원효
 *	설명 : 추상클래스 특징)
 *		  1.부모 추상클래스의 추상메서드는 상속받은 자손 클래스에서 반드시 일반 메서드로 오버라이딩을 해야한다. 그래야만 자손클래스 객체 생성이 가능하다.
 */
abstract class Abs04{ //부모 추상클래스 정의
	abstract void pr(); //추상메서드 정의
}
class Child03 extends Abs04{

	@Override
	void pr() {
		// TODO Auto-generated method stub
		System.out.println("추상메서드를 오버라이딩 한 일반메서드");
	}
	
}
public class AbsEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abs04 abs;
		abs = new Child03();
		abs.pr();
		Child03 ch03 = new Child03();
		ch03.pr();
	}

}
