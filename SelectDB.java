package chapter27;

import java.sql.*;

public class SelectDB {
	public static void main(String[] args) {
		//DB연동주소와 파라미터
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=euckr";
		Connection con = null; // = null;은 객체가 사용되지 않고 변수 선언만 된 상태다. 
		Statement stmt = null; //지역변수는 초기값을 반드시 가지고 있어야 한다.
		ResultSet rs = null; //사용 : select문이 있다
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾지 못했습니다.");
			System.out.println(e.getMessage());
		}
		
		try {
			// DB 로그인, 접속권한
			con = DriverManager.getConnection(url,"javauser","1234"); 
			String sqlStr = "select id, nm, hp, gender from owner_info";
			stmt = con.createStatement(); //해당 DB의 쿼리를 실행할 수 있는 객체
			rs = stmt.executeQuery(sqlStr); //반환형 ResultSet
			
			while(rs.next()) { //다음 데이터가 있을 때까지
				String id = rs.getString(1); //id, select에 적힌 컬럼의 index 번호
				String name = rs.getString(2); //nm
				String phone = rs.getString("hp"); //컬럼명을 적는 것이 더 좋음
				String gender = rs.getString("gender");
				System.out.println(id+" "+name+" "+phone+" "+gender);
			}
		} catch (SQLException e) {
			System.out.println("SQL Exception : "+e.getMessage());
		} finally {
			try { //객체변수 선언 역순으로 DB종료
				rs.close();
				stmt.close();
				con.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	} //main
} //class
