package chapter27;

import java.sql.*;

public class DeleteDB {
	public static void main(String[] args) {
		//DB�����ּҿ� �Ķ����
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=euckr";
		Connection con = null; // = null;�� ��ü�� ������ �ʰ� ���� ���� �� ���´�. 
		Statement stmt = null; //���������� �ʱⰪ�� �ݵ�� ������ �־�� �Ѵ�.
		ResultSet rs = null; //�̻�� : select���� ����
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹��� ã�� ���߽��ϴ�.");
			System.out.println(e.getMessage());
		}
		
		try {
			// DB �α���, ���ӱ���
			con = DriverManager.getConnection(url,"javauser","1234"); 
			String sqlStr = "delete from owner_info where id=4";
			stmt = con.createStatement(); //�ش� DB�� ������ ������ �� �ִ� ��ü
			stmt.executeUpdate(sqlStr); //SQL�� �����϶�, ��ȯ�� ����
			
			System.out.println("���ڵ尡 �����Ǿ����ϴ�.");
		} catch (SQLException e) {
			System.out.println("SQL Exception : "+e.getMessage());
		} finally {
			try { //��ü���� ���� �������� DB����
				stmt.close();
				con.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	} //main
} //class
