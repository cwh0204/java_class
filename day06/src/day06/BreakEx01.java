package day06;
/*
 * 	작성일 : 2025-08-19
 *	작성자 : 최원효
 * 	설명 : 반복문내에서 break문을 만나면 해당 문을 중단(종료)한다.
  */
public class BreakEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		//1부터 10까지 반복
		for(i=1; i<=10; i++) {
			System.out.print(" "+i);
		}
		System.out.println("\n =======================\n");
		
		for(i=1; i<=10; i++) {
			if(i % 4 == 0) {
				break;
			}
			System.out.print(" "+i);
		}
	}

}
