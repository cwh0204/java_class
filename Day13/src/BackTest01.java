/*
 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;


public class BackTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1,4,1,2,4,2,4,2,3,4,4};
		int a = 2;
		int c = 0;
		for(int i : num) {
			if(a == i) {
				c++;
			}
		}
		System.out.println(c);
	}
}
