package chapter27;

import java.sql.*;

public class PpSm_InsertDB { //PpSm : PreparedStatement
	public static void main(String[] args) {
		//DB�����ּҿ� �Ķ����
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=euckr";
		Connection con = null; // = null;�� ��ü�� ������ �ʰ� ���� ���� �� ���´�. 
		PreparedStatement pstmt = null; //���������� �ʱⰪ�� �ݵ�� ������ �־�� �Ѵ�.
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹��� ã�� ���߽��ϴ�.");
			System.out.println(e.getMessage());
		}
		
		try {
			// DB �α���, ���ӱ���
			con = DriverManager.getConnection(url,"javauser","1234"); 
			String sqlStr = "insert into owner_info(id, nm, hp, gender)"
					+" values(?, ?, ?, ?) ";
			
			pstmt = con.prepareStatement(sqlStr); //�ν��Ͻ� ���� �� SQL ����
			pstmt.setInt(1, 1); //?�� ������ ����ֱ�, index�� ?�� ������� �Էµȴ� 
			pstmt.setString(2, "ȫ�浿");  //set��������(index, value)
			pstmt.setString(3, "111-2222-3333");
			pstmt.setString(4, "��");
			pstmt.executeUpdate(); //SQL�� �����϶�, ��ȯ�� ����
			
			System.out.println("���ڵ尡 �߰��Ǿ����ϴ�.");
		} catch (SQLException e) {
			System.out.println("SQL Exception : "+e.getMessage());
		} finally {
			try { //��ü���� ���� �������� DB����
				pstmt.close();
				con.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	} //main
} //class
