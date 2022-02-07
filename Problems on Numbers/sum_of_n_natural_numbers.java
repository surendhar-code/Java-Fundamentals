import java.util.*;

public class sum_of_n_natural_numbers {
    public static void main(String[] args)
    {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = in.nextInt();
        System.out.println("The sum of first n natural numbers using mathematical equation : "+ (num*(num+1))/2);

    }
}
