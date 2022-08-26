package Strings;

import java.util.Scanner;

public class Display_start_to_end {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string");
		String str= sc.nextLine();
		//String str="Aniket";
		char[] ch=str.toCharArray();
		int len=ch.length;
		for(int i=0;i<len/2;i++)
		{
			System.out.println(ch[i]);
		}

	}

}
