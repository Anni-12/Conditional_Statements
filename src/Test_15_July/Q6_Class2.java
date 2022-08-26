package Test_15_July;

public class Q6_Class2 extends Q6_Class1{
	Q6_Class2()
	{
		super(6);
		System.out.println("Constructor with no parameter of class 2");
	}
	Q6_Class2(int a)
	{
		System.out.println("Constructor with int parameter of class 2");
	}
	public void method1()
	{
		super.method1();
		System.out.println("Method 2 of class 2");
	}
	public void method2()
	{
		System.out.println("Method 2 of class 2 with no parameter");
	}
	public void method2(int c)
	{
		System.out.println("Method 2 of class 2 with int parameter");
	}
	

}
