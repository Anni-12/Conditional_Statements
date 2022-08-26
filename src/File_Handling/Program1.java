package File_Handling;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\File_Handling\\Myfile.txt");
		//boolean b=f.mkdir();
		//System.out.println(b);
//		boolean b= f.createNewFile();
//		FileWriter f1=new FileWriter(f);
//		f1.write("Aniket");
//		f1.close();
		FileReader f2= new FileReader(f);
		int k;
//		while((k=f2.read())!=-1)
//		{
//			System.out.println((char)k);
//		}
//		f2.close();
		//File Obj = new File("myfile.txt");
        Scanner Reader = new Scanner(f);
        while (Reader.hasNextLine()) {
            String data = Reader.nextLine();
            System.out.println(data);
        }
        Reader.close();
		
	}

}
