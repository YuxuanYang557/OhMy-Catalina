import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
public class RequestHeader extends HttpServlet {
public void init()
{
//called once when the servlet is initialized
}
public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
{
//called once for every user request
response.setContentType("text/html");
//Create a writer to print HTML to the User Browser
PrintWriter out= response.getWriter();

//Enumeration<String> header2 = request.getHeaderNames();
out.println("<HTML>");
out.println("<BODY>");
for(Enumeration<String> header = request.getHeaderNames(); header.hasMoreElements();){ 
	String hname = header.nextElement();
	for(Enumeration<String> name = request.getHeaders(hname); name.hasMoreElements();){
out.println( hname+" :" + name.nextElement()+"<br>");
}
}
out.println("</BODY>");
out.println("</HTML>");
out.close();
}
public void doPost(HttpServletRequest request, HttpServletResponse response)
{
}
public void doPut(HttpServletRequest request, HttpServletResponse response)
{
}
public void doDelete(HttpServletRequest request, HttpServletResponse response)
{
}
public void destroy()
{
//called once when the servlet in destroyd
}
}