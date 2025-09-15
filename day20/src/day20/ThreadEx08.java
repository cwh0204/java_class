package day20;
/*
 * 	출금작업과 같은 특정작업이 이루어 질 때는 synchronized 키워드로 동기화를 처리해야 하는데 이를 하지 않아서 출금 후 은행 잔고가 음의 정수가
 * 	나오는 예)
 */
class Account{
	private int balance = 1000;//계좌 잔액
	
	public int getBalance() {
		return balance;//계좌 잔액 반환
	}
	//동기화를 하지 않은 출금작업
	
	public void withdroaw(int money) {
		if(balance >= money) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ie){
			}
			balance -= money;
			
		}
	}
}//Account 계좌 클래스

class Thread08 implements Runnable{
	
	Account acc = new Account();
	String name;
	
	public Thread08(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(acc.getBalance() > 0) {
			int money = (int)(Math.random()*3+1)*100;
			/*
			 * random() 메서드는 0.0이상 1.0미만 사이의 실수숫자 난수 발생 -> *3 하면 0.0이상 3.0미만 사이의 실수숫자 난수 발생 -> +1하면
			 * 1.0이상 4.0미만 사이의 실수숫자 난수발생 -> (int)로 형변환 하면 1이상 4미만 사이의 정수숫자 난수 발생 -> 즉 1부터 3사이 정수
			 * 숫자 난수 -> *100하면 100,200,300 중 하나 정수 숫자 난수가 출금액이 된다.
			 */
			acc.withdroaw(money);//계좌로 부터 출금
			System.out.println(name+" 출금후 잔액 = "+acc.getBalance());
			
		}
	}
}
public class ThreadEx08 {

	public static void main(String[] args) {
		Thread th = new Thread(new Thread08("홍길동"));
		Thread th1 = new Thread(new Thread08("임꺽정"));
		th.start();
		th1.start();
	}
}
