package shop3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static shop3.JdbcUtil.*;

public class UserDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	static{
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	//회원가입
	public boolean insert(int userId,String name,int payNo) {
		boolean status = false;
		
		try {
			
			con = getConnection();
			
			String sql = "insert into suser(user_id,name,pay_no) values (?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userId);
			pstmt.setString(2, name);
			pstmt.setInt(3, payNo);
			
			int result = pstmt.executeUpdate();
			
			if (result>0) status = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return status;
	}
	
	
	public List<UserDTO> getList(){
		List<UserDTO>list = new ArrayList<>();
		
		try {
			con = getConnection();
			
			String sql = "select user_id,name,p.pay_no,info "
						+ "from suser s,paytype p "
						+ "where s.pay_no = p.pay_no";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				UserDTO dto = new UserDTO(rs.getInt(1),rs.getString(2), rs.getInt(3),rs.getString(4));
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}
}
