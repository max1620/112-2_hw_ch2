package hw_ch2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
public class P14_P15_P16 {	//P14
	
	public static void main(String[] args)throws IOException
	{
		System.out.println("請輸入整數:");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		switch(num)
		{
		case 1:
		{
			System.out.println("輸入的是1");
			break;
		}
		case 2:
		{
			System.out.println("輸入的是2");
			break;
		}
		default:
		{
			System.out.println("請輸入1或2");
			break;
		}
		}
	}
}
*/

/*
public class P14_P15_P16 {	//P15
	
	public static void main(String[] args)throws IOException
	{
		System.out.println("請輸入整數:");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		switch(num)
		{
		case 1:
		{
			System.out.println("輸入的是1");
		}
		case 2:
		{
			System.out.println("輸入的是2");
		}
		default:
		{
			System.out.println("請輸入1或2");
		}
		}
	}
}
*/

public class P14_P15_P16 {	//P16
	
	public static void main(String[] args)throws IOException
	{
		System.out.println("請輸入a或b:");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String string = br.readLine();
		char letter = string.charAt(0);//取索引值為0的字元
		
		switch(letter)
		{
		case 'a':
		{
			System.out.println("輸入的是a");
			break;
		}
		case 'b':
		{
			System.out.println("輸入的是b");
			break;
		}
		default:
		{
			System.out.println("請輸入a或b");
			break;
		}
		}
	}
}
