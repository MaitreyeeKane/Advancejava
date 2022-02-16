package mysqlpractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TestClass3 {
public static void main(String[] args)throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver Loaded");
	String url = "jdbc:mysql://localhost:3306/mysqlpractise";
	String un = "root";
	String pwd ="root";
	Connection conn = DriverManager.getConnection(url, un, pwd);
	System.out.println("Connection established");
	PreparedStatement  m  = conn.prepareStatement("Insert into Marksheet values (?,?,?)");
	m.setInt(1, 45);
	m.setInt(2, 70);
	m.setInt(3, 80);
	int i= m.executeUpdate();
	System.out.println(i);
	conn.close();
	m.close();
	}
}

