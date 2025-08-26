package day10;
/*
 * 	작성일 : 2025-08-26
 *	작성자 : 최원효
 * 	설명 : 참조변수만 선언하고 객체주소를 대입 안한 상태에서 해당 클래스 소속 멤버변수(인스턴스 변수:객체 생성해서 접근하는 변수 => 속성)에 접근 못한다.
 */
class Member05{
	String id; //회원 아이디
	String name; //회원 이름
	String phone; //폰번호
}
public class MethodEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member05 m; //레퍼런스 변수만 선언 (객체 주소가 저장 안됨)
		
		System.out.println("회원 아이디 :" + m.id +",회원 이름:"+m.name+",폰번호"+m.phone);
		
		m = new Member05(); //아래쪽에 외야함
	}

}
