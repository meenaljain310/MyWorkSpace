

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Form3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		HttpSession session= req.getSession(true);
		String Fname=(String) session.getAttribute("Fname");
		String Lname=(String) session.getAttribute("Lname");
		out.println("<html>");
		out.println("<body>");
		out.println("<form action='Form4' method='post'>");
		out.println("FirstName:" +Fname);
		out.println("</br></br>");
		out.println("LastName:" +req.getParameter("Lname"));
		out.println("</br></br>");
		String State = req.getParameter("State");
		out.println("State:" +State);
		out.println("</br></br>");
		String City= req.getParameter("City");
		out.println("City:" +City);
		out.println("</br></br>");
		out.println("Phone: <input type=\"integer\" name=\"Phone\"> </br></br> ");
		out.println("Email-ID: <input type=\"text\" name=\"Email\"> </br></br> ");

		session.setAttribute("City",City);
		session.setAttribute("State",State);
		out.println("Submit: <input type=\"submit\">");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Phone=req.getParameter("Phone");
		String Email=req.getParameter("Email");	
		doGet(req, resp);
	}

}
