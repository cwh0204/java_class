package day11;

import java.util.Scanner;

/*	
 *  작성일 : 2025-08-28
 *	작성자 : 최원효
 *	설명 : 속성으로 메모리 용량과 회사명을 저장하는 변수를 갖는 mp3 클래스를 설계하고 다음과 같은 결과가 나오도록 객체 생성 후
 *		  메소드를 호출하시오
 */
public class Mp3 {
	private String cmap;
	private int size;
	
	public String getComp(){
		return cmap;
	}
	public int getSize(){
		return size;
	}
	
	public void setComp(String new_comp) {
		cmap = new_comp;
	}
	
	public void setSize(int new_size) {
		size = new_size;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mp3 mp3 = new Mp3();
		
		Scanner scan = new Scanner(System.in);
		mp3.setComp(scan.nextLine());
		mp3.setSize(Integer.parseInt(scan.nextLine()));
		
		System.out.println("회사명 : "+ mp3.getComp());
		System.out.println("메모리용량 : "+ mp3.getSize()+" G");
	}

}
