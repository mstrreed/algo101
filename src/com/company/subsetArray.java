package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class subsetArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        System.out.println(subset("",s));
    }
    public static ArrayList<String> subset(String p,String up)
    {
        ArrayList<String> list1=new ArrayList<>();
        if(up.isEmpty())
        {
            list1.add(p);
            return list1;
        }
       ArrayList<String> ans = subset(up.charAt(0)+p,up.substring(1));
        list1.addAll(ans);
       ans=subset(p,up.substring(1));
        list1.addAll(ans);
        return list1;
    }
}


