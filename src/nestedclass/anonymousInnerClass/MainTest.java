package nestedclass.anonymousInnerClass;

public class MainTest {
	public static void main(String[] args) {
		Person p=new Person() {
			
			@Override
			public void display() {
				System.out.println("-------------display method");
				
			}
		};
		p.display();
		
	}


}
