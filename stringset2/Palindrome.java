package com.stringset2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String str="bcad";
            StringBuilder sbr = new StringBuilder(str);
            
            StringBuilder sbr1 = sbr.reverse();
            String reverse = sbr1.toString();
            
            if (str.equals(reverse)){
            	System.out.println(0);
            } else {
                int size = str.length();
                char ch[] = str.toCharArray();
                int dp[][] = new int[size][size];
                
                for (int g = 0; g < size; g++) {
                    for (int i=0 , j=g; j<dp.length; i++, j++) {
                       
                        if (i > j) {
                            dp[i][j] = 0;
                        } else if (i == j) {
                            dp[i][j] = 1;
                        } else if (ch[i]==ch[j]) {
                            dp[i][j] = dp[i+1][j-1] + 2;
                        } else if (ch[i] != ch[j]) {
                            dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                        }

                    }
                }
            
               
                int x = size - dp[0][size - 1];
                
                System.out.println(x);
            }
        
	}

}
