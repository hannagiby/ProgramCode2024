package lab24;
import java.util.*;
class AddTable extends Thread{
	int num;
	AddTable(int num){
		this.num=num;
		
		}
	public void run() {
		synchronized(AddTable.class) {
			for(int i=1;i<5;i++) {
				System.out.println(num+" + "+i+" = "+(num+i));
			}
		}
	}
}
public class AdditionTable {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Table you want to run by Thread 1");
		int num1=sc.nextInt();
		AddTable n1=new AddTable(num1);
		System.out.println("Enter the Table you want to run by Thread2");
		int num2=sc.nextInt();
		AddTable n2=new AddTable(num2);
		System.out.println("Enter the Table you want to run by Thread 3");
		int num3=sc.nextInt();
		AddTable n3=new AddTable(num3);
		n1.start();
		n2.start();
		n3.start();
		sc.close();

	}

}
