package com.dp.lcs;

public class PrintLcs {
    /*
     * Given two String find the longest sequence between them:
     * S1="abcdf"
     * S2="abd"
     * Result=>3
     * */

    public String  lcs(String s1,String s2)
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

        int i=dp.length-1;
        int j=dp[0].length-1;
        StringBuilder stringBuilder=new StringBuilder();
        while(i>0 && j>0)
        {
            if(s1.charAt(i-1)==s2.charAt(j-1))
            {
                stringBuilder.append(s1.charAt(i-1));
                i--;
                j--;

            }
            else {
                if(dp[i-1][j]>dp[i][j-1])
                {
                    i--;
                }
                else
                {
                    j--;
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        PrintLcs printLcs= new PrintLcs();
        String result=printLcs.lcs("abcdef","bcfg");
        System.out.println(result);
    }
}
