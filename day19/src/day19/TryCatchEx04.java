package day19;
/*
 * 	작성일 : 2025-09-12
 * 	작성자 : 최원효
 *   설명 : try~catch 문에서 예외가 발생하든 발생하지 않든 무조건 마지막에 수행해야 하는 문장을 넣을 때는 finally{} 블록문에 기술한다.
 */

class Member04 { // 클래스의 초기값을 지정함
	String mem_id = "kkkkk";
	String mem_name = "홍길동";
	String mem_email = "hong@gmail.com";
}

public class TryCatchEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member04 member = null;
		try {
			System.out.println(member.mem_id + "/" + member.mem_name + "/" + member.mem_email + "/");
		} catch (Exception e) {
			System.out.println("예외 발생->" + e);
			member = new Member04();
			System.out.println(member.mem_id + "/" + member.mem_name + "/" + member.mem_email + "/");
		}
	}

}
