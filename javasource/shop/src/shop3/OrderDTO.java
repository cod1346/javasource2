package shop3;

import java.sql.Date;

public class OrderDTO {
	private int orderId;
	private int userId;
	private int productId;
	private Date orderDate;
	
	private UserDTO userDTO;
	private ProductDTO productDTO;
	private PayType payType;
	
	
	public PayType getPayType() {
		return payType;
	}
	public void setPayType(PayType payType) {
		this.payType = payType;
	}
	public OrderDTO(int orderId, int userId, int productId, Date orderDate, UserDTO userDTO, ProductDTO productDTO,
			PayType payType) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.productId = productId;
		this.orderDate = orderDate;
		this.userDTO = userDTO;
		this.productDTO = productDTO;
		this.payType = payType;
	}
	public UserDTO getUserDTO() {
		return userDTO;
	}
	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
	public ProductDTO getProductDTO() {
		return productDTO;
	}
	public void setProductDTO(ProductDTO productDTO) {
		this.productDTO = productDTO;
	}
	public OrderDTO(int orderId, int userId, int productId, Date orderDate, UserDTO userDTO, ProductDTO productDTO) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.productId = productId;
		this.orderDate = orderDate;
		this.userDTO = userDTO;
		this.productDTO = productDTO;
	}
	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDTO(int orderId, int userId, int productId, Date orderDate) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.productId = productId;
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "OrderDTO [orderId=" + orderId + ", userId=" + userId + ", productId=" + productId + ", orderDate="
				+ orderDate + ", userDTO=" + userDTO + ", productDTO=" + productDTO + ", payType=" + payType + "]";
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
}
