/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author rakshitmalhotra
 */
import java.io.*;
import java.lang.*;
import java.util.*;
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Use of equals and == in strings
//        String str="Hello";
//        String str1=new String(str);
//        System.out.println(str==str1);
//        System.out.println(str.equals(str1));
        //Use of compareTo() method
//      Scanner sc= new Scanner(System.in);
//      String str= sc.nextLine();
//      String tocomp="Dhoni";
//      if(str.equals(tocomp))
//      {
//          System.out.print("Thala");
//      }
//      else System.out.println("virat is the boss");
//    }
//    Scanner sc= new Scanner(System.in);
//    String str=sc.nextLine();
//    boolean flag=true;
//    int length=str.length();
//    for(int i=0;i<length;i++)
//    {
//        if(str.charAt(i)==str.charAt(length-i-1))
//        {
//            flag=true;
//        }
//        else flag=false;
//    }
//        if(flag==true)System.out.println("yes");
//        else System.out.println("No,mm");
//    
    Scanner sc= new Scanner(System.in);
    String str=sc.nextLine();
    str=str.toLowerCase();
    String str1=sc.nextLine();
    if(str.contains(str1))
    {
        System.out.println(str.indexOf(str1));
    }
    else System.out.println(-1);

    }
}
