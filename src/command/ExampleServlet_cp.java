package command;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import command.CommandProcessor;
import command.DoLogin;
import command.MemberModify;
import command.MemberRegister;


@WebServlet("/ExampleServlet_cp")
public class ExampleServlet_cp extends HttpServlet	implements CommandProcessor {
	private static final long serialVersionUID = 1L;
    private HashMap<String, Object> commandProcessorMap = new HashMap<>();   

    public ExampleServlet_cp() {
        super();
    }
    
    public void init(ServletConfig config) throws ServletException{
    	FileInputStream fis =null;
    	Properties prop = new Properties();
    	try {
    		fis = new FileInputStream("D:\\HYUN\\workspace\\MVC_example\\WebContent\\WEB-INF\\command.prop");
    		prop.load(fis);
    	}catch (Exception e) {
    	}finally {
    		if(fis !=null)
    			try {
    				fis.close();
    			}catch(IOException ex) {
    			}
    	}
    	Iterator<Object> iter = prop.keySet().iterator();
    	while(iter.hasNext()) {
    		String cmd = (String) iter.next();
    		String processorClassname = prop.getProperty(cmd);
    		try {
    			Class processorClass = Class.forName(processorClassname);
    			Object processorInstance = processorClass.newInstance();
    			commandProcessorMap.put(cmd, processorInstance);
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		String view = null;
		CommandProcessor processor = (CommandProcessor) commandProcessorMap.get(cmd);

		view = processor.process(request, response);
		RequestDispatcher dis = request.getRequestDispatcher(view);
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {
		return null;
	}
	
}
