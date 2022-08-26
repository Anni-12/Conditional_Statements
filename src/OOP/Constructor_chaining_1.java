package OOP;

public class Constructor_chaining_1 {
	Constructor_chaining_1()
	{
		this("hey");
		System.out.println("Default constructor parent");
	}
	Constructor_chaining_1(String a)
	{
		System.out.println("String parent class");
	}

}
