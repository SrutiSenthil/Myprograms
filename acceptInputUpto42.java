import java.util.*;

class acceptInputUpto42 {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int in;
        ArrayList<Integer> a = new ArrayList<Integer>();  
        while(true)
        {
            in = s.nextInt();
            if(in == 42)
            break;
            else
            {
                System.out.println(in);
            }
        }
    }
}
