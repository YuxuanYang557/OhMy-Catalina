import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class Form extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		res.setContentType("text/html");
		PrintWriter out= res.getWriter();
		
		
		String email = req.getParameter("email");
		String psd = req.getParameter("password");
		String cpsd = req.getParameter("cpassword");
		String pic = req.getParameter("image");
		String gender = req.getParameter("gender");
		String country = req.getParameter("country");
		String h3 = req.getParameter("hobby1");
		String h2 = req.getParameter("hobby2");
		String addr = req.getParameter("address");
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>info page</title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<h2> using getParameter() </h2>");
		
		out.println("<h3>Please confirm your information</h3>");
		out.println("<h3>Your Email is : "+ email +"</h3>");
		out.println("<h3>Your Password is : "+ psd +"</h3>");
		out.println("<h3>Your Confirm Password is : "+ cpsd +"</h3>");
		out.println("<h3>Your file path is : "+ pic+"</h3>");
		out.println("<h3>Your Gender is : "+ gender +"</h3>");
		out.println("<h3>Your Country is : "+ country +"</h3>");
		out.println("<h3>Your Hobby1 is : "+ h3 +"</h3>");
		out.println("<h3>Your Hobby2 is : "+ h2 +"</h3>");
		out.println("<h3>Your Address is : "+ addr +"</h3>");
		
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