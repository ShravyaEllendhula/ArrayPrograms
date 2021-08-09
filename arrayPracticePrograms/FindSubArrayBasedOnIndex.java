package arrayPracticePrograms;

import java.util.Scanner;

public class FindSubArrayBasedOnIndex 
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
		System.out.println("array index are 0 to"+(a1.length-1));
		System.out.println("enter starting ");
		int si=sc.nextInt();
		System.out.println("enter the ending index....");
		int ei=sc.nextInt();
		int subarraysize=(ei-si+1);
		int [] a2=new int[subarraysize];
		int j=si;
		for (int i=0;i<=a1.length-1;i++)
		{
			a2[i]=a1[j];
			j++;
		}
		System.out.println("");
		for(int x:a1)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println();
		for(int y:a2)
		{
			System.out.print(y+" ");
		}
	}
}
