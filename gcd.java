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
import java.lang.Math;

public class JavaApplication4 {
//A strong number is a number in which the sum of the factorial of the digits
//is equal to the number itself.
    public static void main(String args[])
    {
    Scanner sc =new Scanner(System.in);
    int a= sc.nextInt();
    int b=sc.nextInt();
    int i=1;
    int greatest=0;
    while(i<a && i<b)
    {
        if(a%i==0 && b%i==0) greatest=i;
        i+=1;
    }
    System.out.print("GCD is "+ greatest);
    }
    

}