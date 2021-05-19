package chapter26;
import java.sql.*;

public class DriverTestMySQL {
	public static void main(String[] args) {
		//자바와 DB연결하기
		Connection con;
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javadb?"
					+ "useUnicode=true&characterEncoding=euckr","javauser","1234");
			System.out.println("데이터베이스 접속 성공");
		} catch (SQLException ex) {
			System.out.println("SQL Exception : ");
		} catch (Exception e) {
			System.out.println("Exception : "+e);
		}
	}

}
