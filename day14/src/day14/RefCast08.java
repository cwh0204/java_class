package day14;
/*	
 *  작성일 : 2025-09-04
 *	작성자 : 최원효
 *	설명 : 업캐스팅 다운캐스팅 테스트
 */
class Up01{
	
}

class Up02 extends Up01{
	void UpM() {
		System.out.println("안녕하세요");
	}
}

class Up03 extends Up01{
	void UpM() {
		System.out.println("안녕하세요");
	}
}

public class RefCast08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new Up03();
		Up03 up1 = (Up03)obj;//다운캐스팅 가능
//		Up02 up2 = (Up02)obj;//부모가 자식을 본적이 없음
		up1.UpM();
		
		Up01 a = new Up03();
		
		Up03 b = (Up03)a;
		
	}

}
