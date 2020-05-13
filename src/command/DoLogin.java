package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoLogin implements CommandProcessor {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {
		req.setAttribute("login", "로그인");
		return "member_login.jsp";
	}

}
