package lab24;
import java.util.Scanner;
import java.util.StringTokenizer;
public class TokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integers with one space gap:");

        String s = sc.nextLine();

        StringTokenizer st = new StringTokenizer(s, " ");

        

        while (st.hasMoreTokens()) {

            String temp = st.nextToken();

            int num = Integer.parseInt(temp);

            sum += num;

            System.out.println("Number: " + num);

        }

        

        System.out.println("Sum of the integers is: " + sum);

        sc.close();



	


	}

}
