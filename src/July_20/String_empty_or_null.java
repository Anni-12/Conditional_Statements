package July_20;
import java.util.*;
public class String_empty_or_null {

	public static void main(String[] args) {
		String str;
		Scanner sc= new Scanner(System.in);
		str= sc.nextLine();
		if(str==null)
		{
			System.out.println("The string is null");
		}
		else if(str.isEmpty())
		{
			System.out.println("The string is empty");
		}
		else
		{
			System.out.println("none of the above");
		}
	}

}
