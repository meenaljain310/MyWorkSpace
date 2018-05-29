

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
		String FirstName = req.getParameter("Fname");
		out.println("<input type=\"hidden\" name=\"Fname\" value=\"FirstName\">");
		out.println("</br></br>");
		String LastName = req.getParameter("Lname");
		out.println("<input type=\"hidden\" name=\"Lname\" value=\"LastName\">");
		out.println("</br></br>");
		String State = req.getParameter("State");
		out.println("<input type=\"hidden\" name=\"State\" value=\"StateName\">");
		out.println("</br></br>");
		String City = req.getParameter("City");
		out.println("<input type=\"hidden\" name=\"City\" value=\"CityName\">");
		out.println("</br></br>");
		String Phone = req.getParameter("Phone");
		out.println("<input type=\"hidden\" name=\"Phone\" value=\"Phone\">");
		out.println("</br></br>");
		String Email = req.getParameter("Email");
		out.println("<input type=\"hidden\" name=\"Email\" value=\"Email\">");
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
