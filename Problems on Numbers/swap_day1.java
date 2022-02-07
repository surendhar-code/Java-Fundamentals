import java.util.*;

public class swap_day1 {
    public static void main(String[] args)
    {
        int n1,n2,temp;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number 1 : ");
        n1  = in.nextInt();
        System.out.println("Enter the number 2 : ");
        n2  = in.nextInt();

        System.out.println("Number1 and Number2 Before Swapping : ");
        System.out.println("Number 1 : "+n1);
        System.out.println("Number 2 : "+n2);

        temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("Number1 and Number2 After Swapping : ");
        System.out.println("Number 1 : "+n1);
        System.out.println("Number 2 : "+n2);



    }
}
