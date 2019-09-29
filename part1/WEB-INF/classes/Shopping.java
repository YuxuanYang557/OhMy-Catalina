import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;

public class Shopping extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
	
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String pageType = req.getParameter("page");
		HttpSession session = req.getSession(true);
		
	if(pageType.equals("book")){
		
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>info page</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<a href='shop/book?page=book'>Books</a><br>");
		out.println("<a href='shop/pc?page=pc'>Computers</a><br>");
		out.println("<a href='shop/music?page=music'>Musics</a><br>");
		
		out.println("<h1>Shop for books</h1>");
		out.println("<form action='shop' method=''>");
		out.println("<input type='checkbox' name='b1' value='Java Servlet Programming[$29.95]'> Java Servlet Programming[$29.95]<br>");
		out.println("<input type='checkbox' name='b2' value='Oracle Database Programming[$48.95]'> Oracle Database Programming[$48.95]<br>");
		out.println("<input type='checkbox' name='b3' value='System Analysis and Design With URL[$14.95]'> System Analysis and Design With URL[$14.95]<br>");
		out.println("<input type='checkbox' name='b4' value='Object Oriented Engineering[$35.99]'> Object Oriented Engineering[$35.99]<br>");
		out.println("<input type='checkbox' name='b5' value='Jave Web Services[$27.99]'> Jave Web Services[$27.99]<br>");
		out.println("<input type='hidden' name='page' value='result'>");
		out.println("<input type='submit' value='Add to Cart'>");
		out.println("</form><br>");
		out.println("<a href='shop/cart?page=cart'>View Cart</a>");
		
		out.println("</body>");
		out.println("</html>");
		
	}else if(pageType.equals("pc")){
		
	    out.println("<html>");
		out.println("<head>");
		out.println("<title>info page</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<a href='shop/book?page=book'>Books</a><br>");
		out.println("<a href='shop/pc?page=pc'>Computers</a><br>");
		out.println("<a href='shop/music?page=music'>Musics</a><br>");
		
		out.println("<h1>Session ID : "+ session.getId() +"</h1>");
		
		out.println("<h1>Shop for Laptops</h1>");
		out.println("<form action='shop' method=''>");
		out.println("<input type='checkbox' name='c1' value='Apple Mac Book Pro with 13.3 Display[$1299.99]'> Apple Mac Book Pro with 13.3 Display[$1299.99]<br>");
		out.println("<input type='checkbox' name='c2' value='Asus Laptop with Centrino 2 Black[$949.95]'> Asus Laptop with Centrino 2 Black[$949.95]<br>");
		out.println("<input type='checkbox' name='c3' value='HP Pavilion Laptop with Centrino 2 DV7[$1199.95]'> HP Pavilion Laptop with Centrino 2 DV7[$1199.95]<br>");
		out.println("<input type='checkbox' name='c4' value='Toshiba Satellite Laptop with Centrino 2 Copper[$899.99]'> Toshiba Satellite Laptop with Centrino 2 Copper[$899.99]<br>");
		out.println("<input type='checkbox' name='c5' value='Sony VAIO Laptop with Core 2 Duo Cosmopolitan Pink[$799.99]'> Sony VAIO Laptop with Core 2 Duo Cosmopolitan Pink[$799.99]<br>");
		out.println("<input type='hidden' name='page' value='result'>");
		out.println("<input type='submit' value='Add to Cart'>");
		out.println("</form><br>");
		out.println("<a href='shop/cart?page=cart'>View Cart</a>");
		
		
		out.println("</body>");
		out.println("</html>");
	
	}else if(pageType.equals("music")){
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>info page</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<a href='shop/book?page=book'>Books</a><br>");
		out.println("<a href='shop/pc?page=pc'>Computers</a><br>");
		out.println("<a href='shop/music?page=music'>Musics</a><br>");
		
		out.println("<h1>Session ID : "+ session.getId() +"</h1>");
		
		out.println("<h1>Shop for Musics</h1>");
		out.println("<form action='shop' method=''>");
		out.println("<input type='checkbox' name='m1' value='I'm Going to Tell You a Secret by Madonna[$26.99]'> I'm Going to Tell You a Secret by Madonna[$26.99]<br>");
		out.println("<input type='checkbox' name='m2' value='Baby One More Time By Britney Spears[$10.95]'> Baby One More Time By Britney Spears[$10.95]<br>");
		out.println("<input type='checkbox' name='m3' value='Justified by Justin Timberlake[$9.97]'> Justified by Justin Timberlake[$9.97]<br>");
		out.println("<input type='checkbox' name='m4' value='Loose by Nelly Furtado[$13.99]'> Loose by Nelly Furtado[$13.99]<br>");
		out.println("<input type='checkbox' name='m5' value='Glod Dogger by Kanye West[$27.99]'> Glod Dogger by Kanye West[$27.99]<br>");
		out.println("<input type='hidden' name='page' value='result'>");
		out.println("<input type='submit' value='Add to Cart'>");
		out.println("</form><br>");
		out.println("<a href='shop/cart?page=cart'>View Cart</a>");
		
		
		out.println("</body>");
		out.println("</html>");
		
	}else if(pageType.equals("cart")){
		
		//delete
		String b1 = req.getParameter("b1");
		String b2 = req.getParameter("b2"); 
		String b3 = req.getParameter("b3");
		String b4 = req.getParameter("b4");
		String b5 = req.getParameter("b5");
		String c1 = req.getParameter("c1");
		String c2 = req.getParameter("c2"); 
		String c3 = req.getParameter("c3");
		String c4 = req.getParameter("c4");
		String c5 = req.getParameter("c5");
		String m1 = req.getParameter("m1");
		String m2 = req.getParameter("m2"); 
		String m3 = req.getParameter("m3");
		String m4 = req.getParameter("m4");
		String m5 = req.getParameter("m5");	
		if(b1 != null) {session.removeAttribute("b1");}
		if(b2 != null) {session.removeAttribute("b2");}
		if(b3 != null) {session.removeAttribute("b3");}
		if(b4 != null) {session.removeAttribute("b4");}
		if(b5 != null) {session.removeAttribute("b5");}
		if(c1 != null) {session.removeAttribute("c1");}
		if(c2 != null) {session.removeAttribute("c2");}
		if(c3 != null) {session.removeAttribute("c3");}
		if(c4 != null) {session.removeAttribute("c4");}
		if(c5 != null) {session.removeAttribute("c5");}
		if(m1 != null) {session.removeAttribute("m1");}
		if(m2 != null) {session.removeAttribute("m2");}
		if(m3 != null) {session.removeAttribute("m3");}
		if(m4 != null) {session.removeAttribute("m4");}
		if(m5 != null) {session.removeAttribute("m5");}
		
				
		out.println("<html>");
		out.println("<head>");
		out.println("<title>info page</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<a href='shop/book?page=book'>Books</a><br>");
		out.println("<a href='shop/pc?page=pc'>Computers</a><br>");
		out.println("<a href='shop/music?page=music'>Musics</a><br>");
		out.println("<h1>This is your shopping cart</h1>");
		//show
		out.println("<form action='shop' method=''>");
		if(session.getAttribute("b1") != null){ out.println("<input type='checkbox' name ='b1'>"+session.getAttribute("b1")+"<br>"); }
		if(session.getAttribute("b2") != null){ out.println("<input type='checkbox' name ='b2'>"+session.getAttribute("b2")+"<br>"); }
		if(session.getAttribute("b3") != null){ out.println("<input type='checkbox' name ='b3'>"+session.getAttribute("b3")+"<br>"); }
		if(session.getAttribute("b4") != null){ out.println("<input type='checkbox' name ='b4'>"+session.getAttribute("b4")+"<br>"); }
		if(session.getAttribute("b5") != null){ out.println("<input type='checkbox' name ='b5'>"+session.getAttribute("b5")+"<br>"); }
		if(session.getAttribute("c1") != null){ out.println("<input type='checkbox' name ='c1'>"+session.getAttribute("c1")+"<br>"); }
		if(session.getAttribute("c2") != null){ out.println("<input type='checkbox' name ='c2'>"+session.getAttribute("c2")+"<br>"); }
		if(session.getAttribute("c3") != null){ out.println("<input type='checkbox' name ='c3'>"+session.getAttribute("c3")+"<br>"); }
		if(session.getAttribute("c4") != null){ out.println("<input type='checkbox' name ='c4'>"+session.getAttribute("c4")+"<br>"); }
		if(session.getAttribute("c5") != null){ out.println("<input type='checkbox' name ='c5'>"+session.getAttribute("c5")+"<br>"); }
		if(session.getAttribute("m1") != null){ out.println("<input type='checkbox' name ='m1'>"+session.getAttribute("m1")+"<br>"); }
		if(session.getAttribute("m2") != null){ out.println("<input type='checkbox' name ='m2'>"+session.getAttribute("m2")+"<br>"); }
		if(session.getAttribute("m3") != null){ out.println("<input type='checkbox' name ='m3'>"+session.getAttribute("m3")+"<br>"); }
		if(session.getAttribute("m4") != null){ out.println("<input type='checkbox' name ='m4'>"+session.getAttribute("m4")+"<br>"); }
		if(session.getAttribute("m5") != null){ out.println("<input type='checkbox' name ='m5'>"+session.getAttribute("m5")+"<br>"); }
		out.println("<input type='hidden' name='page' value='cart'>");
		out.println("<input type='submit' value='Remove'>");
		out.println("</form><br>");
		out.println("<a href='shop/cart?page=cart'>View Cart</a>");
		
		out.println("<h1>Session ID : "+ session.getId() +"</h1>");
		
		out.println("</body>");
		out.println("</html>");
		
		
	}else if(pageType.equals("result")){
		
		String b1 = req.getParameter("b1");
		String b2 = req.getParameter("b2"); 
		String b3 = req.getParameter("b3");
		String b4 = req.getParameter("b4");
		String b5 = req.getParameter("b5");
		String c1 = req.getParameter("c1");
		String c2 = req.getParameter("c2"); 
		String c3 = req.getParameter("c3");
		String c4 = req.getParameter("c4");
		String c5 = req.getParameter("c5");
		String m1 = req.getParameter("m1");
		String m2 = req.getParameter("m2"); 
		String m3 = req.getParameter("m3");
		String m4 = req.getParameter("m4");
		String m5 = req.getParameter("m5");
		if(session.getAttribute("b1") == null) { session.setAttribute("b1", b1);}
		if(session.getAttribute("b2") == null) { session.setAttribute("b2", b2);}
		if(session.getAttribute("b3") == null) { session.setAttribute("b3", b3);}
		if(session.getAttribute("b4") == null) { session.setAttribute("b4", b4);}
		if(session.getAttribute("b5") == null) { session.setAttribute("b5", b5);}
		if(session.getAttribute("c1") == null) { session.setAttribute("c1", c1);}
		if(session.getAttribute("c2") == null) { session.setAttribute("c2", c2);}
		if(session.getAttribute("c3") == null) { session.setAttribute("c3", c3);}
		if(session.getAttribute("c4") == null) { session.setAttribute("c4", c4);}
		if(session.getAttribute("c5") == null) { session.setAttribute("c5", c5);}
		if(session.getAttribute("m1") == null) { session.setAttribute("m1", m1);}
		if(session.getAttribute("m2") == null) { session.setAttribute("m2", m2);}
		if(session.getAttribute("m3") == null) { session.setAttribute("m3", m3);}
		if(session.getAttribute("m4") == null) { session.setAttribute("m4", m4);}
		if(session.getAttribute("m5") == null) { session.setAttribute("m5", m5);}
		
		
		out.println("<h1>Session ID : "+ session.getId() +"</h1>");
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>info page</title>");
		out.println("</head>");
		out.println("<body>");

		out.println("<h3>The following item has been added to shopping cart successfully</h3>");
		if(b1 != null){ out.println("<h3>" + b1 +"</h3>"); }
		if(b2 != null){ out.println("<h3>" + b2+ "</h3>"); }
		if(b3 != null){ out.println("<h3>" + b3+ "</h3>"); }
		if(b4 != null){ out.println("<h3>" + b4+ "</h3>"); }
		if(b5 != null){ out.println("<h3>" + b5+ "</h3>"); }
		if(c1 != null){ out.println("<h3>" + c1 +"</h3>"); }
		if(c2 != null){ out.println("<h3>" + c2+ "</h3>"); }
		if(c3 != null){ out.println("<h3>" + c3+ "</h3>"); }
		if(c4 != null){ out.println("<h3>" + c4+ "</h3>"); }
		if(c5 != null){ out.println("<h3>" + c5+ "</h3>"); }
		if(m1 != null){ out.println("<h3>" + m1 +"</h3>"); }
		if(m2 != null){ out.println("<h3>" + m2+ "</h3>"); }
		if(m3 != null){ out.println("<h3>" + m3+ "</h3>"); }
		if(m4 != null){ out.println("<h3>" + m4+ "</h3>"); }
		if(m5 != null){ out.println("<h3>" + m5+ "</h3>"); }
		
		out.println("<a href='shop/cart?page=cart'>[View Cart]</a>");
		out.println("<a href='shop/book?page=book'>[Go to Books Page]</a>");
		out.println("<a href='shop/pc?page=pc'>[Go to Computer Page]</a>");
		out.println("<a href='shop/music?page=music'>[Go to Music Page]</a>");
		out.println("</body>");
		out.println("</html>");
		
		}
	
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
	
	}
}