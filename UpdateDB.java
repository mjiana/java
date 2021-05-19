package chapter27;

import java.sql.*;

public class UpdateDB {
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
			String sqlStr = "update owner_info " 
			+"set hp='010-1234-1234' where id=1";
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
