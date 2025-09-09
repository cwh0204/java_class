package day16;
/*
 * 봉인된/비봉인된 인터페이스를 활용하는 예제
 */
public class interEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpClass abs = new ImpClass();
		interfaceA ia = abs;
		ia.methodA(); 
		
		System.out.println("\n ============================= \n");
		
		InterfaceB ib = abs;
		ib.methodA();
		ib.methodB();
		
		System.out.println("\n ============================= \n");
		
		InterfaceC ic = abs;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		System.out.println("\n ============================= \n");
		
	}
}
