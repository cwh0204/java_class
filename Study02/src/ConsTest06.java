import net.daum.service.MemberService;
import net.daum.service.MemberServiceImpl;

public class ConsTest06 extends MemberServiceImpl{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberService member = new MemberServiceImpl();
		
		member.interMember();
	}
}
