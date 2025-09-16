package 중첩클래스와중첩인터페이스;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn = new Button();
		
		btn.OnClickListener(new CallListener());
		btn.touch();
		
		btn.OnClickListener(new MessageListener());
		btn.touch();
	}
}
