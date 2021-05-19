package chapter27;

import java.sql.*;

/* javauser에서 미리 생성
 //자바에서는 주로 개발자가 작성하므로 DML만 작성하고 DDL은 사용하지 않는다.
create table owner_info(
id int not null primary key, #주민번호, 기본키
nm varchar(50), #이름
hp char(20), #핸드폰번호
gender char(4) #성별	 #영어 4byte, 한글 4글자 지원(charset=euckr때문에?)
) engine=innodb default charset=euckr; #트랜잭션과 한글 지원 
#euckr : 영어 latin1 + 완성형 한글(글자 하나 2byte, 2350자) + 특수기호
#요즘은 utf8 사용 : 영어 + 한글(다국어) : 1~3byte 가변
 */
public class InsertDB {
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
			//String sqlStr = "insert into owner_info(id, nm, hp, gender)"
			//		+" values(2, '아로미', '000-2222-3333', '여') ";
			String sqlStr = "insert into owner_info(id, nm, hp, gender)"
					+" values(4, '아로미', '000-2222-3333', '여자여자') ";
			stmt = con.createStatement(); //해당 DB의 쿼리를 실행할 수 있는 객체
			stmt.executeUpdate(sqlStr); //SQL을 실행하라, 반환형 정수
			
			System.out.println("레코드가 추가되었습니다.");
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
