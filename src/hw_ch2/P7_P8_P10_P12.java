package hw_ch2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
public class P7_P8_P10_P12 {	//P7
	
	public static void main(String[] args)throws IOException
	{
		System.out.println("請輸入整數:");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		if(num == 1)
		{
			System.out.println("輸入的是1");
			System.out.println("選擇的是1");
		}
		System.out.println("結束處理");
	}
}
*/

/*
public class P7_P8_P10_P12 {	//P8
	
	public static void main(String[] args)throws IOException
	{
		System.out.println("請輸入整數:");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		if(num == 1)
			System.out.println("輸入的是1");
			System.out.println("選擇的是1");
		
		System.out.println("結束處理");
	}
}
*/

/*
public class P7_P8_P10_P12 {	//P10
	
	public static void main(String[] args)throws IOException
	{
		System.out.println("請輸入整數:");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		if(num == 1)
		{
			System.out.println("輸入的是1");
		}
		else
		{	
			System.out.println("選擇的是1以外的數字");
		}
	}
}
*/

public class P7_P8_P10_P12 {	//P12
	
	public static void main(String[] args)throws IOException
	{
		System.out.println("請輸入整數:");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		if(num == 1)
		{
			System.out.println("輸入的是1");
		}
		else if(num == 2)
		{
			System.out.println("輸入的是2");
		}
		else
		{
			System.out.println("請輸入1或2");
		}
	}
}