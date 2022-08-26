package Test_15_July;

public class Q10_Class_D extends Q10_Class_C{
	public void D()
	{
		System.out.print("Class D");
	}
	/*public void A()
	{
		System.out.println("Class A in D");
	}*/

	public static void main(String[] args) {
		Q10_Class_D a= new Q10_Class_D();
		a.A();
		a.B();
		a.C();
		a.D();
	}

}
