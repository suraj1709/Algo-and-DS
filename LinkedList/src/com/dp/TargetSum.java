package com.dp;

public class TargetSum {
    public int targetSum(int val[],int sum)
    {
        int count=0;
        for(int i=0;i<val.length;i++)
        {
            count+=val[i];
        }
        int s1=(count+sum)/2;
        return subsetCount(val,s1);

    }
    public int subsetCount(int val[],int sum)
    {
        int[][] arr= new int[val.length+1][sum+1];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(i==0)
                {
                    arr[i][j]=0;
                }
                if(j==0){
                    arr[i][j]=1;
                }
            }
        }
        for(int i=1;i<arr.length;i++)
        {
            for(int j=1;j<arr[0].length;j++)
            {
                if(j-val[i-1]>=0)
                {
                    arr[i][j]=(arr[i-1][j]) +(arr[i-1][j-val[i-1]]);
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
        int W=5;
        TargetSum targetSum= new TargetSum();
        int result=targetSum.targetSum(wt,W);
        System.out.println(result);
    }
}
