package arrayPracticePrograms;

import java.util.Scanner;

public class InsertEle
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
		System.out.println("enter an element to insert");
		int newele=sc.nextInt();
		int[] a2=new int[a.length+1];
		for(int i=0;i<=index-1;i++)
		{
			a2[i]=a[i];
		}
		a2[index]=newele;
		for(int j=index;j<=a.length-1;j++)
		{
			a2[j+1]=a[j];
		}
		System.out.println("before insertion");
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("after insertion");
		for(int y:a2)
		{
			System.out.print(y+" ");
		}
	}
}
