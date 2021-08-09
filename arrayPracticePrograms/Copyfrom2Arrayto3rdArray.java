package arrayPracticePrograms;

import java.util.Scanner;

public class Copyfrom2Arrayto3rdArray 
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter array1 size");
	int size=s.nextInt();
	int a1[]=new int[size];
	System.out.println("enter array1 elemnts");
	for(int i=0;i<=a1.length-1;i++)
	{
		a1[i]=s.nextInt();
	}
	System.out.println("enter array2 size");
	int size2=s.nextInt();
	int a2[]=new int[size2];
	System.out.println("enter array2 elemnts");
	for(int i=0;i<=a2.length-1;i++)
	{
		a2[i]=s.nextInt();
	}
	int a3[]=new int[a1.length+a2.length];
	for(int i=0;i<=a1.length-1;i++)
	{ 
		 a3[i]=a1[i];	
	}
	int k=a1.length;
	for(int j=0;j<=a2.length-1;j++)
	{
		a3[k]=a2[j];
		k++;
	}
	System.out.println("displaying array1 elements");
	for(int x:a1)
	{
		System.out.println(x);
	}
	System.out.println("displaying array2 elements");
	for(int y:a2)
	{
		System.out.println(y);
	}
	System.out.println("displaying array3 elements");
	for(int z:a3)
	{
		System.out.println(z);
	}
	}
}
