package July_20;
import java.util.*;
public class Leap_year {

	public static void main(String[] args) {
		int a;
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		if(((a%400)==0)||((a%4==0)&&(a%100!=0)))
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap Year");
		}
	}

}
