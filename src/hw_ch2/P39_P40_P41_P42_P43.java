package hw_ch2;

import java.lang.reflect.Array;
/*
public class P39_P40_P41_P42_P43 {	//P40
	
	public static void main(String[] args)
	{
		int[]intArray = (int[])Array.newInstance(int.class,3);
		
		Array.set(intArray, 0, 123);
		Array.set(intArray, 1, 456);
		Array.set(intArray, 2, 789);
		
		System.out.println("intArray[0]="+ Array.get(intArray,0));
		System.out.println("intArray[1]="+ Array.get(intArray,1));
		System.out.println("intArray[2]="+ Array.get(intArray,2));
		
 	}
}
*/

/*
public class P39_P40_P41_P42_P43 {	//P41
	
	public static void main(String[] args)
	{
		int[]test = new int[5];
		
		test[0] = 80;
		test[1] = 60;
		test[2] = 23;
		test[3] = 50;
		test[4] = 76;
		
		test[10] = 75;
		
		for(int i=0; i<5; i++)
		{
			System.out.println("第"+(i+1)+"個人的分數是"+test[i]+"分");
		}
 	}
}
*/

/*
public class P39_P40_P41_P42_P43 {	//P42
	
	public static void main(String[] args)
	{
		int[]test = {80,60,22,54,76};

		for(int i=0; i<5; i++)
		{
			System.out.println("第"+(i+1)+"個人的分數是"+test[i]+"分");
		}
 	}
}
*/


public class P39_P40_P41_P42_P43 {	//P43
	
	public static void main(String[] args)
	{
		int[]test = {80,60,22,54,76};

		for(int i=0; i<test.length; i++)
		{
			System.out.println("第"+(i+1)+"個人的分數是"+test[i]+"分");
		}
		
		System.out.println("考試人數為"+test.length+"人");
 	}
}

