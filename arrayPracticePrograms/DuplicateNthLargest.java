package arrayPracticePrograms;

import java.util.Scanner;

public class DuplicateNthLargest 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int[] a1=new int[size];
		System.out.println("enter array elemnents: "+size);
		for(int i=0;i<=a1.length-1;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("enter nth greatest number");
		int n=sc.nextInt();
		int NthLarge=a1.length-n;
		for(int j=0;j<=a1.length-1;j++)
		{
			int count=0;
			for(int k=0;k<=a1.length-1;k++)
			{
				if(a1[j]>=a1[k]&&(j!=k))
				{
					count++;
				}
			}
			if(count==NthLarge)
			{
				System.out.println(a1[j]+" is "+n+" Largest element");
				break;
			}
		}
	}
}
