package OOP;

public class Encapsulation {
	private int a;
	
	public void assign(int k)
	{
		a=k;
	}
	public int geta()
	{
		return a;
	}


	public static void main(String[] args) {
		Encapsulation i= new Encapsulation();
		i.assign(20);
		int m=i.geta();
		System.out.println(m);
		
	}

}
