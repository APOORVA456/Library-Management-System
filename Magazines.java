aimport java.util.*;
public class Magazines extends Book
{
	String name,author;
	int ID;
	Magazines(){}
	Magazines(String name,String author,int ID)
	{
		this.name=name;
		this.author=author;
		this.ID=ID;
	}
}