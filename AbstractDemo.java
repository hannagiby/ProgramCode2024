package lab24;
import java.util.Scanner;

abstract class shape{

public abstract void nosides();

}

class Triangle extends shape{

int sides;

Triangle(int sides){

this.sides=sides;

}

public void nosides() {

System.out.println("lam a triangle... and i have " +sides+"sides");
int sum=(sides-2)*180;

System.out.println("Sum of the angles:"+sum);

}

}

class Rectangle extends shape{ int sides;

Rectangle(int sides){

this.sides=sides;

}

public void nosides() {

System.out.println("lam a rectangle...and i have " +sides+"sides.");
int sum=(sides-2)*180; 
System.out.println("Sum of the angles:"+sum);

}

}

class Hexagon extends shape{

int sides;

Hexagon(int sides){
	this.sides=sides;

}

public void nosides() { 
	System.out.println("lam a Hexagon...and i have "+sides+"sides."); 
int sum=(sides-2)*180; 
System.out.println("Sum of the angles:"+sum);

}

}


public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String choice;
		 do {
		System.out.println("Enter the no of sides:");

		int sides=sc.nextInt();
		if (sides==3){ 
			Triangle t=new Triangle(3); t.nosides();

		}

		else if(sides==4) {
			Rectangle r=new Rectangle(4); r.nosides();

		}

		else if(sides==6) {
			Hexagon h=new Hexagon(6); h.nosides();

		}

		else {
			System.out.println("Invalid");

		}

		sc.nextLine();

		System.out.println("Do you want to continue");

		choice=sc.nextLine();

		if (!choice.equalsIgnoreCase("y"))

		{ 
			System.out.println("Exiting the program. Goodbye!");

		}

		}
		while (choice.equalsIgnoreCase("y"));

		sc.close();

	}

}
