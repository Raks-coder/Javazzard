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
        StringBuffer sb= new StringBuffer("Rakshit is trying his level Best. God Please Help!!");
        int len=sb.length();
        for(int i=0;i<len;i++)
        {
         char c=sb.charAt(i);
         if(c>='a' && c<='z')
         {
             int offset=c-'a';
             c= (char)('A'+offset);
         }
         else if( c>='A' && c<='Z')
         {
             int offset=c-'A';
             c= (char) ('a'+offset);
         }
         sb.setCharAt(i,c);
        }
        System.out.println(sb);
    }
}