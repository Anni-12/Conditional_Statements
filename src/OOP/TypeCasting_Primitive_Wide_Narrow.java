package OOP;

public class TypeCasting_Primitive_Wide_Narrow {

	public static void main(String[] args) {
		//widening
		int x=6;
		double y=x;
		System.out.println(y);
		//narrowing
		float a=4.59f;
		int b= (int)a;
		System.out.println(b);
	}
}
