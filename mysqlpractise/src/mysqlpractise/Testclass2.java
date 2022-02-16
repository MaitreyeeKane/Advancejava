package mysqlpractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Testclass2 {
public static void main(String[] args) throws ClassNotFoundException,SQLException  {
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver loaded");
	String url = "jdbc:mysql://localhost:3306/mysqlpractise";
	String un ="root";
	String pwd ="root";
	
	Connection conn = DriverManager.getConnection(url, un, pwd);
	Statement st = conn.createStatement();
	ResultSet rs = st.executeQuery("Select * from unit");
	System.out.println("ID/CITY/CAPACITY");
	while (rs.next()) {
		System.out.println("-------------");
		System.out.print(rs.getInt(1) +"/");
		System.out.print(rs.getString(2) +"/");
		System.out.print(rs.getInt(3) +"/");
		System.out.print(rs.getString(4) +"/");
		System.out.println();
	}
conn.close();
st.close();
rs.close();
	
}
}
