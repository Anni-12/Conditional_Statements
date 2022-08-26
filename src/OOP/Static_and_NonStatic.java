package OOP;
import java.util.*;
public class Static_and_NonStatic {
	int a=90;
	int b=30;
	static int c=9;
	public static void simple()
	{
		System.out.println("Static one");
	}
	public void add2()
	{
		System.out.println("NonStatic");
	}

	public static void main(String[] args) {
		Static_and_NonStatic.simple();
		System.out.println(Static_and_NonStatic.c);
		Static_and_NonStatic obj= new Static_and_NonStatic();
		obj.add2();
		System.out.println(obj.a+obj.b);
	}

}
