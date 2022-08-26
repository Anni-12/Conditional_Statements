package if_else;

import java.util.Scanner;

public class Greatest_of_3_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		System.out.println("Enter the third number");
		int c=sc.nextInt();
		int max=0;
		if((a>b)&&(a>c))
		{
			max=a;
		}
		else if((b>a)&&(b>c))
		{
			max=b;
		}
		else
		{
			max=c;
		}
		System.out.println("The greatest: "+max);

	}

}
