package mysqlpractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Testclass4 {
private static PreparedStatement PreparedStatement;
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	add_Marksheet();
}
public static void add_Marksheet() throws ClassNotFoundException,SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver Loaded");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqlpractise","root","root");
	PreparedStatement pst = conn.prepareStatement("Insert Into Marksheet Values (?,?,?)");
pst.setInt(1, 50);
pst.setInt(2, 40);
pst.setInt(3,60);
int i = pst.executeUpdate();
System.out.println("Rows affected " + i);
conn.close();
pst.close();

}
}
