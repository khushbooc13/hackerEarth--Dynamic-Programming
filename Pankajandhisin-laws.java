/*Pankaj is a very intelligent student studying in one of the best colleges of this country. 
He's good enough to challenge the smartest minds in the country, but even the smart ones make 
mistakes and so did Pankaj - he fell in love, ah. He was so deeply in love that he decided to 
propose the love of his life. What he didn't know was the fact that there is a different species 
called the "in-laws" and against them no amount of intelligence, smartness or anything works!

But, this was no ordinary person - this was Pankaj - he decided to take the challenge of his 
in-laws. So, in order to verify the compatibility of the two love birds, they gave them a 
sequence to solve - given a sequence, they had to tell the longest increasing subsequence 
of the given sequence.

But, this was a tricky game - since, any sequence could have multiple increasing subsequences 
of the same length - so, the answer they were giving were different almost all the time, 
which got the young couple worried.

So, in order increase their compatibility Pankaj proposes that instead of telling them the 
sequence, this time the couple would tell them the  of the longest increasing subsequence 
and not the sequence.

To give further twist by the in-laws, they asked Pankaj to answer the length not in 
decimal numbers, but in binary numbers!
*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class Pankajandhisin-laws {
	public static void main (String[] args)throws IOException {
		BufferedReader k=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(k.readLine());
		int a[]=new int[n];
		String s[]=k.readLine().split("\\s+");
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(s[i]);
		int res[]=new int[n];
		for(int i=0;i<n;i++)
		{
			res[i]=1;
		}
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				if(a[j]<a[i])
					res[i]=(int)Math.max(res[j]+1,res[i]);
			}
		}
		int max=0;
		for(int i=0;i<n;i++)
		{
			if(res[i]>max)
				max=res[i];
		}
		String b="";
		//System.out.println(max);
		while(max!=0)
		{
			if(max%2==0)
				b="0"+b;
			else
				b="1"+b;
			max=max/2;
 
		}
		System.out.println(b);
	}
}