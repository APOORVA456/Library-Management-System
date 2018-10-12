import java.util.*;
import javax.lang.model.util.ElementScanner6;
public class User extends Library
{
	String name;
	int ID,days;
	public void student()
	{
		Scanner s=new Scanner(System.in);
		int choice,count=0;
		do
		{
			System.out.println("\n\n1:Exit");
			System.out.println("2:Add user");
			System.out.println("3:Remove user");
			System.out.println("4:Display user");
			System.out.println("5:Search user");
			System.out.println("6:Issue book");
			System.out.println("7:Renew book");
			System.out.println("8:Return book");
			System.out.println("Enter a choice:");
			choice=s.nextInt();
			switch(choice)
			{
				case 1: System.out.println("Exiting to main menu");
								break;
				case 2: System.out.println("\nNew user");
								System.out.println("Enter name: ");
								name=s.next();
								System.out.println("\nEnter ID:");
								ID=s.nextInt();
								insert(name,ID);
								break;
				case 3: System.out.println("\nEnter the ID to be removed:");
								ID=s.nextInt();
								remove(ID);
								break;
				case 4: System.out.println("\nEnter the ID to be displayed:");
								ID=s.nextInt();
								display(ID);
								break;
				case 5: System.out.println("\nEnter the ID to be searched:");
								ID=s.nextInt();
								search(ID);
								break;
				case 6: Book b=new Book();
								System.out.println("Enter the book ID to issue:");
								ID=s.nextInt();
								int m=b.bsearch(ID);
								if(m==1)
								{
									System.out.println("Book issued");
									count++;
								}
								else
								{
									System.out.println("Can't issue the book");
								}
								break;
				case 7: if(count!=2)
								{
									System.out.println("Your can renew the book");
									Transaction t=new Transaction();
									t.rfine();
									count++;
								}
								else
								{
									System.out.println("You cannot renew the book");
								}
								break;
				case 8: System.out.println("Enter the book ID issued:");
								ID=s.nextInt();
								Transaction t=new Transaction();
								t.fine();
								break;
				default: System.out.println("Wrong choice. Please re-enter");
			}
		}while(choice!=1);
	}
	static	Vector<Student> v=new Vector<Student>();
	static void insert(String name,int ID)
	{
		Student std=new Student(name,ID);
    v.add(std);
  }
	static void remove(int ID)
	{
		for(int i=0;i<v.size();i++)
		{
			Student std;
			std=v.get(i);
			if(std.ID==ID)
			{
				v.removeElementAt(i);
				break;
			}
		}
	}
	static void display(int ID)
	{
		for(int i=0;i<v.size();i++)
		{
			Student std;
			std=v.get(i);
			if(std.ID==ID)
			{
				System.out.println("\n\tThe user is:");
				System.out.println("Name:"+std.name+"\nID:"+std.ID);
				break;
			}
		}
	}
	static void search(int ID)
	{
		for(int i=0;i<v.size();i++)
		{
			Student std;
			std=v.get(i);
			if(std.ID==ID)
			{
				System.out.println("\nUser Found");
				break;
			}
		}
	}
}