package hw_ch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


/*
public class P45_P47_P49 {	//P45
	
	public static void main(String[] args)throws IOException
	{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("請輸入5個人的分數");
		int[]test = new int[5];

		for(int i=0; i<test.length; i++)
		{
			String str = br.readLine();
			test[i] = Integer.parseInt(str); 
		}
		
		for(int s=0;s<test.length-1;s++)//氣泡排序
		{
			for(int t=s+1;t<test.length;t++)
			{
				if(test[t]>test[s])
				{
					int temp = test[t];
					test[t] = test[s];
					test[s] = temp;		
				}
			}
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println("第"+(+1)+"名的分數是"+test[i]);
		}
 	}
}
*/

/*
public class P45_P47_P49 {	//P47
	
	public static void main(String[] args)throws IOException
	{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("請輸入5個人的分數");
		Integer test[] = new Integer[5];//傳址呼叫

		for(int i=0; i<test.length; i++)
		{
			String str = br.readLine();
			test[i] = Integer.parseInt(str); 
		}
		
		Arrays.sort(test,Collections.reverseOrder());
		
		for(int i=0;i<test.length;i++)
		{
			System.out.println("第"+(+1)+"名的分數是"+test[i]);
		}
 	}
}
*/


public class P45_P47_P49 {	//P49
	
	public static void main(String[] args)
	{
		int test[][] = new int[2][5];
		
		test[0][0] = 80;
		test[0][1] = 65;
		test[0][2] = 24;
		test[0][3] = 50;
		test[0][4] = 76;
		test[1][0] = 90;
		test[1][1] = 56;
		test[1][2] = 68;
		test[1][3] = 73;
		
		for(int i=0;i<test[1].length;i++)
		{
			System.out.println("第"+(i+1)+"個人的國語分數是"+test[0][i]+"分");
			System.out.println("第"+(i+1)+"個人的數學分數是"+test[1][i]+"分");
		}
 	}
}

