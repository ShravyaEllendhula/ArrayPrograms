package arrayPracticePrograms;

import java.util.Scanner;

public class DoubleArray1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		double[] d1=new double[size];
		System.out.println("enter array element");
		for(int i=0;i<=d1.length-1;i++)
		{
			d1[i]=sc.nextDouble();
		}
		for(int i=0;i<=d1.length-1;i++)
		{
		System.out.println(d1[i]);
		}	
		System.out.println("with for each loop");
		for(double j:d1)
		{
			System.out.println(j);
		}
	}
}
