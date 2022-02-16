package mysqlpractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Driverloaded {
public static void main(String[] args)throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("driver loaded");
	String url= "jdbc:mysql://localhost:3306/mysqlpractise";
	String un ="root";
	String pwd="root";
	
		Connection conn = DriverManager.getConnection(url, un, pwd);
	
	System.out.println("connection established");
	Statement st = conn.createStatement();
	String qry = "Create table marksheet2(rollno int primary key,name varchar (20),physics int,chem int,maths int)";
	st.execute(qry);
	conn.close();
	st.close();
	System.out.println("Table created");
}
}
