import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Form1 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
	
	resp.setContentType("text/html");
	PrintWriter out = resp.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<form action='Form2' method='post'>");
	out.println("FirstName: <input type=\"text\" name=\"Fname\"> </br></br> ");
	out.println("LastName: <input type=\"text\" name=\"Lname\"> </br></br> ");
	out.println("Submit: <input type=\"submit\">");
	out.println("</form>");
	out.println("</body>");
	out.println("</html>");
	}
	@Override
      protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Fname=req.getParameter("Fname");
		String Lname=req.getParameter("Lname");	
		doPost(req, resp);
	}
}
