package chapter27;

import java.sql.*;

public class PpSm_DB {  //PpSm : PreparedStatement
	public static void main(String[] args) {
		//DB연동주소와 파라미터
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=euckr";
		Connection con = null; // = null;은 객체가 사용되지 않고 변수 선언만 된 상태다. 
		PreparedStatement pstmt = null; //지역변수는 초기값을 반드시 가지고 있어야 한다.
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
			String sqlStr = "select * from owner_info where id >= ?";
			pstmt = con.prepareStatement(sqlStr);  //인스턴스 생성 시 SQL 실행
			pstmt.setInt(1, 1);// ?에 데이터 넣기, set데이터형(index, value), index는 ?의 순서
			//pstmt.setString(1, "홍길동");
			rs = pstmt.executeQuery(); //반환형 ResultSet
			
			while(rs.next()) { //다음 데이터가 있을 때까지, 뷰로직
				System.out.print("번호: "+rs.getString("id")+"\t");
				System.out.print("성명: "+rs.getString("nm")+"  ");
				System.out.print("핸드폰 번호: "+rs.getString("hp")+"  ");
				System.out.println("성별: "+rs.getString("gender"));
			}
		} catch (SQLException e) {
			System.out.println("SQL Exception : "+e.getMessage());
		} finally {
			try { //객체변수 선언 역순으로 DB종료
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	} //main
} //class
