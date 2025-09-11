package day18;

import java.util.Stack;

/*
 * 작성일 : 2025-09-11
 * 작성자 : 최원효
 * 설명 : java.util 패키지의 컬렉션 클래스 Stack의 특징)
 * 	1. jdk 1.0에서 추가된 컬렉션 클래스이다.
 *  2. 입구와 출구가 같기 때문에 가장 먼저 입력된 데이터가 가장 나중에 출력되는 구조이다.(First Input Last Output : FILO)
 *  3. 가장 나중에 입력된 데이터가 가장 먼저 나가는 구조이다.(Last Input First Output 구조: LIFO)
 */
public class ListEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack myStack = new Stack();
		
		myStack.push("1-java");
		myStack.push("2-oracle");
		myStack.push("3-html");
		
		
		while(!myStack.isEmpty()) {
			
			System.out.println(myStack.pop());
		/*
		 * pup()은 스택 맨 위의 원소를 제거하면서 반환한다.
		 * 따라서 입력된 값이 역순으로 출력된다 
		 */
		
		}
	}

}
