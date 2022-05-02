package com.company;

import java.util.Scanner;

public class unique_nums {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int [] arr1=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        find(arr1);
    }
    public static void find (int[] arr)
    {
        int sum=0;int one=0;int two=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum^arr[i];
        }
        int help=sum&~(sum-1);

        for(int j=0;j<arr.length;j++)
        {
            if((arr[j]&help)==1)
            {
                one=one^arr[j];
            }
            else
            {
                two=two^arr[j];
            }
        }
        System.out.println(one);
        System.out.println(two);

        }
}
