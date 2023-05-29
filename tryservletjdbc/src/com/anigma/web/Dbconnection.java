package com.anigma.web;

import java.sql.*;
import java.sql.SQLException;

public class Dbconnection {
  private static final String url = "jdbc:mysql://localhost:3306/alldata";
  private static final String userName = "root";
  private static final String passWord = "3090";
  
  public static Connection getConnection() throws SQLException{
	  return DriverManager.getConnection(url,userName,passWord);
  }
}
