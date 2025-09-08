package day16;
/*
 * 작성일 : 2025-09-08
 * 작성자 : 최원효
 * 설명 : 인터페이스에 오는 모든 변수는 publiic static final로 인식되는 정적상수만 온다.
 */

interface IColoe06{
	int RED = 1; //public static final 이 생략된 정적상수 RED
	public static final int GREEN = 2;
	int BLUE = 3;
	
	void setColor(int c);//public abstract 가 생략된 추상메서드
	public abstract int getColor();//추상메서드
}

abstract class AbsColor06 implements IColoe06{
	int color=GREEN;

	@Override
	public void setColor(int c) {
		// TODO Auto-generated method stub
		color=c;
	}
	
	@Override
	public int getColor() {
		// TODO Auto-generated method stub
		return color;
	}

}

class SubClass06 extends AbsColor06{
	
	@Override
	public int getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public void setColor(int c) {
		// TODO Auto-generated method stub
		super.setColor(c);
	}
	
	
}
public class interEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass06 sub05 = new SubClass06();
		sub05.setColor(IColoe06.RED);
		System.out.println(sub05.getColor());
	}

}
