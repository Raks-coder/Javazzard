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
//Program to check prime number
    public static void main(String args[])
    {
    Scanner sc =new Scanner(System.in);
    int a= sc.nextInt();
    boolean prime=true;
    for(int i=2;i<a;i++)
    {
        if(a%i==0)
        {
            prime=false;
        }
    }
   if(prime==false)
   {
       System.out.println("No");
   }
   else
   {
       System.out.println("Yes");
   }

}
}