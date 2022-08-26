package Strings;
import java.util.*;
public class string_to_array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String str= sc.nextLine();
		//String str="Aniket";
		char[] ch=str.toCharArray();
		int len=ch.length;
		for(int i=0;i<len;i++)
		{
			System.out.println(ch[i]);
		}

	}

}
