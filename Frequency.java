package javalessons;
import java.util.Scannar;
import java.util.Scanner;
public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		System.out.println("Enter a character:");
		int l=str.length();
	    int c=0;
		char chr=sc.next().charAt(0);
		for(int i=0;i<(l);i++)
		{
			if(str.charAt(i)==chr)
			{
				c++;
			}
		}
		System.out.println("No of occurence:"+c);
		

	}

}
