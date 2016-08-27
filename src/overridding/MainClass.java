package overridding;

public class MainClass {
	public static void main(String[] args) {
		SubClass c=new SubClass();
		c.display();
		SubClass.display();
	}

}
