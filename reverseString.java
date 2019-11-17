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
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringTokenizer st= new StringTokenizer(str);
        int count=0;
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
            count++;
        }
       // System.out.println(count);
        String [] arr= new String[count];
        int i=0;
        StringTokenizer st1= new StringTokenizer(str);
        while(st1.hasMoreTokens())
        {
            arr[i]=st1.nextToken();
            i++;
           // System.out.println(arr[i]);
        }
        for(int j=count-1;j>=0;j--)System.out.print(arr[j]+" ");

    }
}
