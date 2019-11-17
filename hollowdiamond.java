/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*## Printing the pattern 3 ##
Hollow diamond  */

import java.io.*;
import java.util.*;
import java.lang.*;
public class finprac {
   public static void main(String args[])
   {

    Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
          for(int k=1;k<=n-i;k++)
          {
              System.out.print(" ");
          }
          if(i==1){System.out.print(" *");System.out.println();}
          else{
          System.out.print("*");
          if(i>1){
          for(int j=2;j<=(2*i)-1;j++)
          {
              System.out.print(" ");
          }
          System.out.print("*");
          }
          System.out.println();
      }
          }
      for(int i=n-1;i>=1;i--)
      {
          for(int k=1;k<=n-i;k++)
          {
              System.out.print(" ");
          }
          if(i==1){System.out.print("*");System.out.println();}
          else{
          System.out.print("*");
          if(i>1){
          for(int j=2;j<=(2*i)-1;j++)
          {
              System.out.print(" ");
          }
          System.out.print("*");
          }
          System.out.println();
      }
      }
}
}

