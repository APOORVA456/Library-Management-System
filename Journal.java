import java.util.*;
public class Journal extends Book
{
	String name,author;
	int ID;
	Journal(){}
	Journal(String name,String author,int ID)
	{
		this.name=name;
		this.author=author;
		this.ID=ID;
	}
}