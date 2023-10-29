package hw_ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
public class P24_P26_P28_P30_P32_P34 {	//P24
	
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("第"+i+"次的迴圈");
		}
		System.out.println("迴圈結束");
	}
}
*/

/*
public class P24_P26_P28_P30_P32_P34 {	//P26
	
	public static void main(String[] args)
	{
		int i = 1;
		while(i<=5)
		{
			System.out.println("第"+i+"次的迴圈");
			i++;
		}
		System.out.println("迴圈結束");
	}
}
*/

/*
public class P24_P26_P28_P30_P32_P34 {	//P28
	
	public static void main(String[] args)
	{
		int i = 1;
		do 
		{
			System.out.println("第"+i+"次的迴圈");
			i++;
		}while(i<=5);
		
		System.out.println("迴圈結束");
	}
}
*/

/*
public class P24_P26_P28_P30_P32_P34 {	//P30
	
	public static void main(String[] args)
	{
		int i,j;
		for(i=0; i<5; i++)
		{
			for(j=0; j<3; j++)
			{
				System.out.println("i圈"+i+":j是"+j);
			}	
		}
	}
}
*/

/*
public class P24_P26_P28_P30_P32_P34 {	//P32
	
	public static void main(String[] args)throws IOException
	{
		System.out.println("請問要在第幾次處理結束會圈呢?(1~10)");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		for(int i=1; i<=10; i++)
		{
			System.out.println("第"+i+"次的處理");
			if(i == res)
				break;
		}
 	}
}
*/

public class P24_P26_P28_P30_P32_P34 {	//P34
	
	public static void main(String[] args)throws IOException
	{
		System.out.println("請問要跳過第幾次的處理呢?(1~10)");
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		for(int i=1; i<=10; i++)
		{
			if(i == res)
				continue;
			System.out.println("第"+i+"次的處理");

		}
 	}
}
