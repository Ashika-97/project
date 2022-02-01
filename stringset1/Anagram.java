package stringset1;

import java.util.*;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String[] string_list= {"act" ,"hut","god","cat","dog"};
		  List<List<String>> list=new ArrayList<>();
		  HashMap<String,List<String>> hat=new HashMap<>();
		  for(String g: string_list)
		  {
			  char[] ch=g.toCharArray();
			  Arrays.sort(ch);
			  String input=Arrays.toString(ch);
			  if(hat.containsKey(input))
			  {
				  hat.get(input).add(g);
			  }
			  else
			  {
				  List<String> l=new ArrayList<>();
				  l.add(g);
				  hat.put(input, l);
			  }
		  }
		  for(String s:hat.keySet())
		  {
			  list.add(hat.get(s));
			 //System.out.println(hat.get(s));
		  }
		  System.out.println("the list is " +list);
		  }
}