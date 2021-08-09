package arrayPracticePrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class StudenMain 
{
	public static void main(String[] args)
	{
		StudentInfo s1=new StudentInfo(12,"raja", 30.9);
		StudentInfo s2=new StudentInfo(13,"rani",90.8);
		ArrayList<StudentInfo> al1=new ArrayList<StudentInfo>();
		al1.add(0, s1);
		al1.add(1, s2);
		System.out.println(al1.get(1));
		System.out.println("***********");
		for(int i=0;i<=al1.size()-1;i++)
		{
		System.out.println(al1.get(i));
		}
		System.out.println("*********");
		Iterator i1=al1.iterator();
		while(i1.hasNext())
		{
			 StudentInfo ss=(StudentInfo)i1.next();  
			 System.out.println(ss.id+" "+ss.name+" "+ss.marks);
		}
	}
	
}
