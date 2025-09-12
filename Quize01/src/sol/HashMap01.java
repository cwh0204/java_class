package sol;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> member = new ArrayList<Object>();
		Map<String, List> members = new HashMap<>();
		
		member.add("최상철"); //id
		member.add(1234);
		member.add("대전광역시");
		member.add(970204);
		member.add("자바개못함");
		
		members.put((String)member.get(0), member);
		System.out.println(members.get("최상철"));
		System.out.println(members);
	}

}
