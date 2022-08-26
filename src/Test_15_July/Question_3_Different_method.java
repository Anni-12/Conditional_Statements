package Test_15_July;

public class Question_3_Different_method {
	protected void diff()
	{
		System.out.println("Protected it is");
	}
	/*default void diff()
	{
		System.out.println("Default it is");
	}*/
	private void diff(int a)
	{
		System.out.println("Private it is");
	}
	/*protected void diff()
	{
		System.out.println("Protected it is");
	}*/
	public void diff(String C)
	{
		System.out.println("Public it is");
	}


public static void main(String[] args)
{
	Question_3_Different_method a = new Question_3_Different_method();
	a.diff();
	a.diff(4);
	a.diff("Hello");
}
}