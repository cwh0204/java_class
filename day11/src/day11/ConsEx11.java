package day11;
/*	
 *  작성일 : 2025-08-28
 *	작성자 : 최원효
 *	설명 : this()에 의해서 같은 클래스내에서 오버로딩 된 다른 생성자를 호출해 본다
 */
class Car11{
	String color; //차 색상
	String gearType; //변속기 종류 : auto(자동), 수동(menual)
	int door; //문의 개수
	
	Car11(){
		this("white","auto",4);
	}
	
	Car11(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door=door;
	}
	void print() {
		System.out.println("차색상 "+color+", 변속기 종류 : "+gearType+", 차문 개수 : " + door);
	}
}
public class ConsEx11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car11 car = new Car11();
		car.print();
	}

}
