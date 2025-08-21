package day07;
/*
 * 	작성일 : 2025-08-21
 *	작성자 : 최원효
 * 	설명 : String 문자열 배열에 관한 소스)
 */
public class ArrayEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Kim","Park","Yi"};
		
		//일반 for반복문으로 names[] 문자열 배열원소값 출력
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("name["+i+"] : " + names[i]);
		}
		
		System.out.println("\n=============================\n");
		
		//향상된 확장 for반복문으로 names배열원소값 출력
		
		for(String name : names) {
			System.out.print(" " + name);
		}
		System.out.println("\n=============================\n");
		
		String tmp = names[2];
		System.out.printf("tmp = %s \n", tmp);
		
		names[0] = "Choe";
		
		for(String editName: names) {
			System.out.println(editName+"\t");
		}
	
	}

}
