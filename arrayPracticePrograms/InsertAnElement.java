package arrayPracticePrograms;

import java.util.Scanner;

public class InsertAnElement 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int[] a=new int[size+1];
		System.out.println("enter array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter position");
		int pos=sc.nextInt();
		System.out.println("enter an element to insert");
		int newele=sc.nextInt();
		for(int i=size-1;i>=pos;i--)
		{
			a[i+1]=a[i];
		}
		a[pos]=newele;
		System.out.println("after inserting");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(a[size]);		
	}
	
}
