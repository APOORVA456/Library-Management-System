import java.util.*;
public class Staff extends Administration
{
	public void show()
	{
		Admin ad=new Admin();
		ad.show();
		Librarian lb=new Librarian();
		lb.show();
	}
}