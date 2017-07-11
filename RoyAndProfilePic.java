import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int fbsize = s.nextInt();
        int n = s.nextInt();
        int l,b;
        for(int i=0 ; i<n ; i++)
        {
            l = s.nextInt();
            b = s.nextInt();
            if(l >= fbsize && b >= fbsize)
            {
                if(l==b)
                System.out.println("ACCEPTED");
                else
                System.out.println("CROP IT");
            }
            else
            System.out.println("UPLOAD ANOTHER");
        }
       
    }
}
