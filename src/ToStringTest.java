
public class ToStringTest {
	private String name;
	private String address;
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return name+" :: "+address;
	}

	public static void main(String[] args) {
		ToStringTest obj=new ToStringTest();
		obj.setName("jaggi");
		obj.setAddress("34");
		System.out.println(obj);
		
	}

}
