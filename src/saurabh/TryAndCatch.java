package saurabh;

public class TryAndCatch  
{
	public  void calculator(int a,int b) 
	{
		System.out.println(a*b);

		try {
			System.out.println(a/b);
			}
		  catch(Exception e) 
		       {
			System.out.println("Expection catched");
			e.printStackTrace();
			  }
		
			System.out.println("Thank you");
	    
	}
	
public static void main (String[]args) {
	TryAndCatch obj = new TryAndCatch();
	
           obj.calculator(10,0);
	
}
}
