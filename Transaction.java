import java.util.*;
class Transaction extends User
{
	int days;
	Scanner s=new Scanner(System.in);
	public void fine()
	{
		System.out.println("Enter the number of days after which the book is returned:");
		days=s.nextInt();
		if(days>7 && days<10)
		{
			System.out.println("Fined by Rs.10");
		}
		if(days>=10 && days<15)
		{
			System.out.println("Fined by Rs.30");
		}
		if(days>15)
		{
			System.out.println("Fined by Rs.100");
		}
		if(days==0)
		{
			System.out.println("You can return the book after atleast 1 day");
		}
		if(days>0&&days<=7)
		{
			System.out.println("Book returned");
		}
	}
	public void rfine()
	{
		System.out.println("Enter the number of days after which the book is to be renewed:");
		days=s.nextInt();
		if(days>7 && days<10)
		{
			System.out.println("Fined by Rs.10");
		}
		if(days>=10 && days<15)
		{
			System.out.println("Fined by Rs.30");
		}
		if(days>15)
		{
			System.out.println("Fined by Rs.100");
		}
		if(days==0)
		{
			System.out.println("You can renew the book after atleast 1 day");
		}
		if(days>0&&days<=7)
		{
			System.out.println("Book renewed");
		}
	}
}