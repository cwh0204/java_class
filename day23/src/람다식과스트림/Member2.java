package 람다식과스트림;


/* 생성자 참조를 위한 클래스 설계 */
public class Member2 {
	private String name;
	private Integer id;
	
	public Member2() {
		System.out.println("Member2() 실행");
	}
	
	public Member2(Integer id) {
		System.out.println("Member2() (Integer) 실행");
		this.id = id;
	}
	
	public Member2(String name, Integer id) {
		System.out.println("member2(String name, Integer id)");
	}
	
	public Member2(String name, String name1) {
		System.out.println("member2(String name, Integer id)");
	}
}
