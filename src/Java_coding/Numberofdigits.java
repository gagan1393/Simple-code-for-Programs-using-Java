package Java_coding;

public class Numberofdigits {

	public static void main(String[] args) {
		
		int num = 123477777;
		int count =0;
		while(num!=0)
		{
			num = num/10;
			++count;
		}
		System.out.println("Number of digits :" + count);

	}

}
