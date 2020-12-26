package Java_coding;

public class Factorialnumber {

	public static void main(String[] args) {
	
		int num = 5;
//		int fact = 1;
//		
//		for (int i=1; i<=num; i++)
//		{
//			fact = fact * i;
//		}
//		System.out.println("Factorial of " + num + " is " + fact);
		
		getfact(num);

	}
	
	//....................method 2
	
	
	
	public static void getfact(int num) {
		
      int fact = 1;
		
		for (int i=1; i<=num; i++)
		{
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is " + fact);

		
	}

}
