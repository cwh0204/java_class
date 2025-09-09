package day17;

import net.daum.model01.IShapeClass;
import net.daum.model02.Circ;
import net.daum.model02.Rect;
import net.daum.model02.Tria;

/*
 * 작성일 : 2025-09-09
 * 작성자 : 최원효
 * 설명 : 자바 인터페이스.pdf 24페이지 1번 문제)
 * 		1.net.daum.mode101 패키지 부모 인터페이스 IShapeClass.java를 만들고 추상 메서드 void draw();를 정의한다.
 * 		2.net.daum.mode102 패키지 부모 인터페이스 IShapeClass를 구현 상속한 자손 클래스 Circ.java, Rect.java Tria.java를 생성하고
 * 		부모 인터페이스의 추상 메서드 draw()를 오버라이딩 한 다음 실행 문장으로 "타원을 그린다", "사각형을 그린다", "삼각형을 그린다"가 출력되는
 * 		문장을 기술한다.
 * 
 * 		그런 다음 다음과 같은 출력물이 나오게 한다.
 * 		타원을 그린다.
 * 		사각형을 그린다.
 * 		삼각형을 그린다.
 */

class alldraw{
	void add(IShapeClass a) {
		a.draw();
	}
}

public class Ex19_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		alldraw all = new alldraw();
		
		all.add(new Circ());
		all.add(new Rect());
		all.add(new Tria());
		
	}
}
