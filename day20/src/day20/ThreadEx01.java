package day20;

/*첫번째 자바 멀티쓰레드 구현법)
	1. Thread 클래스 상속하는 법
	2. run()메서드를 오버라이딩을 해서 쓰레드 문장을 구현
	3. Thread 클래스를 상속받아서 멀티쓰레드 프로그렘을 만들면 기능이 간단 프로그램을 만들때 유리하고,
	   단점으로는 단일상속만 가능하다는 점이다.

*/	   
class Thread01 extends Thread{
	Thread01(String name){
		super(name);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int num = 1; num<=5; num++) {
			for(int k=1; k<10000000; k++);
			System.out.println(getName()+num);
		}
	}//멀티 스레드 문장구현
}


public class ThreadEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread01 th01 = new Thread01("1번");
		Thread01 th02 = new Thread01("2번");
		th01.start();
		th02.start();
	}

}
