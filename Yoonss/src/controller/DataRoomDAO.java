package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

public class DataRoomDAO {
	//멤버변수
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	//톰캣이 많들어 놓은 커넥션을 커넥션 풀에서 가져다 쓰기]
	public DataRoomDAO(ServletContext context) {
		
		Context ctx;
		try {
			ctx = new InitialContext();
			DataSource source = (DataSource)ctx.lookup(context.getInitParameter("JNDI_ROOT")+"/jdbc/jsp");
			conn = source.getConnection();
		} catch (NamingException | SQLException e) {e.printStackTrace();}
		 
	}///////////생성자
	//자원반납용]
	public void close() {
		try {
			if (rs != null)	rs.close();
			if (psmt != null) psmt.close();
			if (conn !=null) conn.close();
		} catch (SQLException e) {e.printStackTrace();}
		
	}////////close
	public int insert(DataRoomDTO dto) {
		String sql = "INSERT INTO member1 values(?,?,?,?,?)";
		int result =-1;
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPwd());
			psmt.setString(3, dto.getName());
			psmt.setString(4, dto.getTel());
			psmt.setString(5, dto.getEmail());
			 result = psmt.executeUpdate();
			close();
		} catch (SQLException e) {e.printStackTrace();}
		
		return result;
	}

}//////////DataRoomDAO
