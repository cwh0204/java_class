package day05;
/*
 * 	작성일 : 2025-08-18
 *	작성자 : 최원효
 * 	설명 : 이중 for반복문 안에서 if~else 조건문을 넣는 실습 소스 예)
 */
public class ForEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;//반복 제어변수
		for(i=1; i<=5; i++) {
			for(j=1; j<=5; j++) {
				if(i == j) {
					System.out.printf("[%1d , %1d]",i,j);
				}else {
					System.out.printf("[%5c]",' '); //%5c 출력형태 지시자는 총 5자리 단일문자로 표현하고 오른쪽 정렬을 기본으로 한다.
				}
			}
			System.out.println(); //줄바꿈 -> 개행
		}
	}

}
