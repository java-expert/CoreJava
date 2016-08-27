
public class ThisTest {
	
	ThisTest(int a){
		//System.out.println("ss");
		this();
		System.out.println("parametrized constructor");
		this.disp();
		
	}

	public ThisTest() {
		System.out.println("default constructor");
		// TODO Auto-generated constructor stub
	}
	
	private void disp(){
		System.out.println("private method");
	}

	public static void main(String[] args) {
		ThisTest a=new ThisTest(2);
		// TODO Auto-generated method stub

	}

}
