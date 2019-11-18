import java.lang.*;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Stack <Integer> st = new Stack<>();
        int n=sc.nextInt();
        while(n-->0)
        {
            int pos=0;
            String str=sc.next();
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='(')
                {
                    System.out.print(++pos+" ");
                    st.push(pos);
                }
                else if(str.charAt(i)==')')
                {
                    System.out.print(st.peek()+" ");
                    st.pop();
                }
            }
            System.out.println();
        }
    }
}
