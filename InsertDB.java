package chapter27;

import java.sql.*;

/* javauser���� �̸� ����
 //�ڹٿ����� �ַ� �����ڰ� �ۼ��ϹǷ� DML�� �ۼ��ϰ� DDL�� ������� �ʴ´�.
create table owner_info(
id int not null primary key, #�ֹι�ȣ, �⺻Ű
nm varchar(50), #�̸�
hp char(20), #�ڵ�����ȣ
gender char(4) #����	 #���� 4byte, �ѱ� 4���� ����(charset=euckr������?)
) engine=innodb default charset=euckr; #Ʈ����ǰ� �ѱ� ���� 
#euckr : ���� latin1 + �ϼ��� �ѱ�(���� �ϳ� 2byte, 2350��) + Ư����ȣ
#������ utf8 ��� : ���� + �ѱ�(�ٱ���) : 1~3byte ����
 */
public class InsertDB {
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
			//String sqlStr = "insert into owner_info(id, nm, hp, gender)"
			//		+" values(2, '�Ʒι�', '000-2222-3333', '��') ";
			String sqlStr = "insert into owner_info(id, nm, hp, gender)"
					+" values(4, '�Ʒι�', '000-2222-3333', '���ڿ���') ";
			stmt = con.createStatement(); //�ش� DB�� ������ ������ �� �ִ� ��ü
			stmt.executeUpdate(sqlStr); //SQL�� �����϶�, ��ȯ�� ����
			
			System.out.println("���ڵ尡 �߰��Ǿ����ϴ�.");
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
