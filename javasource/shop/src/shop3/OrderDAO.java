package shop3;

import static shop3.JdbcUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	
	//C(insert)R(select)U(update)D(delete) 메소드 작성
	
	public boolean insert(int userId,int productId) {
		boolean status = false;
		
		try {
			con = getConnection();
			
			String sql = "insert into sorder values(order_seq.nextval,?,?,sysdate)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userId);
			pstmt.setInt(2, productId);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) status = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return status;
	}
	
	//장바구니 = sorder 
	
	//sorder 조회 메소드
	public List<OrderDTO> carts(int userId){
		List<OrderDTO> list = new ArrayList<>();
		
		try {
			con = getConnection();
			
			String sql ="select su.user_id,su.name,pa.info,pr.product_id,pname"
					+ ",price,content,order_date "
					+ "from sorder so,suser su,paytype pa,product pr "
					+ "where so.user_id = su.user_id and su.pay_no=pa.pay_no and so.product_id=pr.product_id AND su.user_id =?" ;
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				UserDTO userDTO = new UserDTO();
				userDTO.setUserId(rs.getInt(1));
				userDTO.setName(rs.getString(2));
				userDTO.setType(rs.getString(3));
				
				ProductDTO productDTO = new ProductDTO();
				productDTO.setProductId(rs.getInt(4));
				productDTO.setPname(rs.getString(5));
				productDTO.setPrice(rs.getInt(6));
				productDTO.setContent(rs.getString(7));
				
				OrderDTO orderDTO = new OrderDTO();
				orderDTO.setUserDTO(userDTO);
				orderDTO.setProductDTO(productDTO);
				orderDTO.setOrderDate(rs.getDate(8));
				
				list.add(orderDTO);			
				}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return list;
	}
}
