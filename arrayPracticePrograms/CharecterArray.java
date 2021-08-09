package arrayPracticePrograms;

import java.util.Scanner;

public class CharecterArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		char[] ch=new char[size];
		System.out.println("enter array element");
		for(int i=0;i<=ch.length-1;i++)
		{
			ch[i]=sc.next().charAt(0);
		}
		System.out.println("Reversee order:");
		for(int i=ch.length-1;i>=0;i--)
		{
		System.out.println(ch[i]);
		}
	}
}
