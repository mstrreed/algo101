package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class subset_iterative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1=new int[n1];
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        List<List<Integer>> ans=subSequence(arr1);
        for(List<Integer> list:ans)
        {
            System.out.print(list+",");
        }
    }

    static List<List<Integer>> subSequence(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}


