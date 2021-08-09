package arrayPracticePrograms;

import java.util.Scanner;

public class UpdateElement 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("array index are from 0 to"+(a.length-1));
		System.out.println("enter index");
		int index=sc.nextInt();
		System.out.println("enter an element to update");
		int newele=sc.nextInt();
		for(int i=a.length-1;i>=index;i--)
		{
			a[index]=newele;
		}
		System.out.println("after update");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}	
	}
		
		
	
}
