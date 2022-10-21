package saurabh;

public class TryAndFinally {

	
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
			        finally {
				             System.out.println("hello");
			                }
				System.out.println("Thank you for useing calculator");
		    
		}
		
	public static void main (String[]args) {
		TryAndFinally obj = new TryAndFinally();
		
	           obj.calculator(10,0);
		
	}
	}



