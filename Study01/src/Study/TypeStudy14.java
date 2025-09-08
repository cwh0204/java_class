package Study;
/*]
 * 
 */
class ObjectEx14{
	int[] arr = new int[10];
	
	public ObjectEx14() {
		//일반 for 반목문으로 배열 원소값 초기화
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1; //1부터 10까지 초기화
		}
	}
	
	public void pr() {
		int total=0;
		for(int i : arr) {
			total += i;
			System.out.print(i);
		}
		System.out.println("\n ========================> \n");
		System.out.println(total);
	}
}
public class TypeStudy14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectEx14 obj14 = new ObjectEx14();
		obj14.pr();
		obj14.pr();
	}
}
