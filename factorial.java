import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int fact=1;
        for(int i=2 ; i<=n ; i++)
        {
            fact *= i;
        }
        System.out.println(fact);
    }
}
