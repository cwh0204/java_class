/*	
 *  작성일 : 2025-09-02
 *	작성자 : 최원효
 *	설명 : 1.무분별한 자손 클래스 생성을 방지하기 위해서 봉인된(sealed) 클래스가 도입되었다.
 *		  2.봉인된 클래스 Person을 정의하면 permits 키워드 다음에 오는 자손 클래스를 따로 정의해야 한다. 즉 permits 다음에 오는 Employee,
 *			Manger만 자손 클래스를 정의할 수 있고, 그 이외의 자손클래스는 생성할 수 없다
 */

public sealed class Person permits Employee, Manager{
	
	public String name;
	
	public void work() {
		System.out.println("하는 일이 결정되지 않았습니다");
	}

}
