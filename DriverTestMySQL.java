package chapter26;
import java.sql.*;

public class DriverTestMySQL {
	public static void main(String[] args) {
		//�ڹٿ� DB�����ϱ�
		Connection con;
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javadb?"
					+ "useUnicode=true&characterEncoding=euckr","javauser","1234");
			System.out.println("�����ͺ��̽� ���� ����");
		} catch (SQLException ex) {
			System.out.println("SQL Exception : ");
		} catch (Exception e) {
			System.out.println("Exception : "+e);
		}
	}

}
