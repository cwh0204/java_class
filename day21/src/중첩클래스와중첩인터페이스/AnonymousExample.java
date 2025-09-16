package 중첩클래스와중첩인터페이스;

public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Anonymous anony = new Anonymous();
		anony.field.wake();
		anony.method();
		
		anony.method02(null){
			new Person() {
				
				void study() {
					System.out.println("자바 공부를 합니다.");
				}
				
				@Override
				void wake() {
					System.out.println("8시에 일어납니다.");
					study();
				}
			}
		};
	}

}
