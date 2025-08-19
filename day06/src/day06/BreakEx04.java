package day06;
/*
 * 	작성일 : 2025-08-19
 *	작성자 : 최원효
 * 	설명 : 무한루프 문이란 ? 반복문 조건식이 무조건 참이어서 영원히 반복하는 반복문을 말한다.
 *  자주 사용하는 무한루프문 형식)
 *  	while(true){
 *  	 반복 실행 문장;
 *  	}
 *  	
 *  	for(;;){//초기치,조건식,증감치 모두 생략하면 무한루프문이 된다.
 *  	반복 실행 문장;
 *  	}
 */
public class BreakEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(true) {
			System.out.print(i+"번째 Java!");
			
			if(++i == 10) {
				break;
			}
		}
		System.out.println("\n===========================\n");
		
		
		i=1;
		
		for(;;) {
			System.out.print(i+"번 Oracle!!");
			if(++i == 5) {
				break;
			}
		}
		
	}

}
