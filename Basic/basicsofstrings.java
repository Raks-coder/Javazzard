package string3;

/**
 *  Write a class with the following methods:
wordCount: This method accepts a String object as an argument and returns the number of
words contained in the object.
arrayToString: This method accepts a char array as an argument and converts it to a String
object.
mostFrequent: This method accepts a String object as an argument and returns the character that
occurs the most frequently in the object. 
 *
 * @author rakshitmalhotra
 */
import java.lang.*;
import java.util.*;
public class java {
    
    static void wordCount(String str)
    {
     String arr[]=str.split(" ");
     int count=0;
     for(String i:arr) count++;
     System.out.println("Count is : "+count);
    }
    static void arrayToString(char arr[])
    {
        String str=new String(arr);
        System.out.println("String is :"+str);
    }
    static void mostFrequent(String str)
    {
        int max=0;
        int index=0;
        for(int i=0;i<str.length();i++)
        {
            int count=0;
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==' ')
                {
                    continue;
                }
                if(str.charAt(i)==str.charAt(j))
                {
                  //  System.out.println(str.charAt(i));
                    //System.out.println(count);
                    count++;
                    if(count>max)
                    {max=count;
                    index=i;}
                }
            }
        }
        System.out.println(str.charAt(index));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        wordCount(str);
        char arr[]={'r','a','m','j','i'};
        arrayToString(arr);
        mostFrequent(str);
    }
    
}
