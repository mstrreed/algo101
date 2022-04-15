package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(gcd(num1,num2));
    }
    public static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
}
