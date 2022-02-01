package com.stringset2;
import java.util.*;
public class Isomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="aab";
		String s2="xxy";
		  Map<Character,Integer> hash=new HashMap<Character,Integer>();
		  Map<Character,Integer> hash1=new HashMap<Character,Integer>();
		  //Integer count=0;
		  for(int i=0;i<s1.length();i++)
		  {
			  if(!hash.containsKey(s1.charAt(i)))
				  {hash.put(s1.charAt(i), i);
			        //count++;
			        }
			  if(!hash1.containsKey(s2.charAt(i)))
			  {  hash.put(s2.charAt(i), i);
			 // count++;
			  }
			  
			  Integer b=hash.get(s1.charAt(i));
			  Integer c=hash1.get(s2.charAt(i));
			  
			  if(b!=c) {
				  System.out.println(false);
		          }
		  }
		  System.out.println(true);
		  
	}

}
