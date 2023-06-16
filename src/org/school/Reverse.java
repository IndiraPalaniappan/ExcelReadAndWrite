package org.school;
import java.util.*;

public class Reverse {
	public static void main(String[] args) {
		
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int a= s.nextInt();
	int i,j=0;
	while(a>0)
	{
		i=a%10;
		j=(j*10)+i;
		a=a/10;
	}
	System.out.println(j);
	
	}
}
