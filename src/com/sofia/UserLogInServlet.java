package com.sofia;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserLogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");	
		PrintWriter out = response.getWriter();
		//Get a reference to the Session
		 HttpSession theSession = request.getSession();	
		
		String userName = request.getParameter("userName");
		String userPass = request.getParameter("userPass");
		
		
		if(userName.equalsIgnoreCase("Sofia") && userPass.equals("sf43")) {
			
			//Put the UserName into the session	
			theSession.setAttribute("uName", userName);
			
		  // Redirect to the Dashboard
		   response.sendRedirect("dashboard");
			
			
		}else {
			

//			 Type-1: Using RequestDispatcher
			 RequestDispatcher rd =null;
			 out.println("Sorry, Invalid Username or Password  :(" + "<br> <br>");
			 rd = request.getRequestDispatcher("index.html");
			 rd.include(request, response);
			
			
//			 Type-2: Using response.sendRedirect("index.html");
//			 Redirect back to the index page
//			 response.sendRedirect("index.html");
//			 out.println("<span> Invallid UserId And Password</span>");
			
		
			
	  }
		 out.close();  
		
	}
	

}

