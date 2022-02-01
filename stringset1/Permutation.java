package stringset1;
import java.util.*;
public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          List<String>  list=new ArrayList<>();
		  String p="ABC";
		  char[] ch=p.toCharArray();
		  Arrays.sort(ch);
		  String newp=new String(ch);
		  permute("",newp,list);
		  System.out.println(String.valueOf(list));
		
	}
	
	public static void permute(String n,String inp,List<String> l)
	{
		if(inp.length()==0)
		{
			l.add(n);
			
			return;
		}
		
		for(int i=0;i<inp.length();i++)
		{
		
			permute(n+inp.charAt(i),inp.substring(0,i)+inp.substring(i+1),l);
		}
	}

}
