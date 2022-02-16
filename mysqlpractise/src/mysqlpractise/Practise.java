package mysqlpractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Practise {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver loaded");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqlpractise","root","root");
	System.out.println("Got connection");
	Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery("Select name,age from person");
	while(rs.next()) {
		String name = rs.getString("name");
		int age = rs.getInt("age");
		System.out.println(name + ","+ age);
	}
	stmt.close();
	conn.close();
}
}
