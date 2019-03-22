package p2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/News")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ThirdServlet() 
    {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
          PrintWriter pw=response.getWriter();
          response.setContentType("text/html"); 
          pw.println("<h2><font color=green>SECOND SERVLET</font></h2>"); 
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
