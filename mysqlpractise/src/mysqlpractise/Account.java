package mysqlpractise;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Account {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Connection conn= MethodConnection.getConnection();
	Statement st = conn.createStatement();
	
	try {//st.addBatch("Create table Account(Name Varchar(50),Accounttype varchar(50),Balance int)");
	st.addBatch("Insert into Account values ( 'Amish' , 'Saving' , 9000)");
	st.addBatch("Insert into Account values ( 'Amruta' , 'Saving' , 4000)");
	//st.addBatch("Delete from  Account where name = 'Amish' ");
	//st.addBatch("Delete from  Account where name = 'Amruta' ");

	int []i= st.executeBatch();
	System.out.println("Length"+ i.length);
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}
