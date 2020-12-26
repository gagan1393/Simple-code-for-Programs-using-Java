package Java_coding;

public class NaturalNumbersum {

	public static void main(String[] args) {
		 int num = 100; //5050
		 int sum = 0;
		 
		 for (int i =1; i<=num; i++ )
		 {
			 sum = sum + i;
		 }
		 System.out.println("sum is : " + sum);
		 
		 //to double the natural  number
		 
		 int k =1;
		 while(k<=num)
		 {
			 sum = sum + k;
			 k++;
		 }
		 System.out.println("sum is : " + sum);

	}

}
