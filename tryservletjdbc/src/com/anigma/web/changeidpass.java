package com.anigma.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.welcome.Dbconnection;

@SuppressWarnings("serial")
@WebServlet("/changeservlet")
public class changeidpass extends HttpServlet {
     public void service(ServletRequest req, ServletResponse res ) throws IOException {
    	
 		
 		try{
 			String id;
 	    	String password;
 		res.setContentType("text/html");

 		Class.forName("com.mysql.jdbc.Driver");
 		
		//int id;
 		id = req.getParameter("id");
 		password = req.getParameter("password");
      String query31 = "select * from verify";
		
		Connection con31 = Dbconnection.getConnection();
		Statement st1 = con31.createStatement();
		ResultSet rs1 = st1.executeQuery(query31);
		
		 
		//System.out.println("entered password: "+password);
		while(rs1.next()) {
			//System.out.println("db id: "+rs.getString(2));
			//System.out.println("db password: "+rs.getString(3));
			if(rs1.getString(1).equals("manager") && rs1.getString(2).equals(id) && rs1.getString(3).equals(password)) {
				String query = "delete from verify where designation = 'manager'";

				
		        Connection con = Dbconnection.getConnection();
				Statement st11 = con.createStatement();
				int rows = st11.executeUpdate(query);
				//System.out.println("Number of rows affected: " + rows);	
//				System.out.println("Enter uniqueid");
//				id = input.nextInt();
				// "insert into employee values(5,'varun',300000);"
				String query1 = "insert into verify values (?,?,?);";

				
				Connection con1 = Dbconnection.getConnection();
				
				PreparedStatement pst = con1.prepareStatement(query1);
				String designation = "manager";
				
				id = req.getParameter("nid");
		 		password = req.getParameter("npassword");
				pst.setString(1, designation);
				pst.setString(2, id);
				pst.setString(3, password);
				
				//pst.setInt(5, id);
				int rows1 = pst.executeUpdate();
				
				//System.out.println("Number of rows affected: " + rows1);
				res.getWriter().println("id/password changed");
  				res.getWriter().print("<a href=\"./manageroption.html\">manager main menu</a>");
			break;
			}
			else {
				res.getWriter().println("wrong existing id/password");
  				res.getWriter().print("<a href=\"./manageroption.html\">manager main menu</a>");
			}
		}}
		
				
		//con31.close();
		

		
		catch(Exception e) {
			res.getWriter().println(e.toString());
				res.getWriter().print("<a href=\"./manageroption.html\">manager main menu</a>");
		}
 		
 	}}

