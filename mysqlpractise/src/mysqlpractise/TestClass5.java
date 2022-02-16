package mysqlpractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestClass5 {
public static void main(String[] args) throws ClassNotFoundException, SQLException  {
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver loaded");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqlpractise","root","root");
	PreparedStatement pst = conn.prepareStatement("Select * from marksheet2 where rollno = ?");
	System.out.println("Enter rollno to display marksheet");
	Scanner sc = new Scanner (System.in);
	int rn = sc.nextInt();
	pst.setInt(1, rn);
	ResultSet rs = pst.executeQuery();
	if (rs.next()) {
		System.out.println("Roll no: " + rs.getInt("rollno"));
		System.out.println("Name: "+ rs.getString("name"));
	} else {System.out.println("Marksheet not found");

	} 
}

}
