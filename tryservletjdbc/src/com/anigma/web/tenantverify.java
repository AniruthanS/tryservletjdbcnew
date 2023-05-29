package com.anigma.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.mysql.cj.jdbc.CallableStatement;
import com.welcome.Dbconnection;

@WebServlet("/tenantverifyservlet")
public class tenantverify extends HttpServlet {
     public void service(ServletRequest req, ServletResponse res ) throws IOException {
    	 try{ 
 			
			 res.setContentType("text/html");
				
	    Class.forName("com.mysql.jdbc.Driver");
	   
		String id = req.getParameter("tenant");
		
		String password = req.getParameter("cotno");
		String query = "select * from totaldata where name= '"+id+"' and cotno='"+password+"'";
//			
			Connection con = Dbconnection.getConnection();
			Statement st1 = con.createStatement();
			ResultSet rs1 = st1.executeQuery(query);
			
			 
			//System.out.println("entered id: "+id);
			
			//System.out.println("entered password: "+password);
			if(rs1.next()) {
				//System.out.println("db id: "+rs.getString(2));
				//System.out.println("db password: "+rs.getString(3));
				System.out.println("'welcome "+rs1.getString(1)+"'");
				CallableStatement cst = (CallableStatement) con.prepareCall("{call trunctenantverify()}");
				ResultSet rs = cst.executeQuery();
				String query1 = "insert into tenantverify values ('"+id+"','"+password+"')";
				Statement st = con.createStatement();
				int rows = st.executeUpdate(query1);
				req.getRequestDispatcher("tenantoption.html").forward(req, res);

				
			}
				else {
					System.out.println("wrong name or cotno");
					res.getWriter().print("<a href=\"./tenantverify.html\">back to signin</a>");

				}
	}
	catch(Exception e) {
		System.out.println(e.toString());
		res.getWriter().print("<a href=\"./tenantverify.html\">back to signin</a>");
	}
     }
}


