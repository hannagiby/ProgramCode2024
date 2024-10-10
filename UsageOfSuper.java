package lab24;
import java.util.Scanner;

class employee1{

int HRA;

int DA;

float BS;

float salary;

employee1(int HRA, int DA, float BS) {

this.HRA=HRA;

this.DA=DA;

this.BS=BS;

}

void print_display() {
System.out.println("....Employee... ");

}

void calc_salary() {

salary=BS+BS*DA/100+BS*HRA/ 100;

System.out.println(" The gross salary of the employee:"+salary);

}

}

class Engineer extends employee1{

Engineer(int HRA, int DA, float BS){

super(HRA, DA, BS);
super.print_display();

super.calc_salary();

}

void print_display() {

System.out.println("....Engineer..." );

}

void calc_salary() {

salary=2*salary;

System.out.println(" The gross salary of the engineer:"+salary);

}

}


public class UsageOfSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the basic salary:");

		float BS=sc.nextFloat();

		System.out.println("Enter the DA :");

		int DA=sc.nextInt();

		System.out.println("Enter the HRA:");

		int HRA=sc.nextInt();
		Engineer obj=new Engineer(HRA, DA, BS);

		obj.print_display();

		obj.calc_salary();

		sc.close();
 



	}

}
