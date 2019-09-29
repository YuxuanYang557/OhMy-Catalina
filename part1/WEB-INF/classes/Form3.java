import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class Form3 extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		res.setContentType("text/html");
		PrintWriter out= res.getWriter();
		String method = req.getParameter("method");
		
		
		
		Map<String, String[]> m = req.getParameterMap();
		
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>info page</title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<h2> using getParameterMap() </h2>");
		
		out.println("<h3>Please confirm your information</h3>");
		out.println("<h3>Your Email is : "+ m.get("email")[0] +"</h3>");
		out.println("<h3>Your Password is : "+  m.get("password")[0]  +"</h3>");
		out.println("<h3>Your Confirm Password is : "+  m.get("cpassword")[0] +"</h3>");
		out.println("<h3>Your file path is : "+  m.get("image")[0] +"</h3>");
		out.println("<h3>Your Gender is : "+  m.get("gender")[0]  +"</h3>");
		out.println("<h3>Your Country is : "+  m.get("country")[0]  +"</h3>");
		out.println("<h3>Your Hobby1 is : "+  m.get("hobby1")[0] +"</h3>");
		out.println("<h3>Your Hobby2 is : "+  m.get("hobby2")[0]  +"</h3>");
		out.println("<h3>Your Address is : "+  m.get("address")[0]  +"</h3>");
		
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