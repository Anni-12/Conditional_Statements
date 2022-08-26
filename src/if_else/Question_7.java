package if_else;

import java.util.Scanner;

public class Question_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month number");
		int a=sc.nextInt();
		System.out.println("Enter the year number");
		int b=sc.nextInt();
		//String Name="sffad";
		if(a==1)
		{
			System.out.println("Month Is January");
			System.out.println("Number of days in "+b+" january are 31");
		}
		else if(a==2)
		{
			if(((b%400)==0)||((b%4==0)&&(b%100!=0))){
				System.out.println("Month Is February");
				System.out.println("Number of days in "+b+" february are 29");
			}
			else
			{
				System.out.println("Month Is February");
				System.out.println("Number of days in "+b+" february are 28");
			}
		}
		else if(a==3)
		{
			System.out.println("Month Is March");
			System.out.println("Number of days in "+b+" March are 31");
		}
		else if(a==4)
		{
			System.out.println("Month Is April");
			System.out.println("Number of days in "+b+" April are 30");
		}
		else if(a==5)
		{
			System.out.println("Month Is May");
			System.out.println("Number of days in "+b+" May are 31");
		}
		else if(a==6)
		{
			System.out.println("Month Is June");
			System.out.println("Number of days in "+b+" June are 30");
		}
		else if(a==7)
		{
			System.out.println("Month Is July");
			System.out.println("Number of days in "+b+" July are 31");
		}
		else if(a==8)
		{
			System.out.println("Month Is August");
			System.out.println("Number of days in "+b+" August are 31");
		}
		else if(a==9)
		{
			System.out.println("Month Is September");
			System.out.println("Number of days in "+b+" September are 30");
		}
		else if(a==10)
		{
			System.out.println("Month Is October");
			System.out.println("Number of days in "+b+" October are 31");
		}
		else if(a==11)
		{
			System.out.println("Month Is November");
			System.out.println("Number of days in "+b+" November are 30");
		}
		else if(a==12)
		{
			System.out.println("Month Is December");
			System.out.println("Number of days in "+b+" December are 31");
		}
	}

}
