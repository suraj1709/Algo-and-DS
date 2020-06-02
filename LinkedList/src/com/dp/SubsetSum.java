package com.dp;

public class SubsetSum {
    public boolean subsetSum(int val[],int sum)
    {
        boolean[][] arr= new boolean[val.length+1][sum+1];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(i==0)
                {
                    arr[i][j]=false;
                }
                if(j==0){
                    arr[i][j]=true;
                }
            }
        }
        for(int i=1;i<arr.length;i++)
        {
            for(int j=1;j<arr[0].length;j++)
            {
                if(j-val[i-1]>=0)
                {
                    arr[i][j]=(arr[i-1][j]) || (arr[i-1][j-val[i-1]]);
                }
                else
                {
                    arr[i][j]=arr[i-1][j];
                }
            }
        }
        return arr[val.length][sum];
    }

    public static void main(String[] args) {
        int wt[]={1,2,3,4};
        int val[]={4,8,9,2};
        int W=5;
        SubsetSum subsetSum= new SubsetSum();
        boolean result=subsetSum.subsetSum(wt,W);
        System.out.println(result);
    }
}
