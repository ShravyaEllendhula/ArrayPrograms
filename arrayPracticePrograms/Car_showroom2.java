package arrayPracticePrograms;

import java.util.Arrays;

public class Car_showroom2 
{
	public static void main(String[] args)
	{
	Car [] c1=new Car[4];
	c1[0]=new Car(564,"benz",370,2.9);
	c1[1]=new Car(786,"audi",349,2.5);
	c1[2]=new Car(975,"bmw",190,5.9);
	c1[3]=new Car(123,"jagura",410,1.7);
	System.out.println("before sorting...");
	for(Car c:c1)
	{
		System.out.println(c);
	}
	Car temp;
	Arrays.sort(c1);
		System.out.println("after swapped.....");
	for(Car c:c1)
	{
		System.out.println(c);
	}
	}
}
