package day20;

/*
 * 	두번째 자바 멀티쓰레드 구현법)
 * 		1. Runnable 인터페이스를 구현 상속 받아서 스레드 프로그램을 만들면 다중 상속을 받을 수 있다는 장점이 있기 때문에 보다 더 복잡한 프로그램
 * 		을 만들 수 있다.
 * 		2. 단점은 Runnable 인터페이스를 구현 상속받은 자손 클래스 객체로 멀티스레드를 시작하는 start()메서드를 호출 못한다. 이유는 start() 메서드가
 * 		Runnable 의 자손인 Thread클래스의 소속 메서드 이기 때문이다. 그러므로 이 인터페이스를 구현 상속받은 자손 클래스 객체를 Thread생성자 인자값으로
 * 		전달해서 다시 한번 더 객체 생성을 하는 과정을 거쳐야 한다는 것이다.
 */
class Thread03 implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int num=1; num<=5; num++) {
			for(int k=1; k<100000000; k++);
			System.out.println(Thread.currentThread().getName() + " : "+num);//현재 실행중인 스레드 이름을 반환
		}
	}
}
public class ThreadEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th01 = new Thread(new Thread03(), "첫번째 스레드");
		Thread th02 = new Thread(new Thread03(), "두번째 스레드");
		th01.start();
		th02.start();
	}

}
