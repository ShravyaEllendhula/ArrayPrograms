package arrayPracticePrograms;

import java.util.Scanner;

public class FirstLargestElement
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter array elemnents: "+size);
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int j=0;j<=arr.length-1;j++)
		{
			if(arr[j]>max)
			{
			 max=arr[j];
			}
		}
		System.out.println("the first biggest number is: "+max);
		
	}
}
