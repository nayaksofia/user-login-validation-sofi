package com.sofia;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class UserLogOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UserLogOut() {
        super();
      
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

    
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
				 response.setContentType("text/html"); 
				
				 HttpSession session=request.getSession(false);  
			     session.invalidate();    //Teminate The Session 
				
			   PrintWriter out = response.getWriter(); // Write the response over the web browser.
			   
//               Type-1: Using RequestDispatcher
				 RequestDispatcher rd1 =null;
				 out.println("<html><body>");
				 out.println("Logout Successfully !!!!!!!!!!!!!!!" + "<br> <br>");
				 out.println("</body></html>");
				 rd1 = request.getRequestDispatcher("index.html");
				 rd1.include(request, response);
				 out.close();
				 
//                 Type-2: Using response.sendRedirect()
				 
//                 Redirect to the index page
//                 response.sendRedirect("index.html");				    				    
//				    out.println("<html><body>");
//			        out.println("Logged Out Of Session Successfully............<br>");
//			        out.println("</body></html>");
//					out.close();

		
	}


}
