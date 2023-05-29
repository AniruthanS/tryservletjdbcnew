package com.anigma.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.welcome.Dbconnection;

@SuppressWarnings("serial")
@WebServlet("/uploadroomsservlet")
public class uploadrooms extends HttpServlet {
     public void service(ServletRequest req, ServletResponse res ) throws IOException, ServletException {
    	
 		// String Company;
 		
 		
 		
 			res.setContentType("text/html");
 			try{
 	 		Class.forName("com.mysql.jdbc.Driver");
 	 		
 				
 				String room;
 			
 			String cotno;
 			String noofcots ;
 			String status;
 			//int id;
 		    
 			 
 			Connection con = Dbconnection.getConnection();
 			
 			
 			room = req.getParameter("room");
 			
 			cotno = req.getParameter("cotno");
 			
 			noofcots =  req.getParameter("noofcots");
 			
 			status = "vacant";
 			
// 			System.out.println("Enter uniqueid");
// 			id = input.nextInt();
 			// "insert into employee values(5,'varun',300000);"
 			String query = "insert into rooms values (?,?,?,?);";

 			
 			
 			
 			PreparedStatement pst = con.prepareStatement(query);
 			pst.setString(1, room);
 			pst.setString(2, cotno);
 			pst.setString(3, noofcots);
 			pst.setString(4, status);
 			//pst.setInt(5, id);
 			int rows = pst.executeUpdate();
 			
 			//System.out.println("Number of rows affected: " + rows);	
 			res.getWriter().println("update successful");
 			res.getWriter().print("<a href=\"./manageroption.html\">manager main menu</a>");
 			
 		    
 			}
 			catch(Exception e) {
 				res.getWriter().print(e.toString());
 			}
 		
		
// 		req.getRequestDispatcher("manageroption.html").forward(req, res);

 	}
}

