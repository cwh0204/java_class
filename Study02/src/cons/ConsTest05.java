package cons;



class Mother05{
	
	
	public void m05() {
		System.out.println("부모클래스 메서드");
	}
}

class Child05 extends Mother05{

	@Override
	public void m05() {
		// TODO Auto-generated method stub
		super.m05();
	}
	
	public void c05() {
		System.out.println("자식클래스 메서드");
	}

}

public class ConsTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Mother05 m05 = new Mother05();
//		Child05 c05 = (Child05)m05;
//		
//		c05.c05();
		
		Mother05 m06 = new Child05();
		Child05 c06 = (Child05)m06;
		
		c06.c05();
	}

}
