package day17;
/*
 * 작성일 : 2025-09-09
 * 작성자 : 최원효
 * 설명 : Object 최고 부모 클래스의 equls()메서드를 자손에서 오버라이딩 한 경우)
 */
class Point05 extends Object{
	int x,y;
	
	public Point05() {}
	
	public Point05(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Point05 pt = new Point05();
		pt  = (Point05)obj;

		
		if((x == pt.x) && (y == pt.y)){
			return true;
		}else {
			return false;
		}
	}
}

public class interTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point05 pt01 = new Point05(10,20);
		Point05 pt02 = new Point05(10,20);
		
		if(pt01 == pt02) {//참조타입을 == 같다 비교연산으로 비교하면 객체주소값을 비교한다. 객체주소 값이 달라서 false
			System.out.println("두 레퍼런스가 같다.");
		}else {
			System.out.println("두 레퍼런스가 다르다.");
		}
		
		if(pt01.equals(pt02)) {//값만 비교함
			System.out.println("값이 같다");
		}else {
			System.out.println("값이 다르다");
		}
	}
}
