import java.util.*;
import java.lang.*;
/*
10. Write a program that accepts a number as input and convert them into binary, octal and
hexadecimal equivalents. 
*/
public class prac {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toHexString(n));
        System.out.println(Integer.toOctalString(n));
    }
}
