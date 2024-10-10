package java2024;
import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String choice;
		int option;
		do {
		System.out.println("Enter which option to perform: ");
		System.out.println("1.Arithmetic Exception\n2.Array Index Out Of Bound Exception");
		        option=sc.nextInt();
		        switch(option) {
		 case 1:
		   try {
		        int num1,num2;
		        System.out.println("Enter 1st number:");
		        num1=sc.nextInt();
		        System.out.println("Enter 2nd number: ");
		        num2=sc.nextInt();
		        int div=num1/num2;
		        System.out.println("Result: "+div);
		        }catch(ArithmeticException e) {
		        System.out.println("Exception thrown: "+ e);
		        }
			finally {
				System.out.println("Finally block content\nMy code is safe from exception");
			}
		        break;
		        case 2:
		        try{
		        int n;
		        System.out.println("Enter no.of elements of the array:");
		        n=sc.nextInt();
		        int[] arr=new int[n];
		        System.out.println("Enter elements of the array:");
		        for(int i=0;i<n;i++) {
		        arr[i]=sc.nextInt();
		        }
		        System.out.println("Array Length: "+n);
		        System.out.println("Array elements are:");
		        for(int i=0;i<n;i++) {
		        System.out.print(arr[i]+"\t");
		        }
		        sc.nextLine();
		        System.out.println("\nEnter position of element to be accessed:");
		        int pos=sc.nextInt();
		        System.out.println("The element at position "+pos +" is: "+arr[pos]);
		        }catch(ArrayIndexOutOfBoundsException e){
		        	System.out.println("Exception thrown: "+ e);
		        }
		        break;
				default:
					System.out.println("invalid choice!");
					break;
				}
		        System.out.println("Do you want to continue?(y/n)");
		        sc.nextLine();
		        choice=sc.nextLine();
		        }while(choice.toLowerCase().equals("y"));
		        if(choice.toLowerCase().equals("n")) {
		        System.out.println("Exiting..");
		        }
		sc.close();


	}

}
