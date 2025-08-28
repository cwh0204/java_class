package day11;
/*	
 *  작성일 : 2025-08-28
 *	작성자 : 최원효
 *	설명 : 생성자의 특징)
 *		  1.생성자도 메서드의 일종이기 때문에 오버로딩이 가능하다.
 *
 */
class Member04{
	private String mem_id; //회원아이디
	private String mem_name; //회원 이름
	private String mem_addr; // 회원 주소
	
	public Member04() { // 전달인자가 없는 기본 생성자 생성자가 오버로딩 되면 자바 컴파일러는 더 이상 매개변수가 없는 기본 생성자를 묵시적으로 제공 안한다.
		mem_id = "abc56789";
		mem_name="홍길동";
		mem_addr = "서울시 강남구"; //생성자의 주된 기능은 클래스 소속 맴버변수 중 인스턴스 변수 초기화
	}
	
	public Member04(String new_id, String new_name, String new_addr) {
		mem_id = new_id;
		mem_name = new_name;
		mem_addr = new_addr;
	}
	
	public void pr() {
		System.out.println("회원 아이디 : " + mem_id+", 회원 이름 : "+mem_name+", 회원 주소 : "+ mem_addr);
	}
}
public class ClassEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member04 member = new Member04();
		member.pr();
		
		Member04 member02 = new Member04("kkk7777","이순신","서울시 성동구");
		member02.pr();
	}

}
