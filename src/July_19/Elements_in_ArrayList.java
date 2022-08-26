package July_19;

import java.util.ArrayList;
import java.util.Scanner;
public class Elements_in_ArrayList {

	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<Object>();
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		arr.add("red");
		arr.add("blue");
		arr.add("4");
		arr.add("hello");
		System.out.println("The array list is:-"+arr);
		if(arr.contains(str))
		{
			System.out.println("it is there");
		}
		else
		{
			System.out.println("it is not there");
		}
	}

}
