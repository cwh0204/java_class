package day14;
/*	
 *  작성일 : 2025-09-03
 *	작성자 : 최원효
 *	설명 : 16장.상속 pdf No.27 4번문제
 *		  강의 교안 문제와 UML 클래스 다이어그램을 보고 클래스 설계 코드를 해보자.
 */


class HandPhone{
	protected String model;
	protected String number;
	
	public HandPhone() {
		
	}
	
	public HandPhone(String model, String number) {
		this.model = model;
		this.number = number;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getNumber() {
		return this.number;
	}
	
}

class DicaPhone extends HandPhone{
	protected String pixel;
	
	public DicaPhone() {
		
	}
	
	public DicaPhone(String model,String number,String pixel) {
		super(model,number);
		this.pixel = pixel;
	}
	
	public void prnDicaPhone() {
		System.out.println("모델명 : "+ model +" 번호 : "+ number +" 화소수 : " + pixel);
	}
}
public class Ex16_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DicaPhone dp1 = new DicaPhone("갤럭시","010","1024");
		dp1.prnDicaPhone();
	}
}
