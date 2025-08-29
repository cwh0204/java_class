package day11;
/*	
 *  작성일 : 2025-08-29
 *	작성자 : 최원효
 *	설명 : 13장 생성자.pdf No.20 2번문제
 *	
 */
class Product01{
	String name;
	int price;
	Product01(){
		this.name = "알수없음";
		this.price = 0;
	}
	Product01(int price){
		this.name = "물";
		this.price = price;
	}
	Product01(String name){
		this.name = name;
		this.price = 800;
	}
	Product01(String name,int price){
		this.name = name;
		this.price = price;
	}
	void str(){
		System.out.println(this.name + ", " + this.price);
	}
}
public class Ex13_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Product01("웰치스",700).str();;
		new Product01("커피").str();;
		new Product01(500).str();;
		new Product01().str();;
	}

}
