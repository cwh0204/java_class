/*	
 *  작성일 : 2025-09-02
 *	작성자 : 최원효
 *	설명 : static import 문
 *		  static import 문을 사용하면 static 맴버(정적변수, 정적메서드)를 호출할 때 클래스 이름을 생략할 수 있다. 그만큼 코드 라인이 줄어들어
 *		  간결해 진다.
 */

import static java.lang.System.out;
import static java.lang.Math.random;
import static java.lang.Math.PI;

public class ExtendsEx13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out.print("난수 : "+ random());
		out.println("원주율 :"+ PI);
	}
}
