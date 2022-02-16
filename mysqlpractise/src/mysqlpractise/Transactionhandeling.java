package mysqlpractise;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Transactionhandeling {
public static void main(String[] args) throws SQLException {
	Connection conn = null;
	try { conn = MethodConnection.getConnection();
	conn.setAutoCommit(false);
	Statement st = conn.createStatement();
	st.executeUpdate("Insert into marksheet2 values (7,'Esha',80,90,79)");
	st.executeUpdate("delete from marksheet2 where rollno = 7");
	st.executeUpdate("Insert into marksheet2 values (8,'Dhruv',82,90,78)");
conn.commit();
System.out.println("Transaction done");
	} catch (Exception e) {
		conn.rollback();
		System.out.println("Transaction rolled back");
	}
	finally { 
		conn.close();
	}
}
}
