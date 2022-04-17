package com.company;
import java.util.*;
public class Subset_bit {
    public static void main(String[] args) {
          int[] arr=new int[3];
          Scanner sc=new Scanner (System.in);
          for(int i=0;i<3;i++)
          {
              arr[i]=sc.nextInt();
          }
          set(arr);
    }
    public static void set(int [] arr1)
    {
        for(int i=0;i<(1<<arr1.length);i++)// loop for all 8 combinations
        {
            for(int j=0;j<arr1.length;j++)// loop for checking each bit in each combination seperately.
            {
                if((i&(1<<j))!=0)
                {
                    System.out.print(arr1[j]+" ");
                }
            }
        }
    }
}
