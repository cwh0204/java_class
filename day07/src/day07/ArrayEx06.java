package day07;

import java.util.Arrays;

/*
 * 	작성일 : 2025-08-21
 *	작성자 : 최원효
 * 	설명 : 자바에서 다양한 배열 생성법과 복수개의 배열 원소값을 쉽게 읽어오는 용도로만 사용하는 jdk 1.5 버전에서 추가된 향상된 확장 for
 * 	반복문을  사용하는 예)
 */
public class ArrayEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr01 = new int[10];
		int[] iArr02 = new int[] {100,99,100,90,100};
		int[] iArr03 = {100,100,85,95,90};
		int[] chArr = {'a','b','c','d','e'};
		
		for(int i = 0; i<iArr01.length; i++) {
			iArr01[i] = i+1;
			System.out.print(" " + iArr01[i]);
			
		}
		
		System.out.println("\n====================================\n");
		
		for(int k : iArr02) {
			System.out.print(" " + k);
		}
		
		System.out.println("\n====================================\n");
		
		System.out.println(Arrays.toString(iArr03)); //자바 내장 api를 사용해서 배열 원소값을 문자열로 반환
		System.out.println(chArr);
	}

}
