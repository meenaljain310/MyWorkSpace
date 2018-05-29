

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Page4
 */
public class Form4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		doGet(request, response);
		PrintWriter out=response.getWriter();
		Cookie c[]=request.getCookies();
		String Phone=request.getParameter("phone");
		String Gmail=request.getParameter("gmail");
		out.println("<html><body><h2>");
		out.println("Firstname: " +c[1].getValue() + "<br>");
		out.println("Lastname: " +c[2].getValue() + "<br>"); 
		out.println("State: " +c[3].getValue() + "<br>"); 
		out.println("City: " +c[4].getValue() + "<br>"); 
		out.println("Phone: " +Phone + "<br>"); 
		out.println("Gmail: " +Gmail + "<br>"); 
		
		out.println("</form></h2></body></html>"); 
	}

	}
