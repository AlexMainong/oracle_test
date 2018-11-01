package prjc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class OracleTest {

	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "system", "123456");
		
		Statement st=con.createStatement();
		
		ResultSet rs1 = st.executeQuery("insert into test_table values (1, TYPE1('3', 'rec', 'rec2'))");
		ResultSet rs=st.executeQuery("select * from test_table");
	
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "); }
        
		rs.close();
		st.close();
		con.close();
	}

}
