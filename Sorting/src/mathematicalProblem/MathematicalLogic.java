package mathematicalProblem;

public class MathematicalLogic {

	
	public long numberOfPaths(int m,int n)
	{
		if(m==1 || n==1)
			 return 1;
		
		return numberOfPaths(m-1,n)+numberOfPaths(m,n-1);
	}
	public long square(int x)
	{
		int i=1;
		
		while(i*i <= x)
		{
			i++;
		}
		return i-1;
	}
	//3
	public boolean balancedStringNumber(String S)
	{
		int n=S.length()/2;
		int sum1=0,sum2=0;
		for(int i=0;i<n;i++)
		{
		sum1+=S.charAt(i)*1;
		sum2+=S.charAt(i+1+n)*1;
		}
		
		if(sum1 == sum2)
			 return true;
		
		else
			return false;
	}
	
	//4
	public boolean checkLucky(int n,int counter)
	{
		if( n % counter == 0)
			 return false;
		
		if(counter > n)
			 return true;
		
		n=n-n/counter;
		counter++;
		return checkLucky(n,counter);
		
	}
	public boolean isLucky(int n)
	{
		return checkLucky(n,2);
	}
	
	//5	
	
	public long isPalindrome(int n)
	{
		String val="";
		String rev="";
		
		while(n != 0)
		{
			long rem=n % 2;
			val+=rem;
			rev=rem+rev;
			n=n/2;
		}
		
		if(val.equals(rev))
			return 1;
		
		else
		    return 0;
	}
	
	//6
	public long oddNumberOfFactors(int N)
	{
		if(N == 0)
		    return 0;
		
		int i=1;
		int count=0;
		while(i*i <= N)
		{
			i++;
			count++;
		}
		return count;
	}
	//7
	public int openedDoors(int n)
	{
		
		return (int)Math.sqrt(n);
	}

	//8
	public int perfectSquare(int n)
	{
		if(n == 1)
			return 0;
		
		int val=1;
		for(int i=2;i <= Math.sqrt(n);i++)
		{
			if(n % i == 0)
			{
			val+=i;
			val+=n/i;
			}
		}
		
		return val == n? 1:0;
	}
	
	//9
	public String isSquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) 
		{
			if(x1==x3 && y1==y3 && x2==x4  && y2== y4)
				return "N0";
			
			
			if(Math.abs(x1-x3) == Math.abs(x2-x4) && Math.abs(y1-y3) == Math.abs(y2-y4))
				return "Yes";
			
		
		
		return "No";
		}
	//10
	public long getVol(int P,int A)
	{
		float l=(float) ((P -Math.sqrt(P*P -24*A))/12);
		long v=(long) (l*(A/2.0 -l *(P/4.0-l)));
		
		
		return v;
	}
	//11
	public int circleTour(int[] petrol,int[] distance)
	{
		int front=0,rear=0,ans=0;
		
		for(int i=0;i< petrol.length;i++)
		{
			front+=petrol[i]-distance[i];
			
			if(front < 0)
			{
				rear=rear+front;
				ans=i+1;
				front=0;
			}
		}
		
		if(front + rear >= 0 )
			return ans;
		
		return -1;
	}
	
	
	//12
	public Long isPowerOfAnother(Long X, Long Y)
	{
		if( X == 1)
			 return (long)0;
		
		int power=1;
		
		
		
		while(power < Y)
			 power *= X;
		
		
		if(power == Y)
			 return (long)1;
		else 
			return (long)0;
	}
	//13
	public boolean checkPrime(int N)
	{
		if(N == 0)
			 return false;
	
	for(int i=2;i<= Math.sqrt(N);i++)
	{
		if(N % i == 0)
		   return false;
	}
	return true;
	
	
	}
	
	
	
	
	
	public int twistedPrime(int n)
	{
	
		int val=n;
		int ans=0;
		while(n > 0)
		{
		ans=ans*10+n%10;
		n=n/10;
		}
		if(checkPrime(ans) == true && checkPrime(val) == true)
		{
			return 1;
		}
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
