package if_else;

import java.util.Scanner;

public class Absolute_Value {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		double a=sc.nextDouble();
		if(a>0)
		{
			if(a<1)
			{
				System.out.print("Positive small number");
			}
			else if(a>1000000)
			{
				System.out.print("positive large");
			}
			else
			{
				System.out.print("positive num");
			}
		}
		else if(a<0)
		{
			if(Math.abs(a)<1)
			{
				System.out.print("negative small");
			}
			else if(Math.abs(a)>1000000)
			{
				System.out.print("negative large");
			}
			else
			{
				System.out.print("negative num");
			}
		}

	}

}
