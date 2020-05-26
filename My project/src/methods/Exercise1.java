package methods;

import java.util.Scanner;

//1. Write a Java method to find the smallest number among three numbers. Go to the editor
//Test Data:
//Input the first number: 25
//Input the Second number: 37
//Input the third number: 29
//Expected Output:

public class Exercise1 {
	
	public static void main(String[] args)
	{
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter three numbers");
			int a= sc.nextInt();
			int b= sc.nextInt();
			int c= sc.nextInt();
			
			
			int result = getSmallest(a,b,c);
			System.out.println(result+ " is smallest number");
			
			
		}
		
	}
	
	static int getSmallest(int a,int b,int c)
	{
		if(a<b)
			if(a<c) return a;
			else
				if(b<a)
					if(b<c) return b;
					else return c;
		return c;

		
	}

}
