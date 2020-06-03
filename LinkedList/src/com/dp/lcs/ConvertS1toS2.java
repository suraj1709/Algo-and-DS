package com.dp.lcs;

public class ConvertS1toS2 {
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
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return (s1.length()-dp[s1.length()][s2.length()])+(s2.length()-dp[s1.length()][s2.length()]);
    }

    public static void main(String[] args) {
        ConvertS1toS2 convertS1toS2= new ConvertS1toS2();
        int result=convertS1toS2.lcs("heap","pea");
        System.out.println(result);
    }
}
