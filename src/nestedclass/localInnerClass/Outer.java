package nestedclass.localInnerClass;

class Outer {
	static int a=10;
		static class Inner{
			int b=66;
			void displayI(){
				System.out.println(a);
				System.out.println(b);
				//TODO
				// not sure why it is said that local variable 
				//b needs to be final for access
			}
		}
	
public static void main(String[] args) {
	Outer out=new Outer();
	//TODO
	//Outer.Inner in=new Outer().Inner; //problem

	
}
}
