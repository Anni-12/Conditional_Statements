package OOP;

public class Method_overloading {
	Method_overloading(int v)
	{
		System.out.println("Constructor here");
	}
	public void method1()
	{
		System.out.println("This is NULL");
	}
	public void method2(int a)
	{
		System.out.println("This is INT");
	}
	public void method3(String b)
	{
		this.method4(6.78);
		System.out.println("This is STRING");
	}
	public void method4(double d)
	{
		System.out.println("This is DOUBLE");
	}

}
