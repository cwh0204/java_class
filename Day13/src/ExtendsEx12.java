/*	
 *  작성일 : 2025-09-02
 *	작성자 : 최원효
 *	설명 : this() : 상속과 관련이 없다. 같은 클래스내에서 오버로딩 된 다른 생성자를 호출할 때 사용한다.
 *		  super() : 상속관계에서 자손에서 부모의 생성자를 호출할 때 사용한다.
 *		  
 */
class Father12{
	int x = 10;
	int y = 20;
	
	Father12(int x, int y){
		this.x=x;
		this.y=y;
	}//전달인자 2개짜리 생성자 오버로딩 -> 생성자가 오버로딩 되면 자바는 더 이상
}
class Son12 extends Father12{
	int z = 30;
	
	public Son12() {
		
		this(10,20,300);
		
		/*
		 * 자바의 생성자 {} 블록내에서 this() 또는 super()를 사용하는 경우 항상 첫줄에 와야 한다.
		 * this() 와 super() 는 동시에 사용할 수 없다.
		 * 생성자 내에서 super() 또는 this() 둘 중 하나만 사용할 수 있으며, 동시에 사용 못한다.
		 * 생성자 {} 중괄호 블록내에서 super() or this()를 생략하면 자바 컴파일러는 자동으로 super();를 추가한다
		 */
	}
	
	public Son12(int x,int y, int z) {
		super(x,y);
		this.z = z;
	}
	public void print() {
		System.out.println("x = "+x+" y = "+y+" z = "+z);
	}
}

public class ExtendsEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son12 son1 = new Son12();
		son1.print();
	}
}
