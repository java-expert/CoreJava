package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Persist{  
	 public static void main(String args[])throws Exception{  
	  Student s1 =new Student(211,"ravi","123add");  
	  
	  FileOutputStream fout=new FileOutputStream("d:\\f.txt");  
	  ObjectOutputStream out=new ObjectOutputStream(fout);  
	  
	  out.writeObject(s1);  
	  out.flush();  
	  System.out.println("success");
	  
	  FileInputStream fin=new FileInputStream("d:\\f.txt");  
	  ObjectInputStream ois=new ObjectInputStream(fin);
	  Student s=(Student) ois.readObject();
	  System.out.println(s.getName());
	  System.out.println(s.getAddress());
	 }  
	}  
