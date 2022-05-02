package com.swati.j2ee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.swati.springmvc.service.UserValidationService;

//This Servlet is just present to see the comparison between a servlet and a spring mvc application

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet{
	
	private UserValidationService validation = new  UserValidationService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		/*PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Yahoo!!!!!!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("My First Servlet");
		out.println("</body>");
		out.println("</html>");
		*/
		
		//System.out.println(request.getParameter("name")); //sysout will print it in console
		
		String name = request.getParameter("name");
		request.setAttribute("name", name);	//request.setAttribute for sending it to the jsp
				
		String password = request.getParameter("password");
		request.setAttribute("password", password);
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		boolean isValid = validation.isValidUser(request.getParameter("name"), request.getParameter("password"));
		if(isValid) {
			request.setAttribute("name", request.getParameter("name"));
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		}
		else {
			request.setAttribute("errorMessage", "Invalid Credentials!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	}

}

/*
 * (Request) http://localhost:8080/ -> WEB SERVER -> html response as above (RESPONSE)
 * 
 * Browser sends HTTP Request to Web Server
 * Code in Web Server => Input : HttpRequest, Output : HttpResponse
 * Web Server responds with Http Response
 * 
 * 
 * Parameter - is passed between browser and web app server, from browser the parameter comes in to the servlet 
 * The servlet takes the parameter and puts it as an attribute into the request so that the jsp can see it.
 */
