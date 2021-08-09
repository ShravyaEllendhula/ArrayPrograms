package arrayPracticePrograms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort1 
{
	public static void main(String[] args)
	{
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int a1[] =new int[size];
		System.out.println("enter array elments");
		for(int i=0;i<=a1.length-1;i++)
		{
			a1[i]=sc.nextInt();
		}
		System.out.println("before sorting");
		for(int x:a1)
		{
			System.out.print(x+" ");
		}
		//Arrays.sort(a1);
		for(int c=1;c<=a1.length-1;c++)
		{
			for(int i=0;i<=a1.length-2;i++)
			{
				if(a1[i]>a1[i+1])
				{
					temp=a1[i];
					a1[i]=a1[i+1];
					a1[i+1]=temp;
				}
						
			}
		}
		System.out.println("after sorting");
		for(int y:a1)
		{
			System.out.print(y+" ");
		}
		
	}
}
