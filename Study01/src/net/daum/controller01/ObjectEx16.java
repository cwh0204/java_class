package net.daum.controller01;

public class ObjectEx16 {
	int[] score;
	int sum;
	public ObjectEx16(int[] arr) {
		this.score = arr;
	}//생성자 오버로딩
	
	public void setArr() {
		//향상된 확장 for 반복문으로 배열원소값 출력과 누적합
		
		for(int i : score) {
			sum+= i;
		}
		System.out.println(sum);
		System.out.println("\n===========================\n");
	}
	
	public int getScore() {
		return sum;
	}
}
