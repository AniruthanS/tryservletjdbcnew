package com.anigma.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.welcome.Dbconnection;

@SuppressWarnings("serial")
@WebServlet("/allocServlet")
public class allocServlet extends HttpServlet {
     public void service(ServletRequest req, ServletResponse res ) throws IOException {
    	 String name;
 		// String Company;
 		String job ;
 		String field;
 		String mobile;
 		String place;
 		String stayperiod;
 		String age;
 		String rent;
 		String advance;
 		String cotno;
 		String room;
 		
 		
 		try{String query = "insert into totaldata values (?,?,?,?,?,?,?,?,?,?,?);";
 		
 		res.setContentType("text/html");

 		Class.forName("com.mysql.jdbc.Driver");
 		Connection con = Dbconnection.getConnection();
 		
 		PreparedStatement pst = con.prepareStatement(query);
 	
 		 name = req.getParameter("name");
 		pst.setString(1, name);
 		
 		 job = req.getParameter("job");
 		pst.setString(2, job);
 		
 		 field = req.getParameter("field");
 		pst.setString(3, field);
 		
 		 mobile = req.getParameter("mobile");
 		pst.setString(4, mobile);
 		
 		 place = req.getParameter("place");
 		pst.setString(5, place);
 		
 		stayperiod = req.getParameter("stayperiod");
 		pst.setString(6, stayperiod);
 		
 		 age = req.getParameter("age");
 		pst.setString(7, age);
 		
 		 rent = req.getParameter("rent");
 		pst.setString(8, rent);
 		
 		 advance = req.getParameter("advance");
 		pst.setString(9, advance);
 		
 		 cotno = req.getParameter("cotno");
 		pst.setString(10, cotno);
 		
 		 room = req.getParameter("room");
 		pst.setString(11, room);
 		
 		
 		
 String query1 = "select * from rooms";
 Class.forName("com.mysql.jdbc.Driver");
 		Connection con1 = Dbconnection.getConnection();
 		Statement st = con1.createStatement();
 		ResultSet rs = st.executeQuery(query1);
 	   int i=0;
 		while(rs.next()) {
 			
 			if(rs.getString(1).equals(room) && rs.getString(2).equals(cotno) && rs.getString(4).equals("vacant")) {
 				int rows = pst.executeUpdate();
 				res.getWriter().print("Uploaded details are");
 				res.getWriter().print("name- "+name+", job- "+job+", field- "+field+
 						", mobile- "+mobile+", place- "+place+", stayperiod- "+stayperiod+
 						", age- "+age+", rent- "+rent+
 						", advance- "+advance+", cotno- "+cotno+", room- "+room);
 				
 				res.getWriter().print("<a href=\"./manageroption.html\">Manager main menu</a>");
 				
 				i=1;
 			
 				con.close();

 				String query31 = "update rooms set status = 'filled' where room = "+"'"+room+"'"+" and cotno = "+"'"+cotno+"'";

 				Class.forName("com.mysql.jdbc.Driver");
 				Connection con31 = Dbconnection.getConnection();
 				Statement st3 = con31.createStatement();
 				int rows1 = st3.executeUpdate(query31);
 				//System.out.println("Number of rows affected: " + rows1);
 				
 				
 			}}
 			if(i==0)
 			{

 				res.getWriter().print("Room/cot no not available in hostel...make sure concerned roomno/cotno is available before giving it");
 				res.getWriter().print("<a href=\"./manageroption.html\">manager main menu</a>");
 			
 			}
 			
 		
 				
 		con1.close();

 		
 		}
 		catch(Exception e) {
 			res.getWriter().print("multiple cots can't be allocated for same person");
 			
 		}
       	

 	}
}
