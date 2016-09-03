
public class StringCreationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("welcome");
		String s2=new String("welcome");
		String s3="welcome";
		//all are having same hashcode
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

	}

}
