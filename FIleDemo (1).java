package lab24;
import java.io.*;
import java.io.IOException;
import java.util.*;

public class FIleDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try {
			File f=new File("Sample.txt");
			if(f.createNewFile()) {
				System.out.println("File Created:"+f.getName());
			}
			else {
				System.out.println("Sample.txt exists");
				}
		}
		catch(IOException e) {
			System.out.println("An Error Occured");
			
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.nextLine();
		FileWriter fw = new FileWriter("Sample.txt");
		fw.write(str);
		System.out.println("Content written to file.");
		fw.close();
		try {
			File f1=new File("new-Sample.txt");
			if(f1.createNewFile()) {
				System.out.println("File Created:"+f1.getName());
			}
			else {
				System.out.println("new-Sample.txt exists");
				}
		}
		catch(IOException e) {
			System.out.println("An Error Occured");
			
		}
		FileWriter fw1 = new FileWriter("new-Sample.txt");
		FileReader fr = new FileReader("Sample.txt");
		System.out.println("-------Contents of Sample.txt-------:");
		int i;
		while((i = fr.read())!=-1) {
			System.out.print((char)i);
			fw1.write((char)i);
		
		}
		System.out.println("\nContent copied from sample.txt to new-sample.txt");
		fw1.close();
		System.out.println("-------Contents of new-Sample.txt-------:");
		FileReader fr1 = new FileReader("new-Sample.txt");

		while((i = fr1.read())!=-1) {
		System.out.print((char)i);

		}

		
	}

}
