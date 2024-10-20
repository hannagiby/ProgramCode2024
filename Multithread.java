package lab24;
import java.util.*;
class SquareThread extends Thread{
	int randomnum;
	SquareThread( int randomnum){
		this.randomnum=randomnum;
	}
	public void run() {
		System.out.println("Square of"+randomnum+"="+(randomnum*randomnum));
}
	
	
}
class CubeThread extends Thread{
	int randomnum;
	CubeThread( int randomnum){
		this.randomnum=randomnum;
	}
	public void run() {
		System.out.println("Cube of"+randomnum+"="+(randomnum*randomnum*randomnum));
}
	
	
}
class RandThread1 extends Thread{
	public void run() {
	Random robj= new Random();
	
	 for(int i=1;i<=10;i++) {
		 int randomnum=robj.nextInt(100);
	 
	 if(i%2==0) {
		 SquareThread s=new SquareThread(randomnum);
		 s.start();
	 }
		 else {
			 CubeThread c=new CubeThread(randomnum);
			 c.start();
		 }
		 
		 
	 }
	 }
	
}
public class Multithread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandThread1 t=new RandThread1();
		t.start();

	}

}
