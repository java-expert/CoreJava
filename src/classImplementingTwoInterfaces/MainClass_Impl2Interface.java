package classImplementingTwoInterfaces;


public class MainClass_Impl2Interface {
	public static void main(String[] args) {
		CarInterface c=new Alto();
		c.displayEngine();
		
		Alto a=new Alto();
		a.displayEngine();
		a.displayWeight();
	}

}
