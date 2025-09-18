package 람다식;

public class MyFunInterfaceExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunInterface3 fi;
		fi = (a,b) -> {
			int c = a+b;
			return c;
		};
		System.out.println(fi.method(10, 12));
		fi = (a,b) -> {
			return a+b;
		};
		System.out.println(fi.method(10, 12));
		
		fi = (a,b) -> a+b;
		System.out.println(fi.method(10, 12));
		
		fi = (a,b) -> sum(a,b);
		System.out.println(fi.method(10, 12));
		
	}
	
	public static int sum(int a, int b) {
		return a-b;
	}

}
