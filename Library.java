import java.util.*;
public class Library
{
	public void check()
	{
		Administration a=new Administration();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the library access password:");
		int rpass=s.nextInt();
		int password=123;
		if(rpass==password)
		{
			System.out.println("\nDo you want to see the administration staff?\n1:YES\n2:NO");
			int choice=s.nextInt();
			if(choice==1)
			{
				Staff st=new Staff();
				st.show();
			}
			System.out.println("\nDo you want to enter the administration?\n1:YES\n2:NO");
			choice=s.nextInt();
			if(choice==1)
			{
				a.admin();
			}
		}
		else
		{
			System.out.println("Wrong password, access denied.");
		}
	}
}