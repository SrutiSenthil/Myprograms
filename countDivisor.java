
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int m = s.nextInt();
        int d = s.nextInt();
        int count = 0;
        for(int i=l ; i<=m ; i++)
        {
            if(i%d == 0)
            count += 1;
        }
        System.out.println(count);
    }
}
