package day11;
/*	
 *  작성일 : 2025-08-27
 *	작성자 : 최원효
 *	설명 : 메서드 리턴타입을 참조형으로 한 경우
 */
class Data13{
	int x;
}
public class ClassEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data13 d = new Data13();
		d.x = 10;
		
		Data13 d2 = copy(d);//d2 와 d는 서로 다른 객체주소를 가진다 d2 = tmp이다 즉 d2와 tmp는 같은 객체주소를 가진다.
		
		d2.x = 11;
		d.x = 10;
		
		System.out.print("d.x="+d.x+"\n");
		System.out.print("d2.x="+d2.x);
	}
	
	static Data13 copy(Data13 d) { //메서드 변환타입이 Data13 클래스형 참조타입인 경우
		Data13 tmp = new Data13(); //새로운 객체명 tmp를 생성하면 새로운 객체주소가 할당된다.
		tmp.x = d.x;//tmp와 d는 서로 다른 객체주소를 가진다. 값만 복사
		
		return tmp;
	}

}
