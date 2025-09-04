package day14;


class Animal104{
	protected String kind;
	protected int leg;
	
	public Animal104() {
		
	}
	
	public Animal104(String kind, int leg) {
		this.kind = kind;
		this.leg = leg; 
	}
	
	public String getKind() {
		return this.kind;
	}
	
	public void walk() {
		System.out.println(this.kind+" = "+this.leg+"족보행");
	}
}

class Dog104 extends Animal104{
	public Dog104() {
		super("개",4);
	}
	
	public Dog104(String kind, int leg) {
		super(kind,leg);
	}
}

class Human104 extends Animal104{
	public Human104() {
		super("사람",2);
	}
	
	public Human104(String kind,int leg) {
		super(kind,leg);
	}
}

public class Ex16_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog104 d1 = new Dog104("시골개",4);
		Human104 h1 = new Human104();
		System.out.println(d1.getKind());
		d1.walk();
		h1.walk();
		
	}

}
