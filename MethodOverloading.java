package javalessons;
import java.util.Scanner;
public class MethodOverloading {
	void area(float b,float h) 
	{
	float area=.5f*b*h;
	System.out.println("Area of triangle with base:"+b+ "and height:" +h+ "is:" +area);
	}
	void area(int w,int l)
	{
		int area=w*l;
		System.out.println("Area of rectangle with width:"+w+ "and length:"+l+ "is:" +area);
	}
	void area(double r)
	{
		double area=3.14*r*r;
		System.out.println("Area of Circle with radius:"+r+ "is:"+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	MethodOverloading example=new MethodOverloading();	
	System.out.println("Enter the base of Triangle");
	float b1=sc.nextFloat();
	System.out.println("Enter the height of Triangle");
	float h1=sc.nextFloat();
	System.out.println("Enter the width of Rectangle");
	int w1=sc.nextInt();
	System.out.println("Enter the height of Rectangle");
	int len1=sc.nextInt();
	System.out.println("Enter the radius of circle");
	double r1=sc.nextDouble();
	example.area(b1,h1);
	example.area(w1,len1);
	example.area(r1);
	}

}
