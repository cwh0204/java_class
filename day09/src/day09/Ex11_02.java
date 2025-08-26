package day09;

import java.util.Scanner;

/*
 * 	작성일 : 2025-08-26
 *	작성자 : 최원효
 * 	설명 : 11장. 클래스와 객체.pdf No.14 2번 문제
 */
class Product{
	private String name;
	private int price;
	
	public void setName(String new_name) {
		
		name = new_name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(int new_price) {
		price = new_price;
	}
	
	public int getPrice() {
		return price;
	}
	
}
public class Ex11_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product = new Product();
		Scanner scan = new Scanner(System.in);
		System.out.print("제품이름을 입력해주세요>>>");
		product.setName(scan.nextLine());
		System.out.print("제품가격을 입력해주세요>>>");
		System.out.print("\n");
		product.setPrice(Integer.parseInt(scan.nextLine()));
		System.out.print("제품이름은 = "+product.getName()+"\n"+"제품 가격은 = "+product.getPrice());
	}
}
