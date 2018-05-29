

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Form4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("FirstName:" +req.getParameter("Fname"));
		out.println("</br></br>");
		out.println("LastName:" +req.getParameter("Lname"));
		out.println("</br></br>");
		out.println("State:" +req.getParameter("State"));
		out.println("</br></br>");
		out.println("City:" + req.getParameter("City"));
		out.println("</br></br>");
		out.println("Phone:" +req.getParameter("Phone"));
		out.println("</br></br>");
		out.println("Email:" +req.getParameter("Email"));
		out.println("</br></br>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
