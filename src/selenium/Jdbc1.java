package selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1 {

	public static void main(String[] args) throws SQLException {

		String url = "jdbc:mysql://localhost:3306/Automation";
		String usn = "root";
		String psw = "root";
		Connection connet = DriverManager.getConnection(url, usn, psw);
		Statement stmt = connet.createStatement();
		 ResultSet res = stmt.executeQuery("select * from credentials");
		int j=0;
		while (res.next()) {
			String usn1 = res.getString("usn");
			String pwd1 = res.getString("pwd");
			System.out.println(usn1+"  "+pwd1);
			j++;
			if(j==2) {
				break;
			}
			
		}

	}
}