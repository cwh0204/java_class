package day19;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/*
 * 	작성일 : 2025-09-12
 * 	작성자 : 최원효
 * java 7버전에서 AutoCloseable 인터페이스가 추가 되었다. 이 인터페이스를 구현상속 받은 자손은 API는 try()내에서 객체를 생성하면 fianlly문에서
 * 명시적으로 close() 닫지 않아도 자동으로 닫힌다.
 */
public class TryCatchEx09 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		List<String> cityList = new ArrayList<>();//문자열만 저장가능한 컬렉션 제네릭 객체 cityList 생성
		
		cityList.add("seoul");
		cityList.add("busan");
		cityList.add("daejeon");
		
		/*
		 * STS(이클립스) 개발툴에서 기본 경로로 인식하는 것은 프로젝트 경로이다. 여기서는 Day19이다. /는 현재경로를 의미하는 상대경로이다.
		 */
		
		try(PrintWriter output=new PrintWriter("./src/result.txt")){
			//PrintWriter java.io 입출력 패키지 경로에 있는 문자 출력스트림 API이다. 아 클래스는 AutoCloseable인터페이스를 구현 상속 받고 있다.
			
			for(String cityName: cityList) {
				output.println(cityName.toUpperCase());
			}
		}
	}
}
