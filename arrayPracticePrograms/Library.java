package arrayPracticePrograms;

import java.util.Scanner;

public class Library 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int tempPages=0;
		String temp=null;
		Book[] b1=new Book[5];
		b1[0]=new Book(12,"java");
		b1[1]=new Book(33,"html");
		b1[2]=new Book(87,"oops");
		b1[3]=new Book(56,"sql");
		b1[4]=new Book(99,"psql");
		System.out.println("enter "+b1.length+" book names");
		String S1[]=new String[b1.length];
		for(int i=0;i<=S1.length-1;i++)
		{
			S1[i]=sc.nextLine();
		}
		for(int i=0;i<=S1.length-1;i++)
		{
			for(int j=i+1;j<=S1.length-1;j++)
			{
				if(S1[i].compareTo(S1[j])>0)
				{
					temp=S1[i];
					S1[i]=S1[j];
					S1[j]=temp;
				}
			}
		}
		System.out.println("sorted Books are:");
		for(int i=0;i<=S1.length-1;i++)
		{
				System.out.println(S1[i]+" ");
		}
			
	}
}
	
		 


