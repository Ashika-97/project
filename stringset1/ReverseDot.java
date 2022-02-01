package stringset1;

import java.util.*;

public class ReverseDot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String input="i.like.this.very.much";
          Stack stack=new Stack();
          String s="";
          int num=input.length();
          int i=0;
          while(i<num)
          {
        	  while(i<num && input.charAt(i)!='.')
        	  {
        		  stack.push(input.charAt(i));
        		  i++;
        	  }
        	  while(!stack.isEmpty())
        	  {
        		  stack.peek();
        		  s+=stack.pop();
        		  
        	  }
        	  if(i<num)
        	  {
        		  s+='.';
        		  i++;
        	  }
          }
          System.out.println(s);
        	 
          }

}
