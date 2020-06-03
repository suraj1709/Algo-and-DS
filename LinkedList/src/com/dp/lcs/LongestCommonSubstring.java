package com.dp.lcs;

public class LongestCommonSubstring {
    /*
     * Given two String find the longest sequence between them:
     * S1="abcdf"
     * S2="abd"
     * Result=>3
     * */

    public int  lcs(String s1,String s2)
    {
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=0;

                }
            }
        }
        for(int i=1;i<dp.length;i++)
        {
            for(int j=1;j<dp[0].length;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];

                }
                else
                {
                    dp[i][j]=0;
                }
            }
        }
        int max=0;
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                max=Math.max(max,dp[i][j]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LongestCommonSubstring longestCommonSubstring= new LongestCommonSubstring();
        int result=longestCommonSubstring.lcs("abcdef","bcfg");
        System.out.println(result);
    }
}
