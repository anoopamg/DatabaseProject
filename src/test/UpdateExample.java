package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","root");
		Statement stmt = con.createStatement();
		stmt.executeUpdate("UPDATE eproduct SET PRICE = 63000, NAME = 'OLED' WHERE ID = 5");
		ResultSet result = stmt.executeQuery("select * from eproduct");
		
		System.out.println("Products in the table are : ");
		while (result.next()) {
			System.out.println(result.getInt("ID"));
			System.out.println(result.getString("NAME"));
			System.out.println(result.getDouble("PRICE"));
		}

	}

}
