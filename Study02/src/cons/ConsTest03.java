package cons;
/*
 * 	생성자는 상속되지 않는다. 부모 클래스의 생성자가 오버로딩 되면 전달인자가 없는 기본생성자를 묵시적 제공하지 않는다. 이럴때 자손클래스에서 부모의
 * 	묵시적으로는 제공되지 않는 기본생성자를 호출할려다가 컴파일 에러가 난다.
 */

class Mother03{
	int a;
	int b;
	
	public Mother03(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

class Child03 extends Mother03{
	int c;
	
	public Child03(int a, int b, int c) {
		super(a, b);
		this.c = c;
		// TODO Auto-generated constructor stub
	}
	
}
public class ConsTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child03 ch03 = new Child03(12,13,14);
		Mother03 mt03 = (Mother03)ch03;
		
		System.out.println(mt03.a);
		System.out.println(mt03.b);
		
		System.out.println(ch03.a);
		System.out.println(ch03.b);
		System.out.println(ch03.c);
	}
}
