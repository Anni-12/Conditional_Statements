package July_20;
import java.util.*;
public class Largest_among_3 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if((a>c)&&(a>b))
		{
			System.out.println(a+" is the greatest");
		}
		else if((b>a)&&(b>c))
		{
			System.out.println(b+" is the greatest");
		}
		else
		{
			System.out.println(c+" is the greatest");
		}
	}

}
