package com.company;

import java.util.Scanner;

public class skip_char {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String a=sc.nextLine();
        String str=sc.nextLine();
        System.out.println(skip(str));

    }
    public static String skip(String s)
    {
        int i=0;
        String ch="";
        if(s.equals("")==true)
        {
            return s;
        }
        if(s.charAt(i)=='a')
        {
            return ch=""+skip(s.substring(++i,s.length()));
        }
        return ch=s.charAt(i)+skip(s.substring(++i,s.length()));
    }
}0
