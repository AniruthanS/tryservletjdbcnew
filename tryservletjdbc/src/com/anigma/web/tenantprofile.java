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

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.welcome.Dbconnection;

@SuppressWarnings("serial")
@WebServlet("/tenantprofileservlet")
public class tenantprofile extends HttpServlet {
     public void service(ServletRequest req, ServletResponse res ) throws IOException, ServletException {
    	
 		// String Company;
 		
 		
 		
 			res.setContentType("text/html");

 	 		
 	 		try{
 	 			
 	 		Class.forName("com.mysql.jdbc.Driver");	
 	 			
 	 		String query = "select * from totaldata";
 	 		
 			
 			Connection con = Dbconnection.getConnection();
 			Statement st = con.createStatement();
 			ResultSet rs = st.executeQuery(query);
 			int i=0;
 			res.getWriter().print("<table width = 75% border=1>");
 			res.getWriter().print("<caption> Tenant details : </caption>");
 			
 			
 			
 			
 			
 			while(rs.next()) {
// 				i=i+1;
 				
 				res.getWriter().print("<tr><td>"+rs.getString(11)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(5)+"</td></tr>");
 				
 				
 				//System.out.println(" ");
 				//System.out.println(" ");
 				
 			}
 			res.getWriter().print("</table>");
 			res.getWriter().print("<a href=\"./tenantoption.html\">Tenant option...</a>");
 					
 			con.close();}
 			catch(Exception e) {
 				res.getWriter().print(e.toString());
 				
 			}
 			//ManagerMenu.Menu();
		
		
// 		req.getRequestDispatcher("manageroption.html").forward(req, res);

 	}
}
