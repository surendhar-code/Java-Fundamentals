import java.util.*;



public class prime_no_in_a_range {
    public static void main(String[] args)
    {
        int min,max,flag,i,j;
        Scanner in  = new Scanner(System.in);
        min = in.nextInt();
        max = in.nextInt();

        for(i=min;i<max;i++)
        {
            if(i==1 || i==0)
                continue;
            flag=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                System.out.println(i);
        }
    }
}
