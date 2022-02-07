import java.util.*;

public class prime_no
{
    public static void main(String[] args)
    {
        int num,i,flag=0;
        Scanner in  = new Scanner(System.in);
        num = in.nextInt();

        for(i=2;i<num;i++)
        {
            if(num%i==0)
            {
                flag=1;
                break;
            }
        }

        if(flag==1)
            System.out.println("Not a Prime NUmber");
        else
            System.out.println("Prime Number");

    }
}