package day20;
/*
 * 	특정은행 Atm 계좌에서 출금 ,입금과 같은 특정한 작업이 이루어 질때는 한번에 하나의 쓰레드에 의해서만 입/출금 작업이 이루어 지도록
 * 	synchronized 키워드로 동기화 즉 임계영역을 지정해야 한다. 
 */

class Atm{
	private int money;//계좌 잔액
	
	public Atm(int money) {
		this.money = money;//생성자의 주된 기능인 맴버변수 초기화
	}//생성자 오버로딩
	
	//입금작업 동기화 처리
	
	public synchronized void deposit(int amount, String name) {
		money += amount;
		System.out.println(name+" 입금금액 "+ amount);
	}
	
	public synchronized void withdraw(int amount, String name) {
		if((money - amount) > 0) {
			money -= amount;
			System.out.println(name +" 출금금액 "+ amount);
		}else {
			System.out.println(name +" 잔액부족으로 출금못함");
		}
	}
	
	public void printMoney() {
		System.out.println("계좌 잔액 = " + money);
	}
}//Atm 계좌 클래스


class AtmUser extends Thread{
	boolean flag = false;//입금/출금 분기
	Atm obj;
	
	public AtmUser(Atm obj,String name) {
		super(name);
		this.obj = obj;
	}
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			try {
				sleep(500);
			}catch (InterruptedException ie) {}
			
			if(flag) {
				obj.deposit((int)(Math.random()*10+2)*100, getName());
			}else {
				obj.withdraw((int)(Math.random()*10+2)*100, getName());
				/*
				 * random() 메서드는 0.0이상 1.0미만 사이의 실수 숫자난수 발생 -> *10하면 0.0이상 10.0미만 사이 실수 숫자 난수 발생 =>
				 * +2하면 2.0이상 12.0미만 사이 실수 숫자 난수 -> (int) 로 캐스팅하면 소수점이하는 버리고 2이상 12미만 정수숫자 난수 ->
				 * *100하면 200이상 1100(1200미만) 사이 정수 숫자 난수로 출금작업이 이루어짐. getName() 메서드는 스레드 이름을 반환
				 */
				obj.printMoney();
			}
			flag = !flag;
		}//for
	}
	
}
public class ThreadEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm obj = new Atm(1000);
		AtmUser user01 = new AtmUser(obj,"홍길동");
		AtmUser user02 = new AtmUser(obj,"이순신");
		AtmUser user03 = new AtmUser(obj,"강감찬");
		
		user01.start();
		user02.start();
		user03.start();
	}
}
