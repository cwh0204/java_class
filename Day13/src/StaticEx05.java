/*	
 *  작성일 : 2025-09-01
 *	작성자 : 최원효
 *	설명 : 코드 재활용을 위한 상속
 */

class Point2D{
	private int x;
	private int y;	
	//전달인자가 없는 기본 생성자 생략
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}//Point2D class

class Point3D extends Point2D{
	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
}//Point3D

public class StaticEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D pt = new Point3D();
		pt.setX(10);
		pt.setY(20);
		pt.setZ(30);
		
		System.out.println("x 좌표값 : "+ pt.getX());//상속받아서 사용
		System.out.println("y 좌표값 : "+ pt.getY()); //상속받아서 사용
		System.out.println("z 좌표값 : "+ pt.getZ());
	}
}
