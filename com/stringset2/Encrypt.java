package com.stringset2;

import java.util.*;

public class Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="aaaaaaaaaaa";
        ArrayList<Character> charKeys=new ArrayList<>();
        ArrayList<String> charValues=new ArrayList<>();
        int j=0;
         while(j!=S.length())
          {
             int count=0;
             char present=S.charAt(j);
             while(S.charAt(j)==present)
             {
                count++;
                j++;
              if(j==S.length())
                break;
             }
             charKeys.add(present);
             charValues.add(Integer.toHexString(count));
         }
        String finalString="";
       for(int k = (charKeys.size()-1); k >=0; k--)
        {
          finalString=finalString+charValues.get(k);
          finalString=finalString+charKeys.get(k);
        }
        System.out.println(finalString);

	}

}
