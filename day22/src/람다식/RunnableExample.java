package 람다식;

/*
 * 	자바 내장 함수형 인터페이스인 Runnable은 자바 8버전에서 @FunctionalInterface 추가되어져서 이 인터페이스로 람다식을 구현할 수 있다.
 * 	즉 추상 메서드가 딱 하나만 온다.그것이 바로 run()이다. 결국 멀티스레드 문장을 람다식 문법으로 구현할 수 있다는 것이다.
 * 
 * 	문제 1) 함수형 인터페이스인 Runnable을 사용하면 람다식 익명객체를 구현할 수 있다. 그러므로 스레드의 스케줄링 메서드인 sleep()을 잘 활용해서
 * 	람다식 문법코드로 1초 간격으로 10부터 1까지 카운터 되는 스레드 예제를 for 반복문을 사용해서 구하는 자바 코드를 만들어 본다.
 */

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1번문제 답안코드
		
		Runnable run = () -> {
			for (int i = 10; i >= 1; i--) {
				try {
					Thread.sleep(1000);
					System.out.print(" "+i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread th01 = new Thread(run);
		th01.start();
		
		// 문제 2) Runnable 자손인 Thread 내장 클래스와 for반복문,스케줄링 메서드 sleep()을 활용해서 람다식 문법으로 동시에 1부터 10까지
		//		  카운터 되는 스레드 프로그램을 만들어 보자. 위의 스레드와 동시에 카운터 작업이 이러어 져야 한다.
		
		Runnable run1 = () -> {
			for(int i = 1; 10>=i; i++) {
				try {
					Thread.sleep(1000);
					System.out.print(" "+i);
				}catch(InterruptedException ie) {
					System.out.println("오류가 발생했습니다");
				}
			}
		};//Thread 클래스로 람다식 익명객체 구현2
		
		Thread th02 = new Thread(run1);
		th02.start();
		
	}
}
