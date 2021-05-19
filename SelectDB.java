package chapter27;

import java.sql.*;

public class SelectDB {
	public static void main(String[] args) {
		//DB�����ּҿ� �Ķ����
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=euckr";
		Connection con = null; // = null;�� ��ü�� ������ �ʰ� ���� ���� �� ���´�. 
		Statement stmt = null; //���������� �ʱⰪ�� �ݵ�� ������ �־�� �Ѵ�.
		ResultSet rs = null; //��� : select���� �ִ�
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹��� ã�� ���߽��ϴ�.");
			System.out.println(e.getMessage());
		}
		
		try {
			// DB �α���, ���ӱ���
			con = DriverManager.getConnection(url,"javauser","1234"); 
			String sqlStr = "select id, nm, hp, gender from owner_info";
			stmt = con.createStatement(); //�ش� DB�� ������ ������ �� �ִ� ��ü
			rs = stmt.executeQuery(sqlStr); //��ȯ�� ResultSet
			
			while(rs.next()) { //���� �����Ͱ� ���� ������
				String id = rs.getString(1); //id, select�� ���� �÷��� index ��ȣ
				String name = rs.getString(2); //nm
				String phone = rs.getString("hp"); //�÷����� ���� ���� �� ����
				String gender = rs.getString("gender");
				System.out.println(id+" "+name+" "+phone+" "+gender);
			}
		} catch (SQLException e) {
			System.out.println("SQL Exception : "+e.getMessage());
		} finally {
			try { //��ü���� ���� �������� DB����
				rs.close();
				stmt.close();
				con.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	} //main
} //class
