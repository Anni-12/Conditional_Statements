package OOP;

public class Method_overiding2 extends Method_overriding1 {
	Method_overiding2()
	{
		super(2);
		//super.test1(7);
		System.out.println("Constructor of Overriding 2");
	}
	Method_overiding2(int c)
	{
		//super(2);
		this.test2(5);
		System.out.println("Constructor of Overriding 2 parameter there");
	}
	public void test1(int a)
	{
		System.out.println("This is INT of overiding 2");
	}
	public void test2(int b)
	{
		super.test1(5);
		this.test3("hey");
		System.out.println("This is INT of overiding 2");
	}
	public void test3(String b)
	{
		System.out.println("This is STRING of overriding 2");
	}

}
