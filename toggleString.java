import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String sb = sc.next();
        StringBuilder s = new StringBuilder(sb);
        for(int i=0 ; i<s.length() ; i++)
        {
            char c = s.charAt(i);
            if(Character.isUpperCase(c))
            System.out.print(Character.toLowerCase(c));
            else
            System.out.print(Character.toUpperCase(c));
        }
    }
}
