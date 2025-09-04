package Study;
/*	
 *  작성일 : 2025-09-02
 *	작성자 : 최원효
 *	설명 : 자바의 논리 연산자 종류)
 *		  1.논리 연산자 결과값은 boolean 타입인 true or false이다.
 *		  2.논리 연산자 종류)
 *			&&(논리곱) -> 2개의 조건 모두 true인 경우만 결과값도 true 이고 나머지는 모두 false 이다.
 *			||(논리합) -> 2개의 조건중 하나라도 true이면 결과값도 true이다.
 *			!(논리부정 -> 입력값이 true이면 결과값은 false이고 반대로 입력값이 false이면 결과값은 true가 된다.
 */
public class TypeStudy04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		flag = (true && true);
		System.out.println("true && true" + flag); //true
		
		flag = (false || false);
		System.out.println("flase || false : "+flag); //false
		
		flag = !false; //false 의 반대는 true가 된다.
		System.out.println("!false : "+flag);
		
		System.out.println("\n==================================\n");
		
		/*
		 * 자바의 증감연산자 종류)
		 * ++(1씩 증가) : ++i (선행증가), i++(후행증가)
		 * --(1씩 감소) : --i (선행감소), i--(후행감소)
		 */
		int i = 10;
		i++;
		System.out.println("i++ = "+i);
		
		--i;
		i--;
		System.out.println("--i i-- = "+i);
		
		/*
		 * 복합 대입연산자 종류)
		 * 	i=i+1; -> 1씩증가 , 줄여서 i+=1;
		 *  i=i-1; -> 1씩감소 , 줄여서 i-=1;
		 *  
		 *  3씩 각각 증가 감소 -> i+=3; i-=3;
		 */
		i+=3;
		System.out.println("i+=3 = "+i);
		
		i-=2;
		System.out.println("i-=2 = "+i);
	}

}
