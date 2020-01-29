/*
 * 11. Write a program to i) append a string ii) insert a string iii) delete a portion of the
string. 
 */
import java.util.*;
import java.lang.*;

public class string1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=sc.nextLine();
        System.out.println("Concatenated String: "+str+str1);
        int n=sc.nextInt();
        System.out.println("Inserted String: "+str.substring(0,n)+str1+str.substring(n,str.length()));
        System.out.println("Enter the position from where you want to delete the string");
        int del=sc.nextInt();
        System.out.println("New String: "+str.substring(0,del));
    }
}
