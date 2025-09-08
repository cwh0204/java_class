package net.daum.controller02;

import net.daum.controller01.ObjectEx16;

public class TypeStudy16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {100,100,100,100};
		ObjectEx16 obj16 = new ObjectEx16(num); //오버로딩 된 생성자
		obj16.setArr();
		
		System.out.printf("배열원소 총합=%d\n",obj16.getScore());
	}
}
