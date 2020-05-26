package methods;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args)
	{
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter three value");
			int a= sc.nextInt();
			int b= sc.nextInt();
			int c= sc.nextInt();
			
			float result = getAverage(a,b,c);
			System.out.println(result+" is average of three values");
		
		}
		
	}
	
	static float getAverage(int a,int b,int c)
	{
		float average = (a+b+c)/3;
		return average;
	}
}
