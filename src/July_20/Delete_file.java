package July_20;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Delete_file {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\File_Handling\\hello.txt");
		boolean b= f.createNewFile();
		FileWriter f1=new FileWriter(f);
		f1.write("Hello");
		f1.close();
		//f.delete();
	}

}