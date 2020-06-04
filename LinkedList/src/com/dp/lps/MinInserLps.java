package com.dp.lps;

public class MinInserLps {
    public int  lcs(String s1)
    {
        StringBuilder s2=new StringBuilder();
        for(int i=s1.length()-1;i>=0;i--)
        {
            s2.append(s1.charAt(i));
        }
        s2.toString();
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
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return s1.length()-dp[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        MinInserLps minInserLps= new MinInserLps();
        int result=minInserLps.lcs("abcdba");
        System.out.println(result);
    }
}
