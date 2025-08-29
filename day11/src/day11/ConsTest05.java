package day11;
/*	
 *  작성일 : 2025-08-29
 *	작성자 : 최원효
 *	설명 : 생성자 오버로딩, this()에 의한 같은 클래스 내에서 오버로딩 된 다른 생성자 호출, 생성자의 주돈 기능인 인스턴스 변수 초기화
 *		  에 대해서 알수 있는 예제)
 */
class Document{
	static int count = 0;
	String name;
	
	Document(){
		this("제목없음" + ++count);
	}
	Document(String name){
		this.name = name;
		System.out.println("문서 "+ this.name +"가 생성");
	}
}
public class ConsTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Document();
		new Document("자바.txt");
		new Document();
		new Document();
		new Document();
		new Document();
	}

}
