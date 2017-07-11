
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ints = new int[n];
        double ans=1;
        for(int i=0 ; i<n ; i++)
        {
            ints[i] = s.nextInt();
            ans = (ans*ints[i])%(Math.pow(10,9)+7);
        }
        System.out.printf("%.0f",ans);
    }
}
