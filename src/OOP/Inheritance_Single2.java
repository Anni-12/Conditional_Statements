package OOP;

public class Inheritance_Single2 extends Inheritance_single1 {
	public void test2()
	{
		System.out.print("I am the child class");
	}
	public static void main(String args[])
	{
		Inheritance_Single2 ref= new Inheritance_Single2();
		ref.test1();
		ref.test2();
	}

}
