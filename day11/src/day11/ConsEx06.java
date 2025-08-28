package day11;
/*	
 *  작성일 : 2025-08-28
 *	작성자 : 최원효
 *	설명 : 생성자의 특징)
 *			생성자가 오버로딩이 되면 자바 컴파일러는 더 이상 묵시적인 기본생성자를 제공하지 않는다.
 *
 */
class Board06{
	private String writer;
	private String title;
	
	//생성자를 오버로딩 해서 매개변수가 없는 기본 생성자를 더 이상 묵시적 제공 안함.
	
	public Board06(String new_writer, String new_title) {
		writer = new_writer;
		title = new_title;
	}
	
	public void print() {
		System.out.println("게시판 글쓴이 : "+ writer +", 게시판 제목 : "+title);
	}
}
public class ConsEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board06 b = new Board06();
		b.print();
		
		Board06 b2 = new Board06("홍길동","게시판 제목입니다");
		b2.print();
	}

}
