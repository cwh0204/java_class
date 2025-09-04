package day14;
/*	
 *  작성일 : 2025-09-04
 *	작성자 : 최원효
 *	설명 : instanceof 형변환 유무 판단 연산자
 */

class HandPhone05 extends Object{
	protected String model;
	protected String number;
	
	public HandPhone05() {
		
	}
	
	public HandPhone05(String model, String number) {
		this.model = model;
		this.number = number;
	}
}

class DicaPhon05 extends HandPhone05{
	protected String pixel; //화소수
	
	public DicaPhon05() {}
	
	public DicaPhon05(String model, String number , String pixel) {
		super(model,number);
		this.pixel = pixel;
	}
	
	public void prnHandPhone() {
		System.out.println("폰 모델명 : "+model+", 폰 번호"+number+", 화소수 : "+pixel);
	}
}

public class RefCast05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DicaPhon05 dp = new DicaPhon05("갤럭시","010-9999-9999","1024");
		dp.prnHandPhone();
		System.out.println("\n=========================================\n");
		
		if(dp instanceof HandPhone05) {
			HandPhone05 hp = dp;
			System.out.println("업캐스팅이 가능합니다");
		}else {
			System.out.println("업캐스팅이 불가능합니다");
		}
		
		System.out.println("\n=========================================\n");
		HandPhone05 hp = new HandPhone05();
		if(hp instanceof DicaPhon05) {
			DicaPhon05 dp5 = (DicaPhon05)hp;
			System.out.println("다운캐스팅이 가능합니다");
		}else {
			System.out.println("사전에 업캐스팅을 안해서 다운캐스팅이 불가능합니다.");
		}
	}

}
