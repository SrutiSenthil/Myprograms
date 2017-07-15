import java.util.*;
import java.lang.*;
import java.io.*;
//linear search
public class GFG {
	public static void main (String[] args) {
		//code
		int n,key,f=0;
		
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
		    for(int j=0 ; j<n ; j++)
		    {
		        if(key == array[j])
		        {
		            System.out.println(j+1);
		            f=1;
		            break;
		        }
		    }
		    if(f == 0)
		    {
		        System.out.println("-1");
		        
		    }
		    f=0;
		}
	
	}
}
