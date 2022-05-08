package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class array_returrn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(ret(1,arr,0));
    }
    public static ArrayList<Integer> ret(int pro,int[] arr1,int n)
    {
        ArrayList<Integer> list1=new ArrayList<>();
        if(n==arr1.length)
        {
             list1.add((pro));
            return list1;


        }
        if(n!=arr1.length&&n!=0)
        {
            list1.add(pro);
        }
        ArrayList<Integer> ans=(ret((2*arr1[n]),arr1,++n));
        list1.addAll(ans);
        return list1;

    }
}
