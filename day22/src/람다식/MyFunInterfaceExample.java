package 람다식;


//MyFunInterface 함수형 인터페이스를 활용해서 람다식을 작성한 소스 예)
public class MyFunInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunInterface fi;
		
		fi = () -> {
			String result = "method 호출 01";
			System.out.println(result);
		};
		fi.method();
		
		fi = () -> {
			System.out.println("method 호출02");
		};
		fi.method();
		
		fi = () -> System.out.println("method 호출03");
		fi.method();
	}
}
