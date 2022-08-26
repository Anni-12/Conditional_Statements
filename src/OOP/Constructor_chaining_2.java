package OOP;

public class Constructor_chaining_2 extends Constructor_chaining_1 {
	Constructor_chaining_2()
	{
		System.out.println("Default constructor of child class");
	}
	Constructor_chaining_2(int a,String b)
	{
		super();
		System.out.println("Parameterized constructor of child class");
	}

}
