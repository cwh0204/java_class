package day17;
/*
 * 작성일 : 2025-09-09
 * 작성자 : 최원효
 * 설명 : Object 최고 조상 부모 클래스의 내장 메서드중에서 문자열 값을 반환해 주는 toString() 메서드를 오버라이딩을 해 본다.
 * java.lang은 기본 패키지 경로이다. 이 부분은 생략해도 된다.
 */

class Point03 extends Object{
	int x,y;//2개의 클래스 소속 맴버변수 중 인스턴스 변수 선언
	
	public Point03() {}
	
	public Point03(int x,int y) {
		this.x = x;
		this.y = y;
	}//전달인자 2개짜리 오버로딩 된 생성자
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(x 좌표값 : "+this.x+",y 좌표값 : "+ y+")";
	}
}
public class interTest03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point03 pt03 = new Point03(19,20);
		System.out.println(pt03.toString());
		System.out.println(pt03);	
	}
}
