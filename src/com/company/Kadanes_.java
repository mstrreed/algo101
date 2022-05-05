package com.company;

import java.util.Scanner;

public class Kadanes_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println(max(arr));
    }
    public static int max(int[]arr1)
    {
       int maxSum=0;
       int currSum=0;
       for(int i=0;i<arr1.length;i++)
       {
           currSum=Math.max(currSum+arr1[i],arr1[i]);
           if(maxSum<currSum)
           {
               maxSum=currSum;
           }
       }
      return maxSum;
    }
}
