package stringset1;

import java.util.*;

public class PangramSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="the quick brown fox jumps overb  the lazy dog";
	     int len=name.length();
	     int k=3;
	     int count=0;
	     Set set=new HashSet();
	     for(int i=0;i<len;i++)
	     {
	    	 if(name.charAt(i)>='a' && name.charAt(i)<='z')
	    	 {
	    		 set.add(name.charAt(i));
	    		 count++;
	    	 }
	     }
	     if(count>=26 && 26-set.size()<=k)
	       System.out.println(true);
	     else
	    	 System.out.println(false);
}
}