package day08;
/*
 * 	작성일 : 2025-08-22
 *	작성자 : 최원효
 * 	설명 : 사용자 정의 정적메서드 정의
 *        정적 메서드란 클래스 객체를 생성하지 않고, 해당 클래스로 직접 호출하는 메서드를 말한다.
 *        정적 메서드는 static 키워드로 정의한다.
 */
public class ArrayTest06 { //void는 반환값이 없는 타입 즉 리턴타입이 없는 자료형이다 sum()은 메서드명 int count는 매개변서
						   //전달인자라고 한다. 이 매개변수에 대입되는 값을 인자값이라고 한다. 영어로는 parameter Value이다.
	static void sum(int count) {
		int total = 0; //누적합을 저장하는 지역변수이다. 지역변수는 선언과 동시에 초기화 과정을 해야한다.
		
		for (int i = 1; i< count; i++) {
			total+=1;
		}
		
		System.out.printf("1부터 %d까지의 누적합 = %d \n", count, total);
		System.out.printf("\n=====================================\n");
	}
	
	
	static void sum2(int cnt) {
		int sum3 = 0;
		int i = 1;
		while(i <= cnt) {
			
			sum3 += i;
			i++;
		}
		System.out.printf("1부터 %d까지의 누적합 = %d \n",cnt,sum3);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayTest06.sum(7); //클래스명 . 정적메서드()
		sum(10); // 같은 클래스내에서 정적메서드를 호출할 때는 해당 클래스명을 생략하면 된다
		
		ArrayTest06.sum2(10);
		sum2(10);
		/* 문제) 리턴타입이 없는 void형으로 1부터 10까지의 누적합을 구하는 정적 메서드 static void sum2(int cnt){}를 정의한다.
		 * 이 메서드 실행문장으로 while반복문을 사용해서 누적합을 구하는 코드를 완성한다
		 */
	}
	

}
