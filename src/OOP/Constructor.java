package OOP;
import java.util.*;
public class Constructor {
	/*Constructor()
	{
		System.out.print("Default it is");
	}*/
	Constructor(int a)
	{
		//this("hey");
		this(20.77);
		System.out.println("INT IT IS");
		//test1();
	}
	Constructor(String b)
	{
		this(20);
		System.out.println("STRING IT IS");
		//test1();
	}
	Constructor(double d)
	{
		System.out.println("DOUBLE IT IS");
		test1();
		test();
	}
	public static void test()
	{
		System.out.println("Test it is");
	}
	public void test1()
	{
		System.out.println("Test1 it is");
	}

	public static void main(String[] args) {
		//Constructor.test();
		//Constructor.test1();
		Constructor obj= new Constructor(20);
		//obj.test1();
	}

}
