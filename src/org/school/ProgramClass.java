package org.school;
import java.io.*;
import java.util.*;

public class ProgramClass {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		/*int count=0;
		for(int i=0;i<=a;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even Number:"+i);
				count=count+1;
			}
			else
			{
				System.out.println("odd number:"+i);
			}
		}
	
		System.out.println(count);
	}
*/
		
		//factorial
		
		int count=1;
		for(int i=1; i<=a;i++)
		{
			count=count*i;
		}
		System.out.println(count);
}
}
