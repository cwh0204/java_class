/*
 * 정적메서드내에서는 this와 인스턴스 변수를 사용할 수 없다.
 */
class St02{
	static int a=10;//정적변수
	int b=20;//인스턴스 변수
	
	public static void printA() {//정적메서드
		System.out.println(a);
		System.out.println(this.b);//정적메서드내에서는 this는 사용 못함 
	}
	
	public static void printB() {//정적메서드
		System.out.println(b);//정적메서드내에서는 인스턴스 변수 사용 못함
	}
	
	public void printC() {//인스턴스 메서드
		System.out.println(this.b);
		System.out.println(b);
		System.out.println(a); /* 인스턴스 메서드내에서는 this,인스턴스 변수,정적변수 모두 사용가능하다. */
	}
}
public class StaticEx02 {
	public static void main(String[] args) {

	}
}
