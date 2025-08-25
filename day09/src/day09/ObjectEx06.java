package day09;
/*
 * 	작성일 : 2025-08-25
 *	작성자 : 최원효
 * 	설명 : new 키워드로 서로 다른 객체를 생성했지만 같은 객체 주소를 가리키는 방법에 대한 소스예)
 */

class Tv06{
	int channel;
}
public class ObjectEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv06 tv01 = new Tv06();
		Tv06 tv02 = new Tv06(); //tv01과 tv02눈 서로 다른 객체 주소를 가진다.
		
		tv02 = tv01;
		/*
		 * tv01 객체주소가 tv02에 대입된다. 그러면 기존 tv02객체 주소는 사라진다. 결국 tv01과 tv02는 같은 객체주소를 가리킨다.
		 * 
		 */
		
		tv02.channel = 10;
		tv01.channel = 5;
		
		System.out.println(tv01.channel);
		System.out.println(tv02.channel);
	}

}
