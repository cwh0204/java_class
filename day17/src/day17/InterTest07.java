package day17;
/*
 * 작성일 : 2025-09-10
 * 작성자 : 최원효
 * 설명 :java.util 패키지에 있는 내장 API 추상클래스인 Calender는 컴퓨터 시스템의 년월일 시분초 값을 반환해 준다.
 * 추상클래스이기 때문에 new 키워드로 객체 생성을 못한다.
 */
import java.util.Calendar;
public class InterTest07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year+"년 "+month+"월 "+date+"일");
		System.out.println(hour+"시 "+minute+"분 "+second+"초 입니다.");
		
		System.out.println("\n ============================== \n");
		
		
	}

}
