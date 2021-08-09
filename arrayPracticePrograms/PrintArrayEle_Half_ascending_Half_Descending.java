package arrayPracticePrograms;

import java.util.Scanner;

public class PrintArrayEle_Half_ascending_Half_Descending 
{
	public static void main(String[] args)

	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size =sc.nextInt();
		int [] a1=new int[size];
		System.out.println("enter the array elements....");
		for(int i=0;i<=a1.length-1;i++)
		{
			a1[i]=sc.nextInt();
		}
		int tempele=0;
		System.out.println("Array index are from 0 to"+(a1.length-1));
		for(int c=1;c<=a1.length-1;c++)
		{
			System.out.println("enter the ending index num");
			for (int i=0;i<=a1.length-1;i++)
			{
				if(a1[i]>a1[i+1])
				{
					tempele=a1[i];
					a1[i]=a1[i+1];
					a1[i+1]=tempele;
				}
			}
		}

	}
}
