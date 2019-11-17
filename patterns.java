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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//         for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=(n-1);i>=1;i--)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        

Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=n-1;j>=i;j--)
//            {
//                System.out.print(" ");
//            }                                                 //>
//            for(int k=1;k<=i;k++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i=1;i<=n;i++)
//        {
//            for(int k=1;k<=i;k++)
//            {
//                System.out.print(" ");                        //< 
//            }
//            for(int j=n-1;j>=i;j--)
//            {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }


//        for(int i=1;i<=n;i++)
//        {
//            for(int j=n;j>i;j--)
//            {
//                System.out.print(" ");                            //pyramid pattern
//            }
//            for(int k=1;k<=i;k++)
//            {
//                System.out.print(" *");
//            }
//            System.out.println();
//            
//        }



//   *
//  ***
// *****
//*******

//for(int i=1;i<=n;i++)
//{
//    for(int j=1;j<=n-i;j++)
//    {
//        System.out.print(" ");
//    }
//    for(int k=1;k<=((2*i)-1);k++)
//    {
//        System.out.print("*");
//    }
//    System.out.println();
//}

//   *
//  ***
// *****
//*******
// *****
//  ***
//   *

//for(int i=1;i<=n;i++)
//{
//    for(int j=1;j<=n-i;j++)
//    {
//        System.out.print(" ");
//    }
//    for(int k=1;k<=((2*i)-1);k++)
//    {
//        System.out.print("*");
//    }
//    System.out.println();
//}
//for(int i=1;i<=n;i++)
//{
//    for(int j=1;j<=i;j++)
//    {
//        System.out.print(" ");
//    }
//    for(int k=(2*(n-1)-i);k>=i;k--)
//    {
//        System.out.print("*");
//    }
//    System.out.println();
//}
//*
// *
//  *
//
//for(int i=1;i<=n;i++)
//{
//    for(int j=1;j<=i-1;j++)
//    {
//        System.out.print(" ");
//    }
//    System.out.print("*");
//    System.out.println();
//}
//  *
// *
//*
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=n-i;j++)
    {
        System.out.print(" ");
    }
    System.out.print('*');
    System.out.println();
}
//   *
//  * * 
// *   *
//*     *
//

//*       *
// *     *
//  *   *
//   * *
//    *
for(int i=1;i<=n;i++)
{
    for(int j=1;j<=i-1;j++)
    {
        System.out.print(" ");
    }
    System.out.print("*");
    for(int l=1;l<=n-i;l++)System.out.print(" ");
    if(n-1>i)
    {
        for(int k=n-2;k>=i;k--)
        {
            System.out.print(" ");
        }
    }
    if(i!=n)
    {
        System.out.print("*");
    }

    System.out.println();
}







  }
    
    
}
