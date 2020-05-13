package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberModify implements CommandProcessor{
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {
		req.setAttribute("member_mod", "회원 정보 수정");
		return "member_info.jsp";
	}

}
