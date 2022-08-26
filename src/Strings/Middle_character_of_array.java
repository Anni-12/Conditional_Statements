package Strings;
import java.util.*;
public class Middle_character_of_array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String str= sc.nextLine();
		char[] ch= str.toCharArray();
		int len=ch.length;
		if(len%2==0)
		{
			System.out.print(ch[(len/2)-1]);
		}
		else
		{
			System.out.print(ch[(len/2)]);
		}

	}

}
