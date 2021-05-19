package chapter27;

import java.sql.*;

public class DeleteDB {
	public static void main(String[] args) {
		//DB연동주소와 파라미터
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=euckr";
		Connection con = null; // = null;은 객체가 사용되지 않고 변수 선언만 된 상태다. 
		Statement stmt = null; //지역변수는 초기값을 반드시 가지고 있어야 한다.
		ResultSet rs = null; //미사용 : select문이 없다
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾지 못했습니다.");
			System.out.println(e.getMessage());
		}
		
		try {
			// DB 로그인, 접속권한
			con = DriverManager.getConnection(url,"javauser","1234"); 
			String sqlStr = "delete from owner_info where id=4";
			stmt = con.createStatement(); //해당 DB의 쿼리를 실행할 수 있는 객체
			stmt.executeUpdate(sqlStr); //SQL을 실행하라, 반환형 정수
			
			System.out.println("레코드가 삭제되었습니다.");
		} catch (SQLException e) {
			System.out.println("SQL Exception : "+e.getMessage());
		} finally {
			try { //객체변수 선언 역순으로 DB종료
				stmt.close();
				con.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	} //main
} //class
