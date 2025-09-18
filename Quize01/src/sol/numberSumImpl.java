package sol;

public class numberSumImpl {
	
	public void asum(){
		numberSum a = (x, y) -> System.out.println(x+y);
		a.numberSums(1,2);
	}
	public void asums() {
		numberSum a = (x, y) -> System.out.println(x*y);
		a.numberSums(1,2);
	}
	public void aavg() {
		numberSum a = (x, y) -> System.out.println(x/y);
		a.numberSums(1,2);
	}
}
