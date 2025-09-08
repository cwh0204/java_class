package day15;
/*	
 *  작성일 : 2025-09-05
 *	작성자 : 최원효
 *	설명 : 매개변수 다형성 문법)
 *	1. 상속,업캐스팅 등 자바 OOP 문법이 적용된 매개변수 다형성이 적용되면 자손클래스 개수만큼 메서드 오버로딩을 안해도 된다.
 *	   그 만큼 중복코드를 안하게 되고 코드가 간결해진다. 부모 타입 매개변수로 모든 자손타입을 받을 수 있다.
 *
 *	2. 매개변수 다형성 문법이 적용되지 않으면 자손 클래스 개수만큼 매개변수 타입을 적용해서 메서드 오버라이딩을 해야 한다. 그 만큼 중복코드 라인이 늘어난다.
 *	   결국 자손 클래스 개수 만큼 매개변수 타입을 다르게 한 메서드를 오버로딩 해 줘야 한다.
 *
 */

import net.daum.model01.ShapeClass;
import net.daum.model02.Circ;
import net.daum.model02.Rect;
import net.daum.model02.Tria;

public class AbsEx06 {
	//매개변수 다형성 문법이 적용된 경우 => 업캐스팅
	static void 입고01(ShapeClass ref) { //매개변수 타입을 부모 추상클래스로 하면 모든 자손을 업캐스팅 하면서 받을 수 있다
		ref.drow();//업캐스팅 이후 오버라이딩 한 메서드 호출
		
	}
	//매개변수 다형성이 적용 안된 경우
	static void 입고02(Circ c) { //불필요하게 자손클래스 타입을 다르게 한 메서드 오버로딩을 해야한다.
		c.drow();
	}
	static void 입고02(Rect r) { //불필요하게 자손클래스 타입을 다르게 한 메서드 오버로딩을 해야한다.
		r.drow();
	}
	static void 입고02(Tria t) { //불필요하게 자손클래스 타입을 다르게 한 메서드 오버로딩을 해야한다.
		t.drow();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circ c = new Circ();
		Rect r = new Rect();
		Tria t = new Tria();
		
		입고01(c); 입고01(r); 입고01(t);
		
		System.out.println("\n -------------------------> \n");
		
		입고02(new Circ());
		입고02(new Rect());
		입고02(new Tria());
	}

}
