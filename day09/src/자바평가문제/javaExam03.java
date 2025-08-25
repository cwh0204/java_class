package 자바평가문제;
/*
 * 	작성일 : 2025-08-25
 *	작성자 : 최원효
 * 	설명 : 자바 평가문제 3) while 반복문을 사용해서 7단 구구단을 출력되게 해보자.또한 같은 반복문을 사용해서 1부터 100까지의 누적합을 구하느 자바코드를 만들어본다
 *
 */
public class javaExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = 0;
		while(i <= 8) {
			i++;
			System.out.println("7 "+"* "+ i + " = " +7 * i);	
		}
		i = 0;
		while(i <= 99) {
			i++;
			j+=i;
		}
		System.out.println("");
		System.out.println("1부터 100까지의 누적합 "+j);
	}
}
