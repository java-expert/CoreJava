package overridding;

public class MainClass {
	public static void main(String[] args) {
		SubClass c=new SubClass();
		c.display();
		SubClass.display();
		
		ParentClass p=new SubClass();
		System.out.println(p.a);
	}

}
