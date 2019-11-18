import java.lang.*;
import java.io.*;
import java.util.*;
public class mobilenumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0)
        {
            String str=sc.next();
            String s1="";
            int temp=0;
            int arr[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',' '};
            int arr1[]={2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,8,8,8,9,9,9,9,0};
            int arr2[]={1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,4,1,2,3,1,2,3,4,1};
            for(int i=0;i<str.length();i++)
            {
                for(int j=0;j<27;j++)
                {
                    if(arr[j]==str.charAt(i))
                    {
                        temp=j;
                        j=27;
                    }
                }
                for(int j=0;j<arr2[temp];j++)
                {
                    s1+=arr1[temp];
                }
            }
            System.out.println(s1);
        }
    }
}
