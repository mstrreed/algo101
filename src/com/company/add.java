package com.company;

import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int carry =0;
        while(b!=0)
        {
            carry=a&b;
            a=a^b;
            b=(carry)<<1;
        }
        System.out.println(a,'');
    }
}
