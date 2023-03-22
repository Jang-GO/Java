package data_io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_ConnectionExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			//JDBC 드라이버 등록
			Class.forName("com.mysql.cj.jdbc.Driver"); //Class.forName() : 문자열로 주어진 JDBC 드라이버 클래스를 빌드패스에서 찾고, 메모리로 로딩
			
			//연결하기
			conn = DriverManager.getConnection(               // 매개변수 연결문자열, 사용자, 비밀번호
				"jdbc:mysql://localhost:3306/thisisjava",
				"java",
				"mysql"
			);
			
			System.out.println("연결 성공");
		}catch(ClassNotFoundException e) {e.printStackTrace();}
		catch(SQLException e) {e.printStackTrace();}
		finally {
			if(conn!=null) {
				try {
					conn.close();
					System.out.println("연결 끊기");
				} catch(SQLException e ) {}
			}
		}
	}
}
