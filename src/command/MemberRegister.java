package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberRegister implements CommandProcessor{
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {
		req.setAttribute("member_reg", "회원가입");
		return "member_reg.jsp";
	}
}
