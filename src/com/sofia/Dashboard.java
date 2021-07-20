package com.sofia;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Dashboard() {
        super();
       
    }
    
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//		       Set the contentType 
				response.setContentType("text/html");
				
//				Get a reference to the session object
				HttpSession theSession = request.getSession(false);
				
				PrintWriter out = response.getWriter();
				out.println("Welcome " + theSession.getAttribute("uName") +"!!!!! :)" +"<br><br>");
				
				out.println("<a href='inv'>" + "Click Here For LogOut" + "</a>");
	}

}
