package com.anigma.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.welcome.Dbconnection;

@WebServlet("/servlet")
public class tryserveltjdbc extends HttpServlet {
     public void service(ServletRequest req, ServletResponse res ) throws IOException {
    	 try{ 
 			
			 res.setContentType("text/html");
			
	      String id = req.getParameter("id");
	      
	      String password = req.getParameter("password");
	      
	      String query3 = "select * from nooftrial";
	      
	  	
	    Class.forName("com.mysql.jdbc.Driver");
	  	Connection con3 = Dbconnection.getConnection();
	  	Statement st = con3.createStatement();
	  	ResultSet rs = st.executeQuery(query3);
	  	
	  	 
	  	//System.out.println("entered password: "+password);
	  	while(rs.next()) {
	  		//System.out.println("db id: "+rs.getString(2));
	  		//System.out.println("db password: "+rs.getString(3));
	  		
	  		if(rs.getString(1).equals("1")) {
	  			//System.out.println("value just check if: "+rs.getString(1));
	  		String query = "select * from verify";
	  		
	  		Class.forName("com.mysql.jdbc.Driver");
	  		Connection con = Dbconnection.getConnection();
	  		Statement st1 = con.createStatement();
	  		ResultSet rs1 = st1.executeQuery(query);
	  		
	  		while(rs1.next()) {
	  			
	  			//System.out.println("db id: "+rs.getString(2));
	  			//System.out.println("db password: "+rs.getString(3));
	  			if(rs1.getString(1).equals("manager") && rs1.getString(2).equals(id) && rs1.getString(3).equals(password)) {
	  			req.getRequestDispatcher("manageroption.html").forward(req, res);
	  				//res.getWriter().print("Hello Manager");
	  			break;
	  			}
	  			else {
	  				res.getWriter().print("wrong username/password");
	  		
	  			}
	  		}	
	  	}
	  		
	  		
	  	}
	  	}
			
	 	catch(Exception e) {
	 		res.getWriter().print(e.toString());
			
		}
     }
}
