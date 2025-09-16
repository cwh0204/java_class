package 중첩클래스와중첩인터페이스;
/*
 * 	외부클래스 안에 선언된 내부 인터페이스 즉 중첩 인터페이스
 * 	
 */
public class Button {//외부클래스
	interface OnClickListener{
		void onClick();
	}
	
	OnClickListener listener;
	
	void OnClickListener(OnClickListener listener) {//매개변수 다형성 -> 상속 + 업캐스팅
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();//업캐스팅 이후 오버라이딩 한 메서드 호출
	}
}
