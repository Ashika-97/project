package geeks;

public class Totaldecoding {
	
		 static int mul=0,days=0;
		     int noOfDays(int d1, int m1, int y1, int d2, int m2, int y2) {
		        // code here
		        int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
		        int leaps=0;
		        int n1=(y1*365)+d1;
		        for(int i=0;i<m1-1;i++){
		               n1=n1+month[i];
		           }
		           
		        int n2=(y2*365)+d2;
		        for(int i=0;i<m2-1;i++)
		        {
		           n2=n2+month[i];
		         }
		        if(y1<=y2)
		        {
		           leaps=leaps+leap(m1,m2, y1,y2);
		         }
		        else
		        {
		           leaps=leaps+leap(m2,m1, y2,y1);  
		        }
		        if(n2>=n1)
		        {
		           return n2-n1+leaps;
		         }
		         return n1-n2+leaps;
		    }
		    public  int leap(int m1,int m2,int y1,int y2){
		        int l=0;
		        if(m1>2)
		        {
		            y1++;
		        }
		        if(m2<=2)
		        {
		            y2--;
		        }
		        for(int i=y1;i<=y2;i++)
		        {
		            if((i%4==0&&i%100!=0)||(i%400==0)){
		                l=l+1;
		            }
		        }
		        return l;
		    }
		
	

public static void main(String[] args) {
	Totaldecoding total=new Totaldecoding();
	 System.out.println(total.noOfDays(10,2,2014,10,3,2015));
}
}

















 /*      String s="123";
		int n = s.length();
		char str[] = s.toCharArray();
		
		long mod = 1000000007;
		
		long dp[] = new long [n+1];
		
		dp[0] = dp[1] = 1;
		
		for(int i = 1; i < n; i++){
			if(str[i] == '0' && str[i-1] > '2')
				System.out.println(0);
		}
		
		for(int i = 2; i <= n; i++){
			if(str[i-1] > '0')
				dp[i] = dp[i-1];
		
			if(str[i-2] == '1' || (str[i-2] == '2' && str[i-1] < '7'))
				dp[i] +=dp[i-2];
		
			dp[i] %= mod;
		}
		
		System.out.println((int)dp[n]);
   }
}  */    
      /* String str="123";
       if(str.charAt(0) == '0')
    	   {
    	   System.out.println(0);
    	   }
      
       int[] dp = new int[str.length()];
       dp[0] = 1;
       for(int i = 1; i < str.length(); i++) 
       {
           if(str.charAt(i) == '0' && str.charAt(i - 1) == '0') 
           {
               dp[i] = 0;
           } 
           
           else if (str.charAt(i) == '0' && str.charAt(i - 1) != '0') 
           {
               if(str.charAt(i - 1) == '1' || str.charAt(i - 1) == '2')
               { 
            	   dp[i] = i >= 2 ? dp[i - 2] % 1000000007: 1;
               
               }
            }
             else if (str.charAt(i) != '0' && str.charAt(i - 1) == '0') 
             {
               dp[i] = dp[i - 1] % 1000000007;
           }  
             else
             {
               if(Integer.parseInt(str.substring(i - 1, i + 1)) <= 26) {
                   dp[i] = i >= 2 ? dp[i - 2] % 1000000007 : 1;
               }
               dp[i] = (dp[i] % 1000000007 + dp[i - 1] % 1000000007);
           }
       }
 
      System.out.println(dp[str.length() - 1] % 1000000007);
}
}
 
*/