/*

Akshay loves to play with numbers and arrays. He took an array of size " 2n " where n is any positive integer chose by him. He tries to divide the array into n pairs, such that the pair sum minimizes the maximum sum of a pair. For example, say we have an array with the given numbers (9, 6, 1, and 5). The possible pairs are ( 1 , 6 ) , ( 5 , 9 ) or ( 1 , 5 )  , ( 6 , 9 ) or  ( 1 , 9 ) , ( 5 , 6 ). The pair sums for these partitions are ( 7 , 14 ) and ( 6 , 15 ) and ( 10 , 11 )  respectively .  The ideal or the selected pairs are (1, 9), (5, 6 )  because out of all the three cases or possibilities we only have (1, 9), (5, 6 )  where the sum of both pairs is minimum of all the maximum sum of all three possibilities. 
INPUT: 

The first Line contains an integer T denoting the number of test cases.The first line of each test case contains integer n.The second line contains the array of size  2 * n, consisting of positive integers only.
OUTPUT: 
For each test case, the output is the list of ideal pairs in the form (a,b)(c,d) and so on in newline. 
CONSTRAINTS:
1<=T<=150
1<=N<=150
1 <= A[ 2*N ] <= 10^5



*/

import java.util.*;
import java.lang.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]=new int[2*n];
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=0;i<arr.length/2;i++)
            {
                System.out.print("("+arr[i]+","+arr[arr.length-1-i]+")");
            }
            System.out.println();
        }
    }
}
