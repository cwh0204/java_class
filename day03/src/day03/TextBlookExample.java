package day03;
/*
 * 	작성일 : 2025-08-08
 *	작성자 : 최원효
 * 	설명: 문자열 안에서 탭키만 수평으로 띄우기, 줄 바꿈, 특정 문자 입력을 위해 이스케이프 문자를 사용했다. 이스케이프 문자로 인해
 * 	코드가 매우 복잡해지고 가독성이 떨어진다. 그래서 자바 13버전부터는 텍스트 블록이 추가되어서 이스케이프 문자를 사용하지 않아도 된다.
 *  텍스트 블록은 다음과 같다.
 *  String str = """
 *  """;
 *  큰따옴표 3개로 감싸면 그 안에 작성된 문자열은 그대로 저장된다.
 */
public class TextBlookExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = """
				{
					"id":java,
					"nmae":"자바"
				}
				""";
		System.out.println(str);
		/*
		 * 텍스트 블록에서 줄바꿈은 이스케이프 문자 \n에 해당한다. 만약 줄바꿈을 하지 않고 한 줄에 연 이어서
		 * 작성하고 싶다면 맨 끝에 \를 붙여주면 된다 이 기능은 자바 14부터 사용할 수 있게 되었다.
		 */
		
		str = """
					나는 자바를 \
					학습합니다.
					나는 자바 고수가 될 겁니다.
			  """;

		System.out.println(str);
	}

}
