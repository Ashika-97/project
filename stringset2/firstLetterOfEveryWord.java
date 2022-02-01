package com.stringset2;

public class firstLetterOfEveryWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="lo tink very ";
         String result="";
       for(String S:s.split(" "))
       {
    	   result+=S.charAt(0);
       }
       
       System.out.println(result);
	}  	
}
