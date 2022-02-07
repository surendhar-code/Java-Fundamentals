
import java.util.*;

public class pos_neg_num {
    public static void main(String[] args)
    {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = in.nextInt();
        if(num>0)
            System.out.println("It is Positive");
        else if(num<0)
            System.out.println("It is Negative");
        else
            System.out.println("The number is Zero");
    }
}



