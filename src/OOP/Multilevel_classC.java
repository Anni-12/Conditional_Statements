package OOP;

public class Multilevel_classC extends Multilevel_classB {
	public void test2()
	{
		System.out.println("Class-C");
	}

	public static void main(String[] args) {
		Multilevel_classC obj = new Multilevel_classC();
		obj.test2();
		obj.test1();
		obj.test();

	}

}
