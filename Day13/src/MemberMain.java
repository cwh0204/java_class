/*
 * net.daum.dto 패키지의 데이터 저장빈 클래스 MemberDTO.java를 임포트해서 활용 
 */

import net.daum.dto.MemberDTO;//import 예약어로 net.daum.dto 패키지의 MemberDTO 빈클래스를 임포트한다.

public class MemberMain {
	public static void main(String[] args) {

		MemberDTO member = new MemberDTO();
		
		member.setMem_id("abc56789");//아이디 저장
		member.setMem_pwd("56789");//비번 저장
		member.setMem_name("홍길동");//회원 이름 저장
		member.setMem_email("hong@daum.net");//이메일 저장
		member.setMem_phone("010-9999-7777");;//폰번호 저장
		
		System.out.println("아이디 : "+member.getMem_id());
		System.out.println("비번 : "+member.getMem_pwd());
		System.out.println("회원이름 : "+member.getMem_name());
		System.out.println("회원 이메일 : "+member.getMem_email());
		System.out.println("회원 폰번호 : "+member.getMem_phone());
	}
}
