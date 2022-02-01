package com.stringset2;

import java.util.*;

public class Ipaddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="254.123.211";
		int dot = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)=='.') 
            	dot++;
        }
        if(dot != 3) 
        	System.out.println(false);
        
        int c = 0;
        String temp = "";
        HashSet<String> set  = new HashSet<String>();
        for(int i = 0; i <256; i++) {
            set.add(i+"");
        }
        for(int i = 0; i< s.length();i++){
            char ch  = s.charAt(i);
            if(ch != '.') 
            	temp += ch;
            else {
                if(set.contains(temp)) c++;
                temp = "";
        }
        
    }
    if(set.contains(temp))
    	c++;
        if(c==4) 
        	System.out.println(true);
        else
        System.out.println(false);
    

	}

}
