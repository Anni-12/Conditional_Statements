package if_else;

import java.util.Scanner;

public class Roots_of_Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		double a=sc.nextDouble();
		System.out.println("Enter the second number");
		double b=sc.nextDouble();
		System.out.println("Enter the third number");
		double c=sc.nextDouble();
		double d;
		d=(b*b)-(4.0*a*c);
		double x,y;
		if(d>0.0)
		{
			x=(-b+Math.pow(d,0.5))/2.0*a;
			y=(-b-Math.pow(d,0.5))/2.0*a;
			System.out.println("THE ROOTS ARE:"+x+"    AND    "+y);
		}
		else if(d==0.0)
		{
			x=-b/2.0*a;
			y=-b/2.0*a;
			System.out.println("THE ROOTS ARE:"+x+"     AND     "+y);
		}
		else
		{
			System.out.print("No solution");
		}
	}

}
