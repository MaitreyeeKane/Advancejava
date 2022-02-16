package mysqlpractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MethodConnection {
public static Connection getConnection() throws ClassNotFoundException, SQLException{ 
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver Loaded");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqlpractise","root","root");
	return conn;
}}

