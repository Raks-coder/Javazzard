/*
Write a program that has a class Factor with a method boolean isFactor(int n, in m) that
checks if n is a factor of m. Write another class Divisibleby2 that derives Factor class.
Override the isFactor(n,m) method to find it is divisible by 2 or not. Write another class
Divisibleby3 that derives Factor class. Override the isFactor(n,m) method to find it is
divisible by 3 or not. Write a test method that creates object for 2 classes. Get a number n
from the user and check whether it is divisible by 6.
*/
import java.util.*;
import java.lang.*;
class Factor{
    boolean isFactor(int n, int m)
    {
        if(m%n==0) return true;
        else return false;
    }
}
class Divisibleby2 extends Factor
{
    boolean isFactor(int m)
    {
        int n=2;
        if (m%n==0) return true;
        else return false;
    }
}
class Divisibleby3 extends Factor
{
    
    boolean isFactor(int m)
    {
        int n=3;
        if (m%n==0) return true;
        else return false;
    }
}

class Test{
    static void test(int n)
    {
         Divisibleby2 d2=new Divisibleby2();
         Divisibleby3 d3=new Divisibleby3();
        if(d2.isFactor(n) && d3.isFactor(n)) System.out.println("Divisible by 6");
        else System.out.println("No");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        test(n);
    }
}
