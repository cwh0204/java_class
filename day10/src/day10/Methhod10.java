package day10;
/*
 * 	작성일 : 2025-08-27
 *	작성자 : 최원효
 * 	설명 : 참조변수만 선언하고 객체주소를 대입 안하면 초기화가 되지 않아서 해당 클래스 속성인 맴버변수(인스턴스 변수)
 * 		  접근 못한다.
 */

class Board06{
	String writer = "홍길동";
	String title = "게시판 제목";
	String cont = "게시판 내용";
}

public class Methhod10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board06 board;
		
		/*
		 * 참조변수 board만 선언하고 객체주소를 대입하지 않으면 해당 변수는 지역변수라서 클래스 소속의 맴버변수 처럼 기본값 null로 초기화가 안된다.
		 * 이런 경우 해당 참조변수 board로 Board06 클래스 소속의 맴버변수인 속성에 접근하면 초기화가 되지 않아서 컴파일 에러가 발생한다.
		 * 만약 클래스 소속의 맴버변수라면 기본값 null로 초기화가 되고 해당 맴버변수 인스턴스 변수에 접근하면 컴파일은 되지만 NullPonterException
		 * 예외 오류가 발생한다.
		 * 지역변수는 기본 초기값이 없다. 그러므로 동시에 명시적인 코드로 초기화를 해야한다.
		 */
		
		System.out.println(board.writer+","+board.title+","+board.cont);
	}

}
