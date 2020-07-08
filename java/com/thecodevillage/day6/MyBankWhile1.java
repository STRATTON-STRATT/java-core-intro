import java.util.Scanner;
public class MyBankWhile1{

	//static Scanner scanner = new Scanner(System.in);
	static Scanner scanner = new Scanner(System.in);

	static double balance = 50000.0;
	static double depositInput = 0;
	static boolean exit = false;


	public static void main(String[] args){

		int pin = 1234;
		System.out.println("*** Welcome to our Bank ***");
		System.out.println(" Enter pin ");
		int thepin = scanner.nextInt();

		while(pin != thepin)
		{
			System.out.println("-- Invalid pin Entered --");
			thepin = scanner.nextInt();
		}

		int choice = 0;
		while(!exit)
		{
			System.out.println("1. Check balance");
			System.out.println("2.Deposit");
			System.out.println("3. Withdraw");
			System.out.println("0 Exit");
			choice = scanner.nextInt();
			bankOption(choice);
		}
	}
	static void bankOption(int choice)
	{
		switch(choice)
		{
			case 1:
			System.out.println("Balance is: " +balance);
			break;
			case 2:
			System.out.println(" Enter the Amount: ");
			depositInput = scanner.nextInt();
			balance+=depositInput;
			System.out.println("NEW BALANCE: " +balance);
			break;
			case 3:
			break;
			case 0:
			System.out.println("Invalid Option Selected");
		}
	}
}