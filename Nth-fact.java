/*
1) Write Java Program
A number N is called a factorial number if it is the factorial of a positive integer. For example, the first few factorial numbers are 1, 2, 6, 24, 120, …
Given a number N, the task is to print all factorial numbers smaller than or equal to N.
Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains a number N as input.
Output:
For each test case, print all factorial numbers smaller than or equal to N in new line.
Constraints:
1<=T<=100
1<=N<=1018
 */
import java.util.*;
import java.lang.*;
import java.lang.Math;

public class JavaApplication4 {
//Program to check prime number
    public static void main(String args[])
    {
  Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t!=0)
    {
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print(fact(i)+" ");
        }
        System.out.println();
        t--;
    }
   }
   public static int fact(int a)
   {
     int factorial=1;
     while(a>0)
     {
         factorial=factorial*a;
         a--;
     }
     return factorial;
   }
    
