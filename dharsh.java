package sarathi;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.Scanner;
public class dharsh {
	static String dbUrl="jdbc:mysql://localhost:3306/signup_details";
	static String dbUname="root";
	static String dbPassword="";
	static String dbDriver="com.mysql.cj.jdbc.Driver";
	public void varsh(String name,String email,String phonenumber,String password) {
//		Scanner sc=new Scanner(System.in);
//		String name=sc.next();
//		String pass=sc.next();
		Connection con=null;
		try {
			Class.forName(dbDriver);  //class not found exception
			con = DriverManager.getConnection(dbUrl,dbUname,dbPassword);   //sql Exception
			String sql = "insert into details (name,email,phonenumber,password)"
					+ "values('"+name+"','"+email+"','"+phonenumber+"','"+password+"')";
			Statement s = con.createStatement();
			s.execute(sql);
		   	con.close();
		} catch(Exception e){      
			e.printStackTrace();
		}
	}
}
