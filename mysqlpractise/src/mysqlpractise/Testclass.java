package mysqlpractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Testclass {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver loaded");
	String url ="jdbc:mysql://localhost:3306/mysqlpractise";
	String un ="root";
	String pwd="root";
	Connection conn = DriverManager.getConnection(url, un, pwd);
	Statement st = conn.createStatement();
	int row = st.executeUpdate("Insert into marksheet2 values ('3','Amish','89','78','90')");
	System.out.println(row +"Rows affected");
	conn.close();
	st.close();
}
}
