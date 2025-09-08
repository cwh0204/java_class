package Study;
/*
 * 1. 동일한 타입으로 하나이상의 복수개의 원소값을 고정된 크기로 한꺼번에 저장하고자 할 때 사용하는 것이 배열이다.
 * 2. 배열 주소 인덱스 번호는 0부터 시작한다.
 * 3. 배열명. length는 배열크기 즉 배열길이를 반환한다. 배열 길이는 1부터 카운터 한다. 마지막 배열 주소 인덱스 번호는 배열명.length-1이다.
 * 4. 배열원소값을 읽어올 때는 주로 for 반복문을 사용한다.
 * 
 */
public class TypeStudy08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {100,50,60,90,100};
		
		System.out.println("배열 길이="+score.length);//5
		int sum=0;
		double avg=0.0;
		
		//일반 for 반목문으로 배열원소값 출력
		for(int i=0; i<score.length; i++) {
			System.out.println(" "+score[i]);
		}
		
		System.out.println("\n =============================> \n");
		
		//자바 5버전에서 추가된 향상된 확장 for반복문으로 배열 원소 누적합
		for(int java_score : score) {
			sum += java_score;
			System.out.println(sum);
		}
		avg = (double)sum/score.length;
		
		System.out.printf("자바점수 총합 =%d \n",sum);
		System.out.printf("자바점수 평균 =%.1f \n", avg);
	}

}
