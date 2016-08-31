package exceptionHandling;

public class CustomExceptionTest {
	void display() throws MyException{
		if(2>1)
			throw new MyException("2 is greater than 1 and i dont like it :)");
		
	}
	public static void main(String[] args) throws MyException {
		CustomExceptionTest c=new CustomExceptionTest();
		try{
		c.display();
		}catch(Exception e){
			System.out.println("exception occured :: "+e);
		}
	
	}

}
