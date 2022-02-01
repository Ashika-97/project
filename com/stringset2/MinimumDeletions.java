package com.stringset2;

public class MinimumDeletions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String S="aebcbda";
		 int n = S.length();
	        int[][] dp = new int[n][n];
	        for(int i = 0;i<n;i++){
	            dp[i][i] = 1;
	        }
	        
	        for(int k=1;k<=n;k++){
	            for(int i=0;i<n-k+1;i++){
	                int j = i+k-1;
	                if(k==1){
	                    dp[i][j] = 1;
	                }else{
	                    if(S.charAt(i) == S.charAt(j)){
	                        dp[i][j] = dp[i+1][j-1] + 2;
	                    }else{
	                        dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
	                    }
	                }
	                
	            }
	        }
	        System.out.println(n - dp[0][n-1]);
	    
	}

}
