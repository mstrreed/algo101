package com.company;

import java.util.Scanner;

public class subset_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        subset("",s);
    }
    public static void subset(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        subset(up.charAt(0)+p,up.substring(1));
        subset(p,up.substring(1));
    }
}
