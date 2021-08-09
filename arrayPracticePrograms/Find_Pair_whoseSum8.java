package arrayPracticePrograms;

import java.util.Scanner;

public class Find_Pair_whoseSum8 
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
		int sum=8;
		for(int x=0;x<=a1.length-1;x++)
		{
			for(int y=0;y<=a1.length-1;y++)
			{
				int tsum=a1[x]+a1[y];
				if(tsum==sum&& x!=y)
				{
					System.out.println(" ["+a1[x]+","+a1[y]+"]");
				}
			}
		}
	}
}
