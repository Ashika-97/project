package mathematicalProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MathematicalProblemLogic {
 
	//1
	public int monthDaysCalculate(int d1,int m1,int y1,int d2,int m2,int y2)
	{
		int[] month= {31,28,31,20,31,30,31,31,30,31,30,31};
		int leaps=0;
		int n1=y1*365 + d1;
		for(int i=0;i< m1-1;i++)
		{
			n1=n1+month[i];
		}
		
		int n2=y2*365 + d2;
		
		for(int i=0;i< m2-1;i++)
		{
			n2=n2+month[i];
		}
		
		if(y1 <= y2)
		{
			leaps=leaps+leap(m1,m2,y1,y2);
		}
		else {
			leaps=leaps+leap(m1,m2,y1,y2);
		}
		
		if(n1 >= n2)
		{
			return n1-n2+leaps;
		}
		
			return n2-n1+leaps;
		
		
		
	}
	
	public int leap(int m1,int m2,int y1,int y2)
	{
		int k=0;
		if(m1 > 2)
		{
			y1++;
		}
		if(m2 <= 2)
		{
			y2--;
		}
		
		for(int i=y1;i<=y2;i++)
		{
			if(( i % 4 == 0 && i % 100 != 0)|| (i%400 == 0))
			{
				k=k+1;
			}
		}
		return k;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//10
	public String hexToBinary(String num) throws Exception
	{
		HashMap<Character,String> map=new HashMap<>();
		map.put('0',"0000");
		map.put('1',"0001");
		map.put('2', "0010");
		map.put('3', "0011");
		map.put('4', "0100");
		map.put('5', "0101");
		map.put('6', "0110");
		map.put('7', "0111");
		map.put('8', "1000");
		map.put('9', "1001");
		map.put('A', "1010");
		map.put('B', "1011");
		map.put('C', "1100");
		map.put('D', "1101");
		map.put('E', "1110");
		map.put('F', "1111");
		
		String bin="";
		char[] ch=num.toCharArray();
		for(int i=0;i<num.length();i++)
		{
		if(map.containsKey(ch[i]))
		{
			bin+=map.get(ch[i])+" ";
			
		}
		else {
			bin= "Invalid letters are given";
			return bin;
		}
		}
		return bin;
			
		
	}
	
	
	//8
	static int[] x= {-1,-1,-1, 0 , 0, 1, 1, 1};
	static int[] y= {-1,0, 1 ,-1 , 1,-1, 0, 1};
	 static int  res=0;int val=0;
	public int searchGrid(int N,int x,int y,int[] kx,int[] ky)
	{
		int[][] grid=new int[N][N];
		for(int i=0;i< kx.length;i++)
		{
			grid[kx[i]][ky[i]] =1;
		}
		grid[x][y]=2;
		
		for(int i=0;i< grid.length;i++)
		{
			for(int j=0;j<grid[0].length;j++) 
			{
		     queenPath(grid,i,j,2);
			}
		}
		 
	        return res;
	}
	
	
	
	public int queenPath(int[][] grid,int row,int col,int result)
	{
		if(grid[row][col] != result)
		{
			return 0;
		}
		
		for(int dir=0;dir<8;dir++)
		{
			int rd=row+x[dir],cd=col+y[dir],k;
			
			for(k=1;k<grid.length;k++)
			{
				if(rd < 0 || rd >= grid.length || cd < 0 || cd >= grid.length)
				{
					break;
				}
				if(grid[rd][cd] != 0)
				{
					break;
				}
				rd++;
				cd++;
				res++;
				
			}
		}
			
			return res;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//9
	public String binarytoHex(String input) throws Exception
	{
		HashMap<String,Character> map =new HashMap<>();
		map.put("0000", '0');
		map.put("0001", '1');
		map.put("0010", '2');
		map.put("0011", '3');
		map.put("0100", '4');
		map.put("0101", '5');
		map.put("0110", '6');
		map.put("0111", '7');
		map.put("1000", '8');
		map.put("1001", '9');
	    map.put("1010",'A');
	    map.put("1011",'B');
	    map.put("1100",'C');
	    map.put("1101",'D');
	    map.put("1110",'E');
	    map.put("1111",'F');
	
	    String inp="";
	    
	    for(int i=0;i< input.length();i++)
	    {
	    	char ch=input.charAt(i);
	    if(ch == '.')
	    {
	    	String[] res=input.split(".");
	    if(map.containsKey(res[i]))
	    {
	   
	    }}}
	   
	    return inp;
	    }
	
	    
	    public String binaryConvertion(char num)
	    {
	    	String  num1=String.valueOf(num);
	    	int n=Integer.parseInt(num1);
	    	
	    	 String binary ="";
	    	    while( n > 0) {
	    	       
	    	        binary =  (n % 2) + (binary);
	    	        n = n/2;
	    	    }
	    	    while(binary.length() < 4)
	    	    {
	    	    	binary="0"+binary;
	    	    }
	    	  
	    	    return binary;
	    }
	////
	
	
	//5
	public int palindromeNumbers(int n)
	{
		int count = 0;
		int val = 10;
		return isPalindrome(n, count, val);
	}

	public int isPalindrome(int n, int count, int val) {
		StringBuilder inp = new StringBuilder(val + "");
		String temp = inp.toString();
		if (count == n) {
			return --val;
		}
		if (temp.equals(inp.reverse().toString())) {
			return isPalindrome(n, ++count, ++val);
		}
		return isPalindrome(n, count, ++val);
	}
	
	
	//3
	
	public long largestNumberForming(int[] arr,int n)
	{
	  Arrays.sort(arr);
	  long num=arr[0];
	  for(int i=n-1;i>=0;i--)
	  {
		  num=num*10+arr[i];
	  }
	  return num;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//6
	public static int maxDivide(int n,int n1)
	{
		while( n  % n1 == 0)
		{
			n=n/n1;
		}
		return n;
	}
	
	public static int uglyChecking(int num)
	{
		num=maxDivide(num,2);
		num=maxDivide(num,3);
		num=maxDivide(num,5);
		
		if(num ==1 )
			  return 1;
		else
			return 0;
	}
	
	public  int uglyCount(int num)
	{
		int i=1;
		int count=1;
		while(num  >  count)
		{
			i++;
			if(uglyChecking(i) == 1)
			{
				 count++;
				}
		
			
		}
		return i;
	}
	
	
	//7
	public String divisibleBy8(int num)
	{
		ArrayList<String> list=new ArrayList<>();
		ArrayList<Integer> list1=new ArrayList<>();
		String val=num+"";
	    permuteDivisible(val,"",list);
	  
	    
	    
	    
		for(int i=0;i< list.size();i++)
		{
			String result=list.get(i);
			
			if(result.length() >= 2)
			{
				int num1=Integer.parseInt(result);
				if(num1 % 8 == 0)
				{  list1.add(num1);
				return "yes";
				}
			
			}
		}
			return "No";
	}
	public static void permuteDivisible(String inp,String num,ArrayList<String> list)
	{
		if(inp.length() == 0 || num != "")
		{
		list.add(num);	
		}
		
		for(int i=0;i< inp.length();i++)
		{
			char ch=inp.charAt(i);
			String res=inp.substring(i+1)+inp.substring(0,i);
			permuteDivisible(res,num+ch,list);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	//11
	public int nextGreaterNumber(int n,int d)
	{
		String val=n+"";
		String find=d+"";
		int max=Integer.MIN_VALUE;
		int i=val.indexOf(find);
		int a=1,b=0;
		String res=val.substring(i);
		System.out.println("the i is "+ i);
		for(;i<res.length()-1;i++)
		{ 
		 
		   if(res.charAt(i+1) > res.charAt(i) && a > b)
		   {
			   String ch=res.charAt(i+1)+"";
			   int ch1=Integer.parseInt(ch);
			   if(a<= ch1)
			   {
			   
			    String f=res.charAt(i)+"";
			    a=ch1;
			    b=Integer.parseInt(f);
			    max=Math.max(a, b);
			   }
		   }
		}
	
		
		
		return max;
	}
	

	
	
	
	
}
