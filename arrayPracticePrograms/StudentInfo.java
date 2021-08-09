package arrayPracticePrograms;

import java.util.Scanner;

public class StudentInfo 
{
	int id;
	String name;
	double marks;
	public StudentInfo(int id,String name,double marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public String toString()
	{
		return "Id is: "+id+" "+"name is: "+name+" "+"marks are:"+marks;
	}
}
