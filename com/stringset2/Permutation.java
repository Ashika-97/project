package com.stringset2;

import java.util.Arrays;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1="aob";
       String s2="ebiobadfoo";
       s1 = sort(s1);
       int size = s1.length();
       int l = 0, r = size - 1;
       String s;
       while(r < s2.length()){
            s = sort(s2.substring(l,r+1));
           if(s.equals(s1))
              System.out.println(true);
           
           l++;
           r++;
       }
       return;
   }
   public static String sort(String s) {
       char[] t = s.toCharArray();
       Arrays.sort(t);
       return new String(t);
	}

}
