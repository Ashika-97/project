package stringset1;

import java.util.Scanner;

public class Remaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="looppollhoplj";
		char ch='o';
		int num=4;
		int count=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<name.length();i++)
        {
        	
          if(count==num)
          {
        	for(int j=i;j<name.length();j++)
        	{
        		sb.append(name.charAt(j));
        	}
        	break;
          }
           if(name.charAt(i)==ch)
               count++;
        }
        
        System.out.println(String.valueOf(sb));
        	
        	
        	
	}  	
        	
  }