package stringset1;

import java.util.*;

public class Wordbreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
		String s="ilikesam";
		String[] str1={ "i", "like", "sam",
			"sung", "samsung", "mobile",
			"ice","cream", "icecream",
			"man", "go", "mango" };
		
		ArrayList<String> arr=new ArrayList<String>();
		for(int i=0;i<str1.length;i++)
		{
			arr.add(str1[i]);
		}
			
		System.out.println("the arr is" +arr);
		Set<String> set=new HashSet<>();
		for(String k:arr)
			set.add(k);
			
		if(s==null && set==null)
			System.out.println("1");
		
		if(s==null || set==null)
		{
			System.out.println("0");
		}
		boolean[] b=new boolean[s.length()+1];
		b[0]=true;
		for(int i=1;i<=s.length();i++)
		{
			for(int j=0;j<i;j++)
			{
				if(b[j] && set.contains(s.substring(j,i)))
				{
					b[i]=true;
					break;
				}
				
			}
		}
		if(b[s.length()])
		{	//System.out.println(b[s.length()]);
		System.out.println("result:1");}
		else
			System.out.println("result:0");
	}

}
