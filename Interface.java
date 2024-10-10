package java2024;
import java.util.Scanner;

abstract class Animal{

 protected int legs;

 protected Animal(int legs) {

  this.legs=legs;

 }

  abstract void eat();

  void walk() {

   if(legs==0) {

   System.out.println("Animal has no legs");

  }

   else {

    System.out.println("This Animal walks by " +legs+" legs");

   }

}

  }

class Spider extends Animal{

 Spider(int legs){

  super(legs);

  System.out.println("SPIDER");

 }

 void eat() {

  System.out.println("Spider eats insects");

  

 }

}

interface Pet{

 String getname();

 void setname(String getname);

 void play();

	

}

class Cat extends Animal implements Pet{

 Cat( String name,int legs){

  super(legs);

  this.name=name;

  System.out.println("CAT");

 }

	

 String name;

 public String getname() {

  System.out.println("Cat name is "+name);

  return null;

 }

 public void play() {

  System.out.println("Cat plays with rats");

 }

 void eat() {

  System.out.println("Cat eats fishes");

 }

 public void setname(String getname) {

  System.out.println("Cat name is "+getname);

  

 }

	

}

class Fish extends Animal implements Pet{

 Fish( String name,int legs){

  super(legs);

  this.name=name;

  System.out.println("FISH");

 }

 String name;

 public String getname() {

  System.out.println("Fish name is "+name);

  return null;

 }

 void eat() {

  System.out.println("Fish eats plants");

 }

 public void setname(String getname) {

  System.out.println("Fish name is "+getname);

  

	

}

 @Override

 public void play() {

  // TODO Auto-generated method stub

  

 }

}

public class Interface {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	  Fish f=new Fish("Mimi",0);

	  f.getname();

	  f.walk();

	  f.eat();

	  f.setname("Momo");

	  Cat c=new Cat("Fluffy",4);

	  c.getname();

	  c.walk();

	  c.eat();

	  c.play();

	  c.setname("Moose");

	  

	  Spider s=new Spider(8);

	  s.eat();

	  s.walk();

	  

	  

	  






	}

}
