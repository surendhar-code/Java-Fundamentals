
// Sum of AP series => Sn = n/2(2a + (n-1)d)

import java.util.*;
public class sum_of_ap_series {
    public static void main(String[] args)
    {
        int n;
        double a,d,sum;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n value : ");
        n = in.nextInt();
        System.out.println("Enter the a value : ");
        a = in.nextDouble();
        System.out.println("Enter the d value : ");
        d = in.nextDouble();
        // sum of AP series
        sum = (n/2.0)*((2.0*a)+((n-1)*d));
        System.out.println("The Sum of AP series for n terms is : "+sum);


    }
}
