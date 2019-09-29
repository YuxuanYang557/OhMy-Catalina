import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class Form2 extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		res.setContentType("text/html");
		PrintWriter out= res.getWriter();
		String method = req.getParameter("method");
		
		
		
		
		
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>info page</title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<h2> using getParameterNames() </h2>");
		
		out.println("<h3>Please confirm your information</h3>");
		for(Enumeration<String> r = req.getParameterNames(); r.hasMoreElements();){
			String name =r.nextElement();
			out.println("<h3>Your "+name+ " is : "+ req.getParameter(name) +"</h3>");
		}
		

		//out.println("<form action='display/d2' method=''>");
		//out.println("<input type='hidden' name='method' value='2'> ");
		//out.println("<input type='submit' value='method2'>");
		//out.println("</form>");
		
		out.println("</body>");
		out.println("</html>");
		
			
		
	}
	
	public void doPost(HttpServletRequest res, HttpServletResponse resp){
	
	}
}