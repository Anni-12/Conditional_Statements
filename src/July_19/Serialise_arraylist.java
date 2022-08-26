package July_19;
import java.util.*;
import java.io.*;
public class Serialise_arraylist {

	static void serializearr()
	{
		ArrayList<String>name= new ArrayList<String>();
		name.add("Aniket");
		name.add("is");
		name.add("here");
		try
		{
			FileOutputStream fos= new FileOutputStream("nameslistdata");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(name);
			oos.close();
			fos.close();
			System.out.println("nameslist serialized");
		}
		catch(Io)
		{
		}
		
	}

	public static void main(String[] args) {
		
	}

}
