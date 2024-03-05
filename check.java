package loginservlet;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;

public class check {
	static String dbUrl="jdbc:mysql://localhost:3306/signup_details";
	static String dbUname="root";
	static String dbPassword="";
	static String dbDriver="com.mysql.cj.jdbc.Driver";
	public boolean varsh1(String name,String password) {
//		Scanner sc=new Scanner(System.in);
//		String name=sc.next();
//		String pass=sc.next();
		Connection con=null;
		try {
			//Class.forName(dbDriver);  //class not found exception
			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception
			String sql = "select * from details where name='"+name+"'";
			Statement s = con.createStatement();
			ResultSet rs=s.executeQuery(sql);
			if(rs.next())
			{
				con.close();
				return true;
			}
			else
			{
				return false;
			}
		} catch(Exception e){      
			e.printStackTrace();
		}
		return false;
	}
}
