package 람다식;

public class MyFunInterfaceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunInterface2 fi;
		fi = (x) -> {
			int result = x * 7;
			System.out.println(result);
		};
		
		fi.method(10);
		
		fi = (a) -> {
			System.out.println(a * 7);
		};
		fi.method(10);
		
		fi = a -> System.out.println(a * 7);
		fi.method(10);
	}

}
