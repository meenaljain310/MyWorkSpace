

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page3
 */
public class Form3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		PrintWriter out=response.getWriter();
		Cookie c[]=request.getCookies();
		String State=request.getParameter("state");
		String City=request.getParameter("city");
		Cookie c3 = new Cookie("state",State);
		Cookie c4 = new Cookie("city",City);
		response.addCookie(c3);
		response.addCookie(c4);
		out.println("<html><body><h2>");
		out.println("<form action=\"Form4\" method=\"POST\">");
		out.println("Firstname: " +c[1].getValue() + "<br>");
		out.println("Lastname: " +c[2].getValue() + "<br>"); 
		out.println("State: " +State + "<br>"); 
		out.println("City: " +City + "<br>"); 
		out.println("Phone <input name=\"phone\" type=\"text\"><br>");
		out.println("Gmail <input name=\"gmail\" type=\"text\"><br>");
		out.println("<input type=\"Submit\" value=\"Submit\">");
		out.println("</form></h2></body></html>"); 
	}

}
