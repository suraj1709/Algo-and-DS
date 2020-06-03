package com.dp.KnapSack;

public class MinimumSubset {
    public  int minimumSubsetSum(int val[])
    {
        int count=0;
        for(int i=0;i<val.length;i++)
        {
            count+=val[i];
        }
        boolean[][] arr = new boolean[val.length+1][count+1];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(i==0)
                {
                    arr[i][j]=false;

                }
                if(j==0)
                {
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
                    arr[i][j]=arr[i-1][j]||arr[i-1][j-val[i-1]];

                }
               else
                {
                    arr[i][j]=arr[i-1][j];
                }
            }

        }

        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr[0].length/2;i++)
        {
            if(arr[arr.length-1][i]==true)
            {
                min=Math.min(min,count-2*i);
            }

        }
        return min;

    }

    public static void main(String[] args) {
        int[] val={8,1,2,5,6};

        MinimumSubset minimumSubset= new MinimumSubset();
        int result=minimumSubset.minimumSubsetSum(val);
        System.out.println(result);
    }
}
