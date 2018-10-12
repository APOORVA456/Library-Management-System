import java.util.*;
class Main
{
	public static void main(String args[])
	{
		int choice;
		Scanner s=new Scanner(System.in);
		do
		{
			System.out.println("\n\n\t***MENU***");
			System.out.println("1:EXIT");
			System.out.println("2:LIBRARY MANAGEMENT");
			System.out.println("Enter a choice:");
			choice=s.nextInt();
			switch(choice)
			{
				case 1: System.out.println("\t***THANKYOU***");
								break;
				case 2: Library l=new Library();
								l.check();
								break;
				default: System.out.println("Wrong choice. Please re-enter!");
			}
		}while(choice!=1);
	}
}