import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equals(rev))
        System.out.print("YES");
        else
        System.out.print("NO");
        
    }
}
