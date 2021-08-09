package arrayPracticePrograms;

public class College 
{ 
	public static void main(String[] args)
	{
		StudentInfo[] s1=new StudentInfo[4];
		s1[0]=new StudentInfo(34,"raja",67.9);
		s1[1]=new StudentInfo(36,"rani",67.8);
		s1[2]=new StudentInfo(39,"raja",67.7);
		s1[3]=new StudentInfo(38,"rani",67.6);
		for(int i=0;i<=s1.length-1;i++)
		{
			System.out.println(s1[i]);
		}
		System.out.println("for-each loop");
		for(StudentInfo ss:s1)
		{
			System.out.println(ss);
		}
		
	}
}
