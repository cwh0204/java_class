package day24;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 	www.nate.com 이라는 도메인을 가진웹사이트 주소를 입력하면 이주소에 대한 ip 주소를 알아내는 소스)
 */
public class NetWorkEx01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader reader;
		String url = null;
		InetAddress addr = null;
		
		reader = new BufferedReader(new InputStreamReader(System.in));
		/*	1.System.in은 키보드 입력장치와 연결됨
		 * 	2. InputStreamReader는 읽어들인 바이트 스트림을 문자스트림으로 변경
		 * 	3. BufferedReader는 읽어들인 임시 메모리에 버퍼링(임시저장)해서 한꺼번에 한줄 끝까지 문자열로 통으로 읽어들임. 그만큼 효율적이다.
		 */
		System.out.print("사이트 주소 입력(www.nate.com) >>");
		url = reader.readLine();
		
		try {
			addr = InetAddress.getByName(url);//인자값으로 주어진 url에 대한 InetAddress 객체 반환
		}catch (UnknownHostException ue) {
			ue.printStackTrace();
		}
		System.out.print("\n===================================\n");
		System.out.println(url+"에 대한 ip주소 반환 : " + addr.getHostAddress());
	}
}
