package arrayPracticePrograms;

import java.util.Scanner;

public class DuplicateEliments 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter arry size");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("enter arry elements");
	for(int i=0;i<=a.length-1;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<=a.length-1;i++)
	{
		int count=0;
		for(int j=0;j<=a.length-1;j++)
		{
			if(a[i]==a[j])
			{
				count++;
			}
		}
		int status=0;
		for(int k=i;k>=0;k--)
		{
			if(a[i]==a[k])
			{
				status++;
			}
		}
		if(status==1&&count>1)
		{
			System.out.println(a[i]);
		}
	}
	}
}
