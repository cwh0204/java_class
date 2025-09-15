package day20;

import javax.swing.JOptionPane;

/*
 * 	멀티 스레드의 스케줄링 메서드 중 sleep()과 interrupt()등에 대해서 살펴본다. 이 스케줄링 메서드를 잘 활용해서 catch(){} 블록내에서
 * 	다시 interrupt()를 호출해서 스레드의 인터럽트 된 상태를 다시 true로 초기화 시키면 카운터가 종료된다.
 */
class Thread07 extends Thread{

	@Override
	public void run() {
		int i = 10;
		
		while(i != 0 && !isInterrupted()) {
			/*
			 *  isInterrupred() 메서드는 쓰레드의 interrupred 된 상태를 boolean 타입으로 반환한다.
			*/
			System.out.println(i--);
			
			try {
				Thread.sleep(1000);//1초간 일시 정지 -> 1초 간격으로 작동
			}catch(InterruptedException ie) {
				/*
				 * 	interrupt() 메서드가 호출되면 InterruptedException 예외 오류가 발생하면서 스레드의 interrupted 상태를 다시 false
				 * 	로 초기화
				 */
				interrupt();
//				break;
			}
		}
		
		System.out.println("카운터가 종료");
	}//스레드 문장 구현
	
}//Thread07 class

public class ThreadEx07 {

	public static void main(String[] args) {
		Thread07 th = new Thread07();
		th.start();//멀티 스레드 시작
		
		String name = JOptionPane.showInputDialog("이름 입력 >>");
		System.out.println("입력한 이름 : " + name);
		
		th.interrupt(); //interrupt() 메서드를 호출하면 스레드의 interrupted 된 상태를 false에서 true로 초기화
		System.out.println("isInterrupted() boolean 타입 생태 : "+th.isInterrupted());
	}
}
