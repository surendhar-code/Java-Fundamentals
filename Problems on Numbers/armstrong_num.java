
import java.util.*;

public class armstrong_num
{
    public static void main(String[] args)
    {
        int n,pow=0,rem,temp,sum=0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        // calculating power
        temp = n;
        while(temp>0)
        {
            pow++;
            temp=temp/10;

        }

        // armstrong number logic
        temp = n;
        while(temp>0)
        {
            rem = temp%10;
            sum = sum+(int)Math.pow(rem,pow);
            temp = temp/10;
        }

        if(n == sum)
            System.out.println("It is a Armstrong Number");
        else
            System.out.println("It is not a Armstrong Number");


    }
}
