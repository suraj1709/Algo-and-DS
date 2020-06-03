package com.dp.KnapSack;

public class Knapsack {
    public int maxProfit(int wt[],int val[],int W)
    {
        int[][] arr= new int[wt.length+1][W+1];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(i==0 || j==0)
                {
                    arr[i][j]=0;
                }
            }
        }
        for(int i=1;i<arr.length;i++)
        {
            for(int j=1;j<arr[0].length;j++)
            {
                if(j-wt[i-1]>=0)
                {
                    arr[i][j]=Math.max(arr[i-1][j],val[i-1]+arr[i-1][j-wt[i-1]]);
                }
                else
                {
                    arr[i][j]=arr[i-1][j];
                }
            }
        }
        return arr[wt.length][W];
    }

    public static void main(String[] args) {
        int wt[]={1,2,3,4};
        int val[]={4,8,9,2};
        int W=5;
        Knapsack knapsack= new Knapsack();
        int result=knapsack.maxProfit(wt,val,W);
        System.out.println(result);
    }
}
