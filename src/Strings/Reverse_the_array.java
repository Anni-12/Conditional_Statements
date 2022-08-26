package Strings;

import java.util.Scanner;

public class Reverse_the_array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String str= sc.nextLine();
		//String str="Aniket";
		char[] ch=str.toCharArray();
		int len=ch.length;
		for(int i=len-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}

	}

}
