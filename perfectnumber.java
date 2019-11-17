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
    //A perfect number is a number which is equal to the sum of its proper
//positive divisors.
    public static void main(String args[])
    {
    Scanner sc =new Scanner(System.in);
    int n= sc.nextInt();
    int sum=0;
    for(int i=1;i<n;i++)
    {
        if(n%i==0)
        {
            sum=sum+i;
        }
    }
    System.out.println(sum);
    if(sum==n)
    {
        System.out.println("Yes");
    }
    else 
    {
        System.out.println("No");
    }
    
    }
    

}