// Write the following two methods under an interface Number
// // Return the reversal of an integer, i.e. reverse(456) returns 654
// public static int reverse(int number) // Return true if number is palindrome
// public static boolean isPalindrome(int number)
// Use the reverse method to implement isPalindrome. 
// A number is a palindrome if its reversal is the same as itself. 
// Write a test program to implement the interface Number and prompts the user to enter an integer and reports whether the integer is a palindrome.
import java.lang.*;
import java.util.*;
interface Number{
    int reverse();
    boolean isPalindrome();
}
abstract class Rakshit implements Number
{
    static int reverse(int n)
    {
        int temp=n;
        int rem;
        int sum=0;
        while(temp!=0)
        {
            rem=temp%10;
            sum=sum*10+rem;
            temp/=10;
        }
        return sum;
    }
   static boolean isPalindrome(int n)
    {
        if(reverse(n)==n) return true;
        else return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(reverse(n));
        System.out.println(isPalindrome(n));
    }
}