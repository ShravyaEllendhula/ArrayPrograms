package arrayPracticePrograms;

public class Document1 
{
	private int id;
	private String fname;
	private String title;
	private int pages;
	public Document1(int id,String fname,String title,int pages)
	{
		this.id=id;
		this.fname=fname;
		this.title=title;
		this.pages=pages;
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getFname() 
	{
		return fname;
	}
	public void setFname(String fname) 
	{
		this.fname = fname;
	}
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public int getPages() 
	{
		return pages;
	}
	public void setPages(int pages) 
	{
		this.pages = pages;
	}
	@Override
	public String toString()
	{
		return "id is: "+this.id+" "+"fname is: "+this.fname+" "+"title is: "+this.title+" "+"pages are: "+this.pages;
	}
	
}
