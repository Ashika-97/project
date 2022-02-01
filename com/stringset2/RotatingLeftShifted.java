package com.stringset2;

public class RotatingLeftShifted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s1="amazon";
          String s2="azonam";
          if(s1.length()==s2.length())
        	  System.out.println(true);

	      if(s1.length()!=s2.length())
	    	  System.out.println(false);
	      
	      s2+=s2;
	      int count=s2.indexOf(s1);
	      if(count==2 || count==s1.length()-2)
	      {
	    	  System.out.println(true);
	      }
	    
	
	
	}

}
