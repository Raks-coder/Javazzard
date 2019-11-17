/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*## Printing the pattern 3 ##
* * * * *
* * * *
 * * *
 * *
  *
 * *
 * * *
* * * *
* * * * *  */

import java.io.*;
import java.util.*;
import java.lang.*;
public class hourglass {
   public static void main(String args[])
   {

    Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
           if(i>1){
           for(int j=1;j<=i-1;j++)
           {
               System.out.print(" ");
           }
           }
           for(int k=n;k>=i;k--) System.out.print("* ");
           System.out.println();
       }
       for(int i=2;i<=n;i++)
       {
           if(i>1){
           for(int j=n-1;j>=i;j--)
           {
               System.out.print(" ");
           }
           }
          for(int k=1;k<=i;k++) System.out.print("* ");
           System.out.println();
       }
}
}

