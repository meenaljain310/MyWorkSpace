

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Form2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		HttpSession session= req.getSession(true);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<form action='Form3' method='post'>");
		String Fname= req.getParameter("Fname");
		out.println("FirstName:" +Fname);
		out.println("</br></br>");
		String Lname= req.getParameter("Lname");
		out.println("LastName:" +Lname);
		out.println("</br></br>");
		out.println("State: <input type=\"text\" name=\"State\"> </br></br> ");
		out.println("City: <input type=\"text\" name=\"City\"> </br></br> ");
		session.setAttribute("Fname",Fname);
		session.setAttribute("Lname",Lname);
		out.println("Submit: <input type=\"submit\">");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String State=req.getParameter("State");
			String City=req.getParameter("City");	
			doGet(req, resp);
		}

}
