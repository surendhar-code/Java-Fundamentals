import java.util.*;

public class perfect_square {
    public static void main(String[] args)
    {
        int n,i,flag=0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        double square_root;
        square_root = Math.sqrt(n);
        if(square_root*square_root == n)
            System.out.println("It is a Perfect Number");
        else
            System.out.println("It is not a Perfect Number");

    }
}
