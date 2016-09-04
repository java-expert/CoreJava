package innerClass;

public class NonStatic_MemberInnerClass {
	
private int a=10;
	
public class Inner{
	void display(){
		System.out.println("value of a : "+a);
	}
	
}

public static void main(String[] args) {
	NonStatic_MemberInnerClass outer=new NonStatic_MemberInnerClass();
	NonStatic_MemberInnerClass.Inner inner=outer.new Inner();
	inner.display();
}

}
