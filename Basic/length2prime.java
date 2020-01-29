
/**
 *
 * @author rakshitmalhotra
 */
// Given a number ‘n’, write a Java program to count the number of two digit prime
// numbers in it when adjacent digits are taken. For example, if the value of ‘n’ is 114 then
// the two digit numbers that can be formed by taking adjacent digits are 11 and 14. 11 is
// prime but 14 is not. Therefore print 1. Use Boolean static isPrime(int n) method to find
// the given method is a prime number or not. 
import java.util.*;
import java.lang.*;
class prime{
    static boolean isPrime(int n)
    {
        boolean flag=true;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0) 
            {
                flag=false;
                break;
            }
            
            else flag=true;
        }
        return flag;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String number=Integer.toString(n);
        String arr[]=new String[number.length()-1];
        for(int i=0;i<number.length()-1;i++)
        {
            String str=number.substring(i,i+2);
            if(str!=null)arr[i]=str;
        }
        for(String i: arr)
        {
            System.out.println(i);
        }
        for(String i: arr)
        {
                int num=Integer.parseInt(i);
                if(isPrime(num))System.out.println(i+" is a Prime number");
                else System.out.println(i+" is not Prime");
        }

    }
}
