package chapter27;

import java.sql.*;

public class PpSm_InsertDB { //PpSm : PreparedStatement
	public static void main(String[] args) {
		//DB연동주소와 파라미터
		String url = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=euckr";
		Connection con = null; // = null;은 객체가 사용되지 않고 변수 선언만 된 상태다. 
		PreparedStatement pstmt = null; //지역변수는 초기값을 반드시 가지고 있어야 한다.
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾지 못했습니다.");
			System.out.println(e.getMessage());
		}
		
		try {
			// DB 로그인, 접속권한
			con = DriverManager.getConnection(url,"javauser","1234"); 
			String sqlStr = "insert into owner_info(id, nm, hp, gender)"
					+" values(?, ?, ?, ?) ";
			
			pstmt = con.prepareStatement(sqlStr); //인스턴스 생성 시 SQL 실행
			pstmt.setInt(1, 1); //?에 데이터 집어넣기, index는 ?의 순서대로 입력된다 
			pstmt.setString(2, "홍길동");  //set데이터형(index, value)
			pstmt.setString(3, "111-2222-3333");
			pstmt.setString(4, "남");
			pstmt.executeUpdate(); //SQL을 실행하라, 반환형 정수
			
			System.out.println("레코드가 추가되었습니다.");
		} catch (SQLException e) {
			System.out.println("SQL Exception : "+e.getMessage());
		} finally {
			try { //객체변수 선언 역순으로 DB종료
				pstmt.close();
				con.close();
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	} //main
} //class
