package mysqlpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;


public class AccessingDataFromDataBase {

	@Test
	public void DbConnect() throws SQLException{
		//Driver Registration
		
		Driver driveref = new Driver();
		DriverManager.registerDriver(driveref);
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","root");
		
		Statement stat = con.createStatement();
		
		String query="select *from students_info";
		
		ResultSet result = stat.executeQuery(query);
		while(result.next())
		{
			System.out.println("Roll No:"+result.getString("rno")+"\t"+"name:"+result.getString("name"));
		}
	}
}
