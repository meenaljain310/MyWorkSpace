

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
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
		ServletContext context=getServletContext();
		String Fname=(String) context.getAttribute("Fname");
		String Lname=(String) context.getAttribute("Lname");
		String State=(String) context.getAttribute("State");
		String City=(String) context.getAttribute("City");
		out.println("<html>");
		out.println("<body>");
		out.println("FirstName:" +Fname);
		out.println("</br></br>");
		out.println("LastName:" +Lname);
		out.println("</br></br>");
		out.println("State:" +State);
		out.println("</br></br>");
		out.println("City:" +City);
		out.println("</br></br>");
		String Phone=req.getParameter("Phone");
		out.println("Phone:" +Phone);
		out.println("</br></br>");
		String Email=req.getParameter("Email");
		out.println("Email:" +Email);
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
