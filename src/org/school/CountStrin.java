package org.school;
import java.util.Map;
import java.util.HashMap;



public class CountStrin {
	public static void main(String[] args) {
		String s = "Micro Fine Enterprise Micro";
		String[] s1=s.split("");
		Map<String,Integer> m=new HashMap<>();
		for(String s2:s1)
		{
			if(m.containsKey(s2))
			{
				int x=m.get(s2);
				m.put(s2, x+1);
			}
			else
			{
				m.put(s2, 1);
				
			}
		}
		System.out.println(m);
	}

}
