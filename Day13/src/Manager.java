/*	
 *  작성일 : 2025-09-02
 *	작성자 : 최원효
 *	설명 : non-sealed 비봉인 자손 클래스 Manger로 정의했기 때문에 또 다른 자손 클래스 생성이 가능하다.
 */
public non-sealed class Manager extends Person {

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("생산 관리를 합니다.");
	}
}
