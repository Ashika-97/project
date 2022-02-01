package com.stringset2;

public class CountAndSay {
	   
	public String countAndSay(int n) {
	         if(n==1)
	            return "1";
	        String str = "1";
	        n--;

	        while(n-->0)
	        {

	            int c = 1;
	            String ans = "";
	            int i=0;
	            for(i=0;i<str.length()-1;i++)
	            {
	                if(str.charAt(i)==str.charAt(i+1))
	                    c++;
	                else{
	                     ans = ans+c+""+str.charAt(i);
	        
	                     c = 1;
	                }     
	            }
	            
	            ans = ans+c+""+str.charAt(i);
	            str = ans;
	        }
	        
	        return str;
	        
	    
	    }
	   
	public static void main(String[] args) {
		CountAndSay cas=new CountAndSay();
		
		System.out.println(cas.countAndSay(5));

	}

}
