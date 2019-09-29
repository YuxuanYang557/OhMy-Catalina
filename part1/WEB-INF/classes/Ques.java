import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpSession;

public class Ques extends HttpServlet{

	HttpSession session;
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException{
	
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String pn = req.getParameter("page");
		HttpSession session = req.getSession(true);
		
		//if(pn.equals("1")){
		
			String children = req.getParameter("number");
			session.setAttribute("childNum", children);
			
			out.println("<html>");
			out.println("<head>");
			out.println("<title>info page</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<form action = 'ques/q2' method='post'>");
			out.println("<p>Please enter the name of the child number1</p><br>");
			out.println("<input type='text' name='child1'><br<br>");
			out.println("<p>Please enter the name of the child number2</p><br>");
			out.println("<input type='text' name='child2'><br><br>");
			out.println("<p>Please enter the name of the child number3</p><br>");
			out.println("<input type='text' name='child3'><br><br>");
			out.println("<input type='hidden' name='page' value='2'>");
			out.println("<input type='submit' value='Submit Query'>");
			out.println("</form>");
			
			
			out.println("</body>");
			out.println("</html>");
		
		//}else if(pn.equals("2")){
			

		
		//}
		
	
	}
	
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			HttpSession session = req.getSession(true);
	
			String child1 = req.getParameter("child1");
			String child2 = req.getParameter("child2");
			String child3 = req.getParameter("child3");
			
			session.setAttribute("child1", child1);
			session.setAttribute("child2", child2);
			session.setAttribute("child3", child3);
			
			out.println("<html>");
			out.println("<head>");
			out.println("<title>info page</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<p>Your "+ session.getAttribute("childNum")+" children's names are:</p><br><br>");
			out.println("<p>"+ session.getAttribute("child1")+"</p><br><br>");
			out.println("<p>"+ session.getAttribute("child2")+"</p><br><br>");
			out.println("<p>"+ session.getAttribute("child3")+"</p><br><br>");

			
			
			out.println("</body>");
			out.println("</html>");
	}
}