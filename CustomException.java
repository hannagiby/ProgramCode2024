package java2024;
import java.util.Scanner;
class InvalidAmountException extends Exception {
	private String msg;
	InvalidAmountException(String msg) {
		this.msg = msg;
		}
	public String getMessage() {
		return msg;
		}
	}
class InsufficientAmountException extends Exception {
	private String msg;
	InsufficientAmountException(String msg) {
		this.msg = msg;
		}
	public String getMessage() {
		return msg;
		}
}
class MyBank{
	public int accno,balance,wd_amnt;
	int depo_amnt;
	String name,type;
	public void OpenAccount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account no: ");
		accno=sc.nextInt();
		System.out.println("Enter account type: ");
		sc.nextLine();
		type=sc.nextLine();
		System.out.println("Enter name: ");

  name=sc.nextLine();

  System.out.println("Enter intial balance: ");

  balance=sc.nextInt();

  System.out.println("Account Created Succesfully!");

 }

 public void DisplayAccount() {

  System.out.println("Name: "+name);

  System.out.println("Account no: "+accno);

  System.out.println("Account type: "+type);

  System.out.println("initial balance: "+balance);

 }

 public void SearchAccount() {
	 Scanner sc=new Scanner(System.in);
   System.out.println("Enter the account to search:");
   sc.nextLine();


 }

 public void DepositAmount() {

  Scanner sc=new Scanner(System.in);

  try {

  System.out.println("Enter amount to deposit: ");

  depo_amnt=sc.nextInt();

  if(depo_amnt<=0) {

   throw new InvalidAmountException("Invalid amount; must be greater than 0.");

  }

  else {

  balance=balance+depo_amnt;

  System.out.println("New Balance: "+balance);

  }

  }catch(InvalidAmountException e){

   System.out.println(e.getMessage());

  }

 }

 public void WithdrawAmount() {

  Scanner sc=new Scanner(System.in);

  try {

  System.out.println("Enter amount to withdraw: ");

  wd_amnt=sc.nextInt();

  if(wd_amnt<=0){

   throw new InsufficientAmountException("Invalid amount; must be greater than 0.");

  }

  else if(wd_amnt>balance) {

   throw new InsufficientAmountException("Invalid amount; amount is insufficient.");

  }

  else {

   balance=balance-wd_amnt;

   System.out.println("New Balance: "+balance);

  }

  }catch(InsufficientAmountException e){

   System.out.println(e.getMessage());

  }



 }

}


public class CustomException {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		  String choice;

		  int option;

		  MyBank b=new MyBank();

		  do {

		  System.out.println("*** Banking System Application ***"

		    + "\n1.Open new account\n2.Display account deatils\n3.depositt"

		    + "\n4.withdraw\n5.search account\n6.exit\n" );

		  System.out.println("Enter your choice: ");

		  option=sc.nextInt();



		  switch(option) {

		  case 1:

		   b.OpenAccount();

		   break;

		  case 2:

		   b.DisplayAccount();

		   break;

		   case 3:

		    b.DepositAmount();

		    break;

		   case 4:

		    b.WithdrawAmount();

		    break;
		   case 5:
			   b.SearchAccount();
			   b.DisplayAccount();
			   break;

		   case 6:

		    System.out.println("Exiting...");

		    break;

		    default:

		     System.out.println("INVALID");

		     break;

		  }

		  System.out.println("Do you want to continue?(y/n)");

		        sc.nextLine();

		        choice=sc.nextLine();

		        }while(choice.toLowerCase().equals("y"));

		        if(choice.toLowerCase().equals("n")) {

		        System.out.println("END");

		        }


	}

}
