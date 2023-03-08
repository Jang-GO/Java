package data_io;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_ConnectionExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			//JDBC 드라이버 등록
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//연결하기
			conn = DriverManager.getConnection(
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
