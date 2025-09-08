package Study;
/*
 * 무한 루프문이란? 반복문 조건식이 무조건 참이어서 영원히 반복하는 반복문을 말한다.
 * while(true){
 * 	실행문장;
 * }
 * 
 * for(int i=1; i>=10; i++){
 * }
 * for(;;){
 * 	초기치,조건식,증가치를 생략하면 무한루프문이 된다.
 * }
 * 
 * 실제 프로젝트 개발에서 무한루프문은 주로 while반복문과 함께 많이 사용한다.
 * 
 */
public class TypeStudy12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while 반복문을 이용한 무한루프문
		int i = 1; //반복문 제어변수
		while(true) {
			System.out.println(" " + i +" 번째 while 반복문 반복");
			if(++i==10) {
				break; //반복문 종료
			}
		}
		i = 0;
		System.out.println("\n===================================\n");
		for(;;) {
			System.out.println(" " + i +" 번째 for 반복문 반복");
			if(++i == 10) {
				break;
			}
		}
	}

}
