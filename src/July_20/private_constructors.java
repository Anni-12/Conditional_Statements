package July_20;

public class private_constructors {

	private private_constructors()
	{
		System.out.println("This is Private Constructor");
	}
	public static void x()
	{
		private_constructors obj= new private_constructors();
	}

}

