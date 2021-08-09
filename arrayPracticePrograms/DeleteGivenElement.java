package arrayPracticePrograms;

import java.util.Scanner;

public class DeleteGivenElement
{
	public static void main(String[] args)
	{
	int status=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter array size");
	int size=s.nextInt();
	int a[]	=new int[size];
	System.out.println("enter array elemnts");
	for(int i=0;i<=size-1;i++)
	{
		a[i]=s.nextInt();
	}
	System.out.println("enter an element to be deleted");
	int dele=s.nextInt();
	for(int i=0;i<=size-1;i++)
	{
		 if(a[i]==(dele))
		 {
			 status=1;
			 break;
			 
		 }
	}
	if(status==1)
	{
		int si=0;
		int size1=s.nextInt();
		int a2[]=new int[size1];
		for(int i=0;i<=a2.length-1;i++)
		{
			if(a[i]!=dele)
			{
			a2[i]=a[i];
			}
			else
			{
				si=i;
				break;
			}
		}
		for(int j=si;j<=a.length-1;j++)
		{
			a2[j]=a[j+1];
		}
		System.out.println("original array is:");
		for(int x:a)
		{
			System.out.println(x);
		}
		System.out.println("original array is:");
		for(int y:a2)
		{
			System.out.println(y);
		}
	}
	else
	{
		System.out.println("not found");
	}
	
}
}
