package com.stringset2;

public class CharRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="computer";
       String p="crp";
       String  ch="";
       String S="";
      for(int i=0;i<s.length();i++)
      {
    	  ch=""+s.charAt(i);
    	  if(!p.contains(ch))
    		  S+=s.charAt(i);
      }
      System.out.println(S);
	}
}
           
       
     /*  for(int i=0;i<s.length();i++)
       {
    	   ch=""+s.charAt(i);
    	   if(!p.contains(ch))
    		   S+=s.charAt(i);
    		   
       }
       System.out.println(String.valueOf(S));
	}
}*/
       
