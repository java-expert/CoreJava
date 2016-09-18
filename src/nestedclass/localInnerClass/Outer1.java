package nestedclass.localInnerClass;

class Outer1 {
	static private int a=10;
		static class Inner{
			private int b=20;	
			static void displayI(){
				System.out.println("called static method from static inner class");

			}
		}
	
public static void main(String[] args) {

	Outer1.Inner.displayI();

	
}
}
