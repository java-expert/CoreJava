package tricky;
/* Immutable Class 
 * Final Class
 * Final variables
 * No Setter method
 */
public final class MyImmutableClass {
final String str;
public MyImmutableClass(String str){
	this.str=str;
}

public String getStr(){
	return str;
}

public static void main(String[] args) {
	MyImmutableClass  obj1=new MyImmutableClass("custom string");
	obj1.getStr();
}
}
