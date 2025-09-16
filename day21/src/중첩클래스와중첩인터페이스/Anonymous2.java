package 중첩클래스와중첩인터페이스;

/*
 * RemoteControl 인터페이스를 활용한 익명객체 구현
 */
public class Anonymous2 {
	//필드 초기값으로 대입
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			// TODO Auto-generated method stub
			System.out.println("TV를 켭니다.");
		}

		@Override
		public void turnOff() {
			// TODO Auto-generated method stub
			System.out.println("TV를 끕니다.");
		}
		
		void method01() {
			RemoteControl localvar = new RemoteControl() {
				@Override
				public void turnOn() {
					// TODO Auto-generated method stub
					System.out.println("오디오를 켭니다.");
				}

				@Override
				public void turnOff() {
					// TODO Auto-generated method stub
					System.out.println("오디오를 끕니다.");
				}
			};
		}
		
		void method02(RemoteControl rc) {
			rc.turnOn();
		}
		
	}; //첫번째 익명클래스(외부클래스명$번호.class -> Anonymous2$1.class)
}
