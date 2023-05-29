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
@WebServlet("/searchservlet")
public class search extends HttpServlet {
     public void service(ServletRequest req, ServletResponse res ) throws IOException, ServletException {
    	
 		// String Company;
 		
 		
 		
 			res.setContentType("text/html");
 			try{
 	 		Class.forName("com.mysql.jdbc.Driver");
 	 		
 	 		String keyword;
 	 		keyword = req.getParameter("keyword");
 	 		//String query = "select * from totaldata where name="+"'"+keyword+"'";
 	 		String query = "select * from totaldata";
 	 		Connection con = Dbconnection.getConnection();
 	 		Statement st = con.createStatement();
 	 		ResultSet rs = st.executeQuery(query);
 	 		res.getWriter().print("<table width = 75% border=1>");
 			res.getWriter().print("<caption> Tenant details : </caption>");
 			java.sql.ResultSetMetaData rsmd = rs.getMetaData();
 			int col = rsmd.getColumnCount();
 			res.getWriter().print("<tr>");
 			
 			for(int i1=1;i1<=col;i1++) {
 				res.getWriter().print("<th>"+rsmd.getColumnName(i1)+"</th>");
 			}
 			
 			res.getWriter().print("</tr>");
 	 		int i=0;
 	 		while(rs.next()) {
 	 			if(rs.getString(1).equals(keyword) || rs.getString(2).equals(keyword) || rs.getString(3).equals(keyword) 
 	 			|| rs.getString(5).equals(keyword) || rs.getString(10).equals(keyword) || rs.getString(11).equals(keyword) 
 	 			|| rs.getString(4).equals(keyword) || rs.getString(6).equals(keyword) || rs.getString(7).equals(keyword)
 	 			|| rs.getString(8).equals(keyword) || rs.getString(9).equals(keyword)) {
 	 				res.getWriter().print("All details regarding"+keyword+" is ");
 				res.getWriter().print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td><td>"+rs.getString(7)+"</td><td>"+rs.getString(8)+"</td><td>"+rs.getString(9)+"</td><td>"+rs.getString(10)+"</td><td>"+rs.getString(11)+"</td></tr>");

 	 			i=1;
// 	 			break;
 	 			}}
 	 		
 	 		if(i==0) {
 	 			res.getWriter().print("no related details related to entered keyword");
 				res.getWriter().print("<tr><td>"+"-"+"</td><td>"+"-"+"</td><td>"+"-"+"</td><td>"+"-"+"</td><td>"+"-"+"</td><td>"+"-"+"</td><td>"+"-"+"</td><td>"+"-"+"</td><td>"+"-"+"</td><td>"+"-"+"</td><td>"+"-"+"</td></tr>");

 	 			res.getWriter().print("<a href=\"./manageroption.html\">manager main menu</a>");
 	 		}
 	 		res.getWriter().print("</table>");
 	 		con.close();
 	 		}
 	 		catch(Exception e) {
 	 			res.getWriter().print(e.toString());
 	 		}
 			

 	}
}
