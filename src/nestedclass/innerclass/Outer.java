package nestedclass.innerclass;

class Outer {
	private int a=10;
	void displayO(){
		System.out.println("outer class cannot access data/members of inner class");
	}
class Inner{
	int b=20;	
	void displayI(){
		System.out.println(a);
	}
}
public static void main(String[] args) {
	Outer out=new Outer();
	Inner inn=out.new Inner();
	
	inn.displayI();
	
}
}
