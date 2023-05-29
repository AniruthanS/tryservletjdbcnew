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
@WebServlet("/termsservlet")
public class terms extends HttpServlet {
     public void service(ServletRequest req, ServletResponse res ) throws IOException, ServletException {
    	
 		// String Company;
 		
 		
 		
 			res.setContentType("text/html");
 			try{
 	 		Class.forName("com.mysql.jdbc.Driver");
 	 		
 	 		String conditions;
 			//int id;
 			
 			
 	 		 conditions = req.getParameter("myTextarea");
 			
// 			System.out.println("Enter uniqueid");
// 			id = input.nextInt();
 			// "insert into employee values(5,'varun',300000);"
 			String query = "insert into terms values (?);";

 			
 			Connection con = Dbconnection.getConnection();
 			
 			PreparedStatement pst = con.prepareStatement(query);
 			pst.setString(1, conditions);
 			
 			//pst.setInt(5, id);
 			int rows = pst.executeUpdate();
 			res.getWriter().print("terms updated");
 			res.getWriter().print("<a href=\"./manageroption.html\">manager main menu</a>");
 			//System.out.println("Number of rows affected: " + rows);	
 			con.close();}
 			catch(Exception e) {
 				res.getWriter().print(e.toString());
 			}
 			

 	}
}