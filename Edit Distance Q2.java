/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0)
		{
			String s1=sc.next();
			String s2=sc.next();
 
			int l=s1.length();
			int m=s2.length();
			int a[][]=new int[l+1][m+1];
 
			for(int i=1;i<=l;i++)
			{
				for(int j=1;j<=m;j++)
				{
					if(s1.charAt(i-1)==s2.charAt(j-1))
					  a[i][j]=a[i-1][j-1];
					  else
					  a[i][j]=Math.min(a[i-1][j],Math.min(a[i][j-1],a[i-1][j-1]))+1;
				}
			}
			System.out.println(a[l][m]);
		}
	}
}