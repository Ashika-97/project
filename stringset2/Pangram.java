package com.stringset2;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="abcdefghijklmnopqrstuvwxyz";
    String sentence="the qucik fox jumps over the bindw envup lazy dog";
    //String res="";
    int count=0;
    for(int i=0;i<s.length();i++)
    {
    	for(int j=0;j<sentence.length();j++)
    	{
    		if(s.charAt(i) == sentence.charAt(j)) {
    			count++;
    			break;
                
    		}
    		}
    	if(count!=i+1)
    		return;
    }
    System.out.println(count);
	}
}
