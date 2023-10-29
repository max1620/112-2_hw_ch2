package hw_ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
public class P19_P21 {	//P19
	
	public static void main(String[] args)throws IOException
	{
		System.out.println("請問你是男生嗎?");
		System.out.println("請輸入Y或N");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String string = br.readLine();
		char letter = string.charAt(0);
		
		if(letter == 'Y' || letter == 'y')
		{
			System.out.println("你是男生啊!");
		}
		else if(letter == 'N' || letter == 'n')
		{
			System.out.println("妳是女生啊!");
		}
		else 
		{
			System.out.println("請輸入Y或N");
		}
	}
}
*/

public class P19_P21 {	//P21
	
	public static void main(String[] args)throws IOException
	{
		System.out.println("請問要選擇哪條路線?");
		System.out.println("請輸入整數");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		char ans = (res == 1)?'A':'B';
		
		System.out.println("選擇了"+ ans +"路線");
	}
}
