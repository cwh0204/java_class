package cons;
/*
 * 	생성자의 특징)
 * 	1. 생성자이름은 클래스 이름과 동일하게 만든다.
 *  2. new 클래스명();에 의해서 생성자를 호출한다.
 *  3. 생성자의 주된 기능은 클래스 소속의 맴버변수 중 인스턴스 변수 초기화 가능이다.
 *  4. 생성자의 메서드의 일종으로 생성자 오버로딩이 가능하다.
 */

class Cons01{
	int a;
	int b;
	public Cons01() {
		
	}
	public Cons01(int a,int b) {
		this.a = a;
		this.b = b;
	}
}
public class ConsTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
