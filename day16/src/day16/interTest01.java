package day16;


interface Accel{
	void run();
}

interface Brake{
	void stop();
}

interface HeatedSeat{
	void hear();
}

interface SunRoof{
	void sunroof();
}

interface Navigation{
	void navigation();
}

class car implements Accel,Brake{
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("앞으로 갑니다");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub	
		System.out.println("멈춥니다");
	}
}

class carOption1 extends car implements HeatedSeat{

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("앞으로 갑니다");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub	
		System.out.println("멈춥니다");
	}
	@Override
	public void hear() {
		// TODO Auto-generated method stub
		System.out.println("열선시트");
	}
}

class carOption2 extends car implements SunRoof{

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("앞으로 갑니다");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub	
		System.out.println("멈춥니다");
	}
	@Override
	public void sunroof() {
		// TODO Auto-generated method stub
		System.out.println("썬루프");
	}
}

class carOption3 extends car implements Navigation{

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("앞으로 갑니다");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub	
		System.out.println("멈춥니다");
	}
	@Override
	public void navigation() {
		// TODO Auto-generated method stub
		System.out.println("네이게이션");
	}
}

class carFullOption extends car implements HeatedSeat,SunRoof,Navigation{

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("앞으로 갑니다");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub	
		System.out.println("멈춥니다");
	}
	@Override
	public void navigation() {
		// TODO Auto-generated method stub
		System.out.println("네이게이션");
	}
	@Override
	public void sunroof() {
		// TODO Auto-generated method stub
		System.out.println("썬루프");
	}
	@Override
	public void hear() {
		// TODO Auto-generated method stub
		System.out.println("열선시트");
	}
}

class carFullOption1 extends car implements HeatedSeat,SunRoof,Navigation,red{

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("앞으로 갑니다");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub	
		System.out.println("멈춥니다");
	}
	@Override
	public void navigation() {
		// TODO Auto-generated method stub
		System.out.println("네이게이션");
	}
	@Override
	public void sunroof() {
		// TODO Auto-generated method stub
		System.out.println("썬루프");
	}
	@Override
	public void hear() {
		// TODO Auto-generated method stub
		System.out.println("열선시트");
	}
	@Override
	public void red(String red) {
		// TODO Auto-generated method stub
		System.out.println("색상" + red);
	}
}

public class interTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carFullOption full = new carFullOption();
		carFullOption full1 = new carFullOption();
		carFullOption full2 = new carFullOption();
		carFullOption full3 = new carFullOption();
		carFullOption full4 = new carFullOption();
		carFullOption full5 = new carFullOption();
		carFullOption full6 = new carFullOption();
		full.run();
		full.stop();
		full.navigation();
		full.hear();
		full.sunroof();
	}
}
