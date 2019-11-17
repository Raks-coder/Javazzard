/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author rakshitmalhotra
 */
import java.util.*;
import java.lang.*;

public class JavaApplication4 {
//A strong number is a number in which the sum of the factorial of the digits
//is equal to the number itself.
    public static int fact(int a)
    {
        int fact=1;
        for(int i=a;i>=1;i--)
        {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[])
    {
    Scanner sc =new Scanner(System.in);
    int n= sc.nextInt();
    int temp=n;
    int rem,sum=0;
    while(n>0)
    {
        rem=n%10;
        sum=sum+fact(rem);
        System.out.println(sum);
        n/=10;
    }
    if(sum==temp)
    {
        System.out.print("Strong number");
    }
    else System.out.println("Not a Strong number");
    }
    

}