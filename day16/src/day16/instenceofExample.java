package day16;
/*
 * 작성일 : 2025-09-08
 * 작성자 : 최원효
 * 설명 : instanceof 의 자동 타입 변환 -> instanceof 패턴 매칭
 */
public class instenceofExample {
	public static void personInfo(Person person) {//
		System.out.println("학생 이름 : "+person.name);
		person.walk();
		
		if(person instanceof Student student) {//person이 참조하는 객체가 Student 타입인 경우 자동 타입 변환 -> 명시적인 다운 캐스팅
			//코드를 할 필요가 없다.
			System.out.println("학번 : "+student.studentNo);
			student.study();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p01 = new Person("홍길동");
//		personInfo(p01);
		
		Student s01 = new Student("이순신",20250908);
		personInfo(s01);
	}
}
