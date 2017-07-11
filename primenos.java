
// prime numbers upto n

import java.util.*;

public class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int flag =0;
        int k=2;
        while(k <= N){
        for (int i = 2; i <= k/2 ; i++)
        {
               if(k%i == 0)
               {     flag = 1;
                   break;
                }
        }
        if(flag == 0)
        System.out.print(k+" ");
        flag = 0;
        k++;
        }
        
    }
}
