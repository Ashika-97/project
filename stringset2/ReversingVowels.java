package com.stringset2;
import java.util.*;
public class ReversingVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello every one hi";
		char[] ch=s.toCharArray();
		Set<Character> set=new HashSet<>();
		set.add('a');
		set.add('e');
		set.add('i');
		set.add('o');
		set.add('u');
		Stack<Character> st=new Stack<Character>();
		String res="";
		for(char c:ch)
		{
			if(set.contains(c))
				st.push(c);
				
		}
		for(int i=0;i<s.length();i++)
		{
			if(set.contains(s.charAt(i)))
					ch[i]=st.pop();
		}
		System.out.println(String.valueOf(ch));

	}

}
