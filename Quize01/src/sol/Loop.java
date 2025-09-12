package sol;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int b = a;
		
		int c = 0;
		
		Scanner scan = new Scanner(System.in);
		for(;;) {
			
			System.out.println("더할 숫자를 입력해주세요");
			a = Integer.parseInt(scan.nextLine());
			
			System.out.println("다음숫자를 입력하시려면 3 종료하시려면 1을 입력하세요");
			c = Integer.parseInt(scan.nextLine());
			
			if(c == 1) {
				System.out.printf("a의 값은 %d b의 값은 %d",a,b);
				System.out.printf("최종 합은 %d",(a+b));
				break;
			}
			b = a;
		}
	}

}
