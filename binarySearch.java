import java.util.*;
import java.lang.*;
import java.io.*;
//linear search
public class GFG {
	public static void main (String[] args) {
		//code
		int n,key,f=0;
		int l,r,m;
		Scanner s = new Scanner(System.in);
		int testcase = s.nextInt();
		for(int i =0 ; i<testcase ; i++)
		{
		    n = s.nextInt();
		    int[] array = new int[n];
		    key = s.nextInt();
		    for(int j=0 ; j<n ; j++)
		    {
		        array[j] = s.nextInt();
		        
		    }
		    l = 0;
		    r = array.length-1;
		    while(l <= r)
		    {
		        m = (l+r)/2;
		        if(key == array[m])
		        {
		            System.out.println(m+1);
		            f=1;
		            break;
		        }
		    
		    if(key >= m)
		    {
		        l = m+1;
		        
		    }
		    if(key <= m)
		    {
		        r = m-1;
		    }
		}
	    if(f == 0)
	    {
	        System.out.println(-1);
	    }
	f=0;
	}
	}
}
