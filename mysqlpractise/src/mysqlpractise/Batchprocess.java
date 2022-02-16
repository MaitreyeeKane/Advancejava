package mysqlpractise;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Batchprocess {
public static void main(String[] args) throws ClassNotFoundException , SQLException {
	Connection conn = MethodConnection.getConnection();
	try {
		Statement st = conn.createStatement();
		st.addBatch("Insert into marksheet2 values (4,'Saheba',90,89,80)");
		st.addBatch("Insert into marksheet2 values (5,'Sagar',99,89,80)");
		st.addBatch("Insert into marksheet2 values (6,'Maitreyee',90,82,90)");
int []i = st.executeBatch();
System.out.println("Length "+ i.length);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
