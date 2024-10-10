package java2024;
import java.util.Scanner;
class Employeee4{
	String name=new String();
	int age;
	long phoneno;
	String adress=new String();
	float salary;
	void print_Employee()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("PhoneNo:"+phoneno);
		System.out.println("Adress:"+adress);
	}
	
	void print_Salary()
	{
		System.out.println("Salary "+salary);
	}
	
}
class Officer extends Employeee4{
	String specialization=new String();
	void print_Specialization()
	{
		System.out.println("Specialization:"+specialization);
	}
	
}
class Manager extends Employeee4{
	String department=new String();
	void print_Department()
	{
		System.out.println("Department"+department);
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Officer obj1=new Officer();
		System.out.println("Enter the officer name:");
		obj1.name=sc.nextLine();
		System.out.println("Enter Adress:");
		obj1.adress=sc.nextLine();
		System.out.println("Enter Specialization:");
		obj1.specialization=sc.nextLine();
		System.out.println("Age:");
		obj1.age=sc.nextInt();
		System.out.println("PhoneNo:");
		obj1.phoneno =sc.nextLong();
		System.out.println("Enter Salary:");
		obj1.salary=sc.nextFloat();
		
		Manager obj2=new Manager();
		sc.nextLine();
		System.out.println("Enter the managers  Name:");
		obj2.name=sc.nextLine();
		System.out.println("Enter Adress:");
		obj2.adress=sc.nextLine();
		System.out.println("Enter Department:");
		obj2.department=sc.nextLine();
		System.out.println("Enter Age:");
		obj2.age=sc.nextInt();
		System.out.println("Enter PhoneNo:");
		obj2.phoneno =sc.nextLong();
		System.out.println("Enter Salary:");
		obj2.salary=sc.nextFloat();
		System.out.println("OFFICER'S DETAILS:");
		obj1.print_Employee();
		obj1.print_Salary();
		obj1.print_Specialization();
		System.out.println("MANAGER'S DETAILS:");
		obj2.print_Employee();
		obj2.print_Salary();
		obj2.print_Department();
		
		
	



	}

}
