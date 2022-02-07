import java.util.*;

public class odd_even {
    public static void main(String[] args)
    {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if(n%2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}
