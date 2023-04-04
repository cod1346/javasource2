package register;

public class Member {
	//속성 - 아이디id, 이름name, 주소address, 이메일email, 나이 (나이만 정수, 나머지 스트링) 프리베이트선언
	
	private String id;
	private String name;
	private String address;
	private String email;
	private int age;
	//생성자(모든 속성을 초기화 할 수 있는 상태)
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", age=" + age
				+ "]";
	}
	
	//게터세터메소드
	
	//tostring
}
