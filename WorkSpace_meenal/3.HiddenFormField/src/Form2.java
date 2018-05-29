

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Form2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<form action='Form3' method='post'>");
		String FirstName = req.getParameter("Fname");
		out.println("<input type=\"hidden\" name=\"Fname\" value=\"FirstName\">");
		out.println("</br></br>");
		String LastName = req.getParameter("Lname");
		out.println("<input type=\"hidden\" name=\"Lname\" value=\"LastName\">");
		out.println("</br></br>");
		out.println("State: <input type=\"text\" name=\"State\"> </br></br> ");
		out.println("City: <input type=\"text\" name=\"City\"> </br></br> ");
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
