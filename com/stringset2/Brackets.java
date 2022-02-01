package com.stringset2;

import java.util.*;

public class Brackets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="()[]{}";
		Stack<Character> st=new Stack<Character>();
         for(int i=0;i<s.length();i++)
         {
        	 char ch=s.charAt(i);
        	 if(ch=='(' || ch=='[' || ch=='{')
        		 {
        		 st.push(ch);
        		 }
        	  
        	       	
        	 else if((ch==')' && st.peek()=='(') || (ch==']' && st.peek()=='[') || (ch=='}' && st.peek()=='{'))
        			st.pop();
        	 else
        		st.push(ch);
        	 
        	 
         }
         System.out.println(st.empty());
	}
}