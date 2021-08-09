package arrayPracticePrograms;

public class Book 
{
	int pages;
	String title;
	public Book(int pages,String title)
	{
		this.pages=pages;
		this.title=title;
	}
	public String toString()
	{
		return pages+" "+title;
	}
}
