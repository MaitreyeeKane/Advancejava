package mysqlpractise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class GetMetaData {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
	Connection conn = MethodConnection.getConnection();
	PreparedStatement pst = conn.prepareStatement("Select * from marksheet2");
	ResultSet rs = pst.executeQuery();
	ResultSetMetaData rsmd = rs.getMetaData();
}
}
