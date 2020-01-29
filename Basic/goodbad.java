
import java.util.*;
import java.lang.*;

/**
 *
 * @author rakshitmalhotra
 */
/*
A word is called as a good word if all the letters of the word are distinct. That is, all the
letters of the word are different from each other letter. Else, the word is called as a bad 
word. Write Java code to check if the given word is good or bad. START, GOOD,
BETTER are bad: WRONG is good! Make the comparison to be case insensitive. 
*/
public class goodbad {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        boolean flag=true;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j)) 
                {
                    System.out.println("Bad Word "+ i +" "+ j);
                    flag=false;
                    break;
                }
            }
        }
        if(flag==true) System.out.print("Good");
    }
}
