package day18;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 	작성일 : 2025-09-11
 * 	작성자 : 최원효
 *	java.util 패키지의 Queue 컬렉션 인터페이스 구현 상속한 컬렉션 클래스 LinkedList 특징)
 *	 1. 입구와 출구가 달라서 가장 먼저 입력된 자료가 가장 먼저 나가는 구조이다.(First Input First Output : FIFO)
 */

public class ListEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue myQue = new LinkedList(); //업캐스팅 하면서 myQue 컬렉션 객체를 생성
		
		myQue.offer("1-java");
		myQue.offer("2-oracle");
		myQue.offer("3-Html");
		
		
//		System.out.println("myQue 컬렉션에서 2번째 중간원소값 가져오기 = " + myQue); //get(주소인덱스 번호) 메서드는 첫번째 원소값
//		//주소 인덱스 번호를 0부터 시작해서 해당 인덱스 번호의 컬렉션 원소값을 반환한다.
		
		while(myQue.peek() != null) {
			System.out.println(myQue.poll());//poll() 메서드로 큐에서 꺼내고 제거, 큐의 맨 앞 원소를 반환하고 제거
		}
	}
}
