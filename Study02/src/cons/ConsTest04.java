package cons;


class Mother04 extends Object{
	protected int x;
	protected int y;
	
	public Mother04(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

class Child04 extends Mother04{
	int z;
	
	public Child04() {
		super(100,100);
		this.z = 300;
	}
	
	public void print() {
		System.out.println("x="+x+"y="+y+"z="+z);
	}
}

public class ConsTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child04 ch04 = new Child04();
		ch04.print();
	}
}
