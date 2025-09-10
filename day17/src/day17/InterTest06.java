package day17;

import java.util.StringTokenizer;

/*
 * java.util 패키지에 있는 내장 api 클래스 중에서 StringTokenzer는 특수문자를 기준으로 문자열을 분리해 준다. 분리된 문자 조각을 토큰이라고 한다.
 * 주로 회원관리 프로그램에서 정부수정 입력폼에서 많이 활용한다.
 * 이 기능과 비슷한 기능을 하는 내장메서드는 String문자열 내장 클래스 하위에 split()가 있다.
 * 
 * StringTokenizer는 한 방향으로만 순차적으로 토큰을 소비하기 때문에 한 번 nextToken()으로 꺼낸 토큰 문자는 다시 접근을 못한다.
 * 다시 사용하고 싶다면 StringTokenizer 객체를 새로 생성해야 한다.
 */
import java.util.regex.*;

public class InterTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phoneNumber = "010-7777-9999";
		StringTokenizer phone = new StringTokenizer(phoneNumber,"-");
		String phone01 = phone.nextToken();
		String phone02 = phone.nextToken();
		String phone03 = phone.nextToken();
		System.out.println(phone01);
		System.out.println(phone02);
		System.out.println(phone03);
		
		System.out.println("\n==========================\n");
		
		StringTokenizer phone2 = new StringTokenizer(phoneNumber,"-");
		
		while(phone2.hasMoreTokens()) {
			System.out.println(phone2.nextToken());
		}
		
		String result2 = phoneNumber.replaceAll("-(\\d{4})-(\\d{4})", "");
		System.out.println(result2);
//        Pattern pattern = Pattern.compile("(\\d{3})-(\\d{4})-(\\d{4})");
//        Matcher matcher = pattern.matcher(phoneNumber);
//
//        String part1 = matcher.group(1); // 010
//        String part2 = matcher.group(2); // 7777
//        String part3 = matcher.group(3); // 9999
//
//        System.out.println("앞자리: " + part1);
//        System.out.println("중간자리: " + part2);
//        System.out.println("끝자리: " + part3);


	}

}
