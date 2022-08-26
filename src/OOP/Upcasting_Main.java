package OOP;

public class Upcasting_Main {

	public static void main(String[] args) {
		Upcasting_Parent ref= (Upcasting_Parent) new Upcasting_Child();
		//One o = (One)new Two();
		ref.test1();
		ref.test2();
		Upcasting_Child ref1= (Upcasting_Child)ref;
		ref1.test1();
		ref1.test2();
	}

}
