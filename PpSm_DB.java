package chapter27;

import java.sql.*;

public class PpSm_DB {  //PpSm : PreparedStatement
	public static void main(String[] args) {
		//DB�����ּҿ� �Ķ����
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=euckr";
		Connection con = null; // = null;�� ��ü�� ������ �ʰ� ���� ���� �� ���´�. 
		PreparedStatement pstmt = null; //���������� �ʱⰪ�� �ݵ�� ������ �־�� �Ѵ�.
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
			String sqlStr = "select * from owner_info where id >= ?";
			pstmt = con.prepareStatement(sqlStr);  //�ν��Ͻ� ���� �� SQL ����
			pstmt.setInt(1, 1);// ?�� ������ �ֱ�, set��������(index, value), index�� ?�� ����
			//pstmt.setString(1, "ȫ�浿");
			rs = pstmt.executeQuery(); //��ȯ�� ResultSet
			
			while(rs.next()) { //���� �����Ͱ� ���� ������, �����
				System.out.print("��ȣ: "+rs.getString("id")+"\t");
				System.out.print("����: "+rs.getString("nm")+"  ");
				System.out.print("�ڵ��� ��ȣ: "+rs.getString("hp")+"  ");
				System.out.println("����: "+rs.getString("gender"));
			}
		} catch (SQLException e) {
			System.out.println("SQL Exception : "+e.getMessage());
		} finally {
			try { //��ü���� ���� �������� DB����
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	} //main
} //class
