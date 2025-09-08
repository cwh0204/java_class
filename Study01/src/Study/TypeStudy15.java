package Study;


class ObjectEx15{
	int sum = 0; //누적합을 저장항 클래스 소속 맴버변수 중 인스턴스 변수
	
	public ObjectEx15() {
		//일반 for 반복문으로 1부터 100까지 더한다
		for(int i = 1; i<=100; i++) {
			sum+= i;
		}
	}
	public int getSum() {
		return sum;
	}
}
public class TypeStudy15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result_totoal = new ObjectEx15().getSum();
		
		System.out.println(result_totoal);
	}
}
