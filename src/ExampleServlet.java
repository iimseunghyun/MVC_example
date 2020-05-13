

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;

import javax.servlet.RequestDispatcher;
/**
 * Servlet implementation class ExampleServlet
 */
@WebServlet("/ExampleServlet") /***웹브라우저의 요청을 받는 곳*/
public class ExampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExampleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String param = request.getParameter("name"); //<url>+ ?name=Jimmy
//		Object objResult = null;
//		
//		if(param == null) objResult = new String("Hello, MVC!");
//		else objResult = new java.util.Date();
//		                                                                            
//		request.setAttribute("result", objResult);
//		
//		RequestDispatcher dis = request.getRequestDispatcher("/view.jsp");
//		dis.forward(request,  response);
//	}
//			
		  if(request.getCharacterEncoding() == null) { //파라미터 인코딩
			   request.setCharacterEncoding("utf-8");
			  }
		String cmd = request.getParameter("cmd");
		String view = null;
		
				
		if(cmd == null) {
				view = "page_input.jsp";			
		}else if(cmd.equals("로그아웃")|| cmd.equals("logout")) {
			view = "logout.jsp";
			cmd = "logout";
			request.setAttribute(cmd, "로그아웃되었습니다.");
		}else if(cmd.equals("회원가입")|| cmd.equals("reg")) {       //null.equals("str") : 예외발생
				view = "member_reg.jsp";
				cmd = "member_reg";
				request.setAttribute(cmd, "회원가입 페이지입니다.");
		}else if(cmd.equals("정보변경")|| cmd.equals("mod")) {
				view = "member_info.jsp";
				cmd = "member_mod";
				request.setAttribute(cmd, "회원 정보변경 페이지입니다.");
		}else if(cmd.equals("로그인")|| cmd.equals("login")) {
				view = "member_login.jsp";
				cmd = "login"; 
				request.setAttribute(cmd, "로그인되었습니다.");
		}
//		request.setAttribute(cmd,cmd);
		RequestDispatcher dis = request.getRequestDispatcher(view);
		dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);

	}

}
