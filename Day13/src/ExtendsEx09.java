/*	
 *  작성일 : 2025-09-01
 *	작성자 : 최원효
 *	설명 : 상속에서의 생성자 호출문제)
 *		  부모클래스의 생성자가 오버로딩 된 경우 기본생성자 묵시적 제공을 하지 않는다. 이럴때 자손에서 부모의 기본생성자를 호출할려다가 에러가 발생한다.
 */
class Parent09{
	protected int a = 10;
	protected int b = 20;
	
	public Parent09(int a, int b) {
		super();//생략가능,최고 조상 object의 기본생성자를 먼저 호출
		this.a=a;
		this.b=b;
	}
	public Parent09() {
		this.a=10;
		this.b=20;
	}
}
class Child09 extends Parent09{
	protected int c = 30;
	
	public Child09() {
		
	}
	public void pr() {
		System.out.println("a="+a+"b="+b+"c"+c);
	}
}
public class ExtendsEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child09 ch09 = new Child09();
		ch09.pr();
	}

}
