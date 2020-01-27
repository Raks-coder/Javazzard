import java.util.*;
import java.lang.*;
public class factorial_command_line
{
	static int fact(int n)
	{
		int fact=1;
		for(int i=n;i>0;i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		System.out.println(fact(n));
	}
	
}
