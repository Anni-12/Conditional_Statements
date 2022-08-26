package Test_15_July;

public class MO_and_CO_Q5 {
	MO_and_CO_Q5()
	{
		this(5);
		System.out.println("Default Constructor");
	}
	MO_and_CO_Q5(int a)
	{
		System.out.println("Constructor with INT parameter");
	}
	public void method()
	{
		System.out.println("I have 0 parameter");
	}
	public void method(int a)
	{
		System.out.println("I have INT parameter");
	}
	public void method(double a)
	{
		System.out.println("I have DOUBLE parameter");
	}
	public static void main(String[] args)
	{
		MO_and_CO_Q5 a= new MO_and_CO_Q5(5);
		a.method();
		a.method(3.5);
	}
}

