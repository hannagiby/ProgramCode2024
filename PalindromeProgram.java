package javalessons;
import java.util.Scanner;
public class PalindromeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		 String str=sc.nextLine(); 
		 sc.close();
		 String rev=" ";
		 int l=str.length();
		 boolean flag=true;
		 for(int i=0;i<l/2;i++)
		 {
			 if(str.charAt(i)!=str.charAt(l-i-1))
			 flag=false;
			 break;
		 }
		if(flag)
		{
			System.out.println("The string is palindrome");
		}
		else
		    System.out.println("The string is not palindrome");
	}
}

