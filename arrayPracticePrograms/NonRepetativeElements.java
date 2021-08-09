package arrayPracticePrograms;

import java.util.Scanner;

public class NonRepetativeElements
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
		if(count==1)
		{
			System.out.println(a[i]);
		}
	}
	}
}
