package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarraigeServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		
		PrintWriter pw=null;
		String name=null,page=null;
		int age=0;
		String gender=null;			
		pw=res.getWriter();
		res.setContentType("text/html");
		
		name=req.getParameter("name");
		page=req.getParameter("age");
		age=Integer.parseInt(page);
		gender=req.getParameter("gender");
		
		//Write request processing logics
		
		if(gender.equalsIgnoreCase("male")) {
			
	if(age>=21) {
		pw.println("<h1 style='color:green'><center> Mr. " +  name + " You are Eligibile for Marraige</center></h1>");
	}
	else {
		pw.println("<h1 style='color:red'><center> Mr. " + name + " You are not Eligibile for Marraige</center></h1>");
	}
		}
    else  {
		
		if(age>=18) {
			pw.println("<h1 style='color:green'> Miss. " +name+ " You are Eligibile for Marraige</h1>");
		}
		else {
			pw.println("<h1 style='color:red'> Miss. " +name+ " You are not Eligibile for Marraige</h1>");
		}
	
    }
	
	
		
	
//Add Hyperlink
	
	pw.println("<a href='page.html'>home</a>");
	
	pw.close();
	
  
}//metdhod
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		doGet(req,res);
	}
	}//class

	
	
