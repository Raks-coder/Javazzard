import java.util.*;
import java.lang.*;
public class string2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        boolean flag=true;
        int length=str.length();
        for(int i=0;i<str.length();i++)
        {
         if(str.charAt(i)==str.charAt(length-1-i)) 
         {
             flag=true;
             System.out.println(str.charAt(i)+" "+str.charAt(length-1-i));
         }
         else{ 
             flag=false;
             System.out.println(str.charAt(i)+" "+str.charAt(length-1-i));
             break;
         }
        }
        if(flag==true)System.out.println("Yes");
        else System.out.println("No");
    }
}
