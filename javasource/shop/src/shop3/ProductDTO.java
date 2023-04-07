package shop3;

public class ProductDTO {
	private int productId;
	private String pname;
	private int price;
	private String content;
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDTO(int productId, String pname, int price, String content) {
		super();
		this.productId = productId;
		this.pname = pname;
		this.price = price;
		this.content = content;
	}
	@Override
	public String toString() {
		return "ProductDTO [productId=" + productId + ", pname=" + pname + ", price=" + price + ", content=" + content
				+ "]";
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
