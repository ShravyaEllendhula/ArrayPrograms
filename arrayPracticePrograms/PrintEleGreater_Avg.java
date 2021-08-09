package arrayPracticePrograms;

import java.util.Scanner;

public class PrintEleGreater_Avg 
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
		int sum=0;
		for(int i=0;i<=a1.length-1;i++)
		{
			
			 sum=sum+a1[i];
		}
		 System.out.println(sum);
		 int avg=sum/a1.length;
		 System.out.println("avg of array is:"+avg);
		 System.out.println("elements greather then avg are :");
			for(int i=0;i<=a1.length-1;i++)
			{
				if(a1[i]>avg)
				{
					System.out.println(a1[i]);
				}
			}
	}
}
