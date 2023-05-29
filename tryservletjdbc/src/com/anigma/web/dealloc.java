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
@WebServlet("/deallocservlet")
public class dealloc extends HttpServlet {
     public void service(ServletRequest req, ServletResponse res ) throws IOException, ServletException {
    	
 		// String Company;
 		
 		
 		try{
 			res.setContentType("text/html");

 	 		Class.forName("com.mysql.jdbc.Driver");
 			String name = req.getParameter("name");
		Connection con = Dbconnection.getConnection();
		Statement st2 = con.createStatement();
		
String query2 = "select * from totaldata where name= '"+name+"'";

          ResultSet rs = st2.executeQuery(query2);
		//Connection con = DriverManager.getConnection(url,userName,passWord);
          String cotno;
          String room;
		rs.next();
			 cotno = rs.getString(10);
			room = rs.getString(11);
			
			//String query1 = "update rooms set status = 'vacant' where cotno = '"+ cotno +"' and room = '"+ room +"'";
		
			
		//System.out.println(cotno);
		//System.out.println(room);
		
		String query1 = "update rooms set status = 'vacant' where cotno = '"+ cotno +"' and room = '"+ room +"'";

		
		//Connection con = DriverManager.getConnection(url,userName,passWord);
		Statement st1 = con.createStatement();
		int rows1 = st1.executeUpdate(query1);

		String query = "delete from totaldata where name =" +"'"+name+"'";

		
		
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		

		
		res.getWriter().print("Tenant details of "+name+" is removed");	
		res.getWriter().print("<a href=\"./manageroption.html\">manager main menu</a>");
		//System.out.println("Number of rows affected: " + rows);		
		con.close();
		
		}
		catch(Exception e) {
			res.getWriter().print(e.toString());
		}
		
		
// 		req.getRequestDispatcher("manageroption.html").forward(req, res);

 	}
}
